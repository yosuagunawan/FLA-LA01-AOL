package singleton;

import java.util.Scanner;
import java.util.Vector;

import post.Post;
import user.PostAdapter;

public class History {
	
	Scanner scan = new Scanner(System.in);
	private static History history;
	Vector<Post> post = new Vector<>();
	
	public static History getInstance() {
		if(history==null)
			history = new History();
		return history;
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
			for(int i = 0; i<post.size(); i++) {
				if(deleteByTitle.equals(post.get(i).getTitle())) {
					post.remove(i);
				}else {
					continue;
				}
			}
		}
	}
	
	public void update(String userType) {
		PostAdapter postadapter = new PostAdapter();
		if(post.isEmpty()) {
			System.out.println("Empty!!!");
		}else{
			String updateByTitle;
			System.out.println("Post to update by Title: ");
			updateByTitle = scan.nextLine();
			for(Post p: post) {
				if(updateByTitle.equals(p.getTitle())) {
					String content = "";
					do {
						System.out.println("Content: ");
						content = scan.nextLine();
						p.setContent(content);;
					}while(content.length()<1||content.length()>postadapter.wordmax(userType));
				}else {
					continue;
				}
			}
		}
	}
	
	public void show() {
		if(post.isEmpty()) {
			System.out.println();
			System.out.println("Empty");
			System.out.println();
		}
		for(Post p : post) {
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
		}
	}
}
