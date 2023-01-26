package singleton;

import java.util.Vector;

import post.Post;

public class History {
	
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
			System.out.println("Picture : "+p.getPicture());
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}
}
