package singleton;

import java.util.Scanner;
import java.util.Vector;

import iterator.Iterator;
import post.Post;
import user.PostAdapter;

public class History implements Iterator<Post>{
	
	Scanner scan = new Scanner(System.in);
	private static History history;
	private Vector<Post> post = new Vector<>();
	private int cur;
	public static History getInstance() {
		if(history==null) {
			history = new History();
		}
		return history;
	}
	
	public History() {
		super();
		this.post = new Vector<Post>();
		this.cur = 0;
	}

	public void add(Post posts) {
		post.add(posts);
	}
	
	public void remove() {
		if(post.isEmpty()) {
			System.out.println("Empty!!!");
		}else{
			String deleteByTitle;
			System.out.println("Post to delete by Title: ");
			deleteByTitle = scan.nextLine();
			do {
				Post p = post.get(cur);
				if(deleteByTitle.equals(p.getTitle())) {
					post.remove(cur);
				}
			} while(getNext() != null);
		}
		this.cur = 0;
	}
	
	public void update(String userType) {
		PostAdapter postadapter = new PostAdapter();
		if(post.isEmpty()) {
			System.out.println("Empty!!!");
		}else{
			String updateByTitle;
			System.out.println("Post to update by Title: ");
			updateByTitle = scan.nextLine();
			do {
				Post p = post.get(cur);
				if(updateByTitle.equals(p.getTitle())) {
					String content = "";
					do {
						System.out.println("Content: ");
						content = scan.nextLine();
						p.setContent(content);;
					} while(content.length()<1||content.length()>postadapter.wordmax(userType));
				}
			} while(getNext() != null);
		}
	}
	
	public void show() {
		if(post.isEmpty()) {
			System.out.println();
			System.out.println("Empty");
			System.out.println();
			return;
		}
		do {
			Post p = post.get(cur);
			System.out.println("Title : "+p.getTitle());
			System.out.println("Content : "+p.getContent());
			System.out.println("Theme : "+p.getTheme().getThemeType());
			System.out.println("========================================");
			System.out.println("Background : "+p.getTheme().getBackground());
			System.out.println("Border : "+p.getTheme().getBorder());
			System.out.println("Icon : "+p.getTheme().getIcon());
			System.out.println("Music : "+p.getTheme().getMusic());
			System.out.println("========================================");
			System.out.println("Picture Height : "+p.getPicture().getHeight());
			System.out.println("Picture Width: "+p.getPicture().getWidth());
			System.out.println("Picture DPI: "+p.getPicture().getDpi());
			System.out.println();
			System.out.println();
			System.out.println();
		} while(getNext() != null);
	}

	@Override
	public Post getNext() {
		// TODO Auto-generated method stub
		if(hasNext()) {
			return post.get(++cur);
		}
		cur = 0;
		return null;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(cur + 1 < post.size()) return true;
		return false;
	}
}
