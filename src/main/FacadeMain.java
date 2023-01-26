package main;

import java.util.Scanner;

import post.Post;
import singleton.History;
import user.PostAdapter;

public class FacadeMain {
	
	Scanner scan = new Scanner(System.in);
	String name;
	String userType;

	public void logIn() {
		System.out.println("Hello Welcome to BinusBoard");
		System.out.println("===========Login===========");
		System.out.print("Input Name: ");
		name = scan.nextLine();
		System.out.println("Welcome Back " + name);
		do {
			System.out.println("User Type: ");
			userType = scan.nextLine();
		}while(!userType.equalsIgnoreCase("Standard")&&
			   !userType.equalsIgnoreCase("Gold")&&
			   !userType.equalsIgnoreCase("VIP"));
	}
	
	public void create() {
		String title;
		String content;
		String theme = null;
		String picture;
		
		PostAdapter postadapter = new PostAdapter();
		
		do {
			System.out.println("Title: ");
			title = scan.nextLine();
		}while(title.length()<1||title.length()>100);
		do {
			System.out.println("Content: ");
			content = scan.nextLine();
		}while(content.length()<1||content.length()>postadapter.wordmax(userType));
		
		
		if(userType.equals("Standard")) {
			do {
				System.out.println("Theme: ");
				theme = scan.nextLine();
			}while(!theme.equalsIgnoreCase("Serenity")&&
				   !theme.equalsIgnoreCase("Party")&&
				   !theme.equalsIgnoreCase("Heroes")&&
				   !theme.equalsIgnoreCase("Gold"));
		}else if(userType.equals("Gold")) {
			do {
				System.out.println("Theme: ");
				theme = scan.nextLine();
			}while(!theme.equalsIgnoreCase("Serenity")&&
				   !theme.equalsIgnoreCase("Party")&&
				   !theme.equalsIgnoreCase("Heroes")&&
				   !theme.equalsIgnoreCase("Gold"));
		}else if(userType.equals("VIP")) {
			do {
				System.out.println("Theme: ");
				theme = scan.nextLine();
			}while(!theme.equalsIgnoreCase("Serenity")&&
				   !theme.equalsIgnoreCase("Party")&&
				   !theme.equalsIgnoreCase("Heroes")&&
				   !theme.equalsIgnoreCase("VIP"));
		}
		
		do {
			System.out.println("Picture: ");
			picture = scan.nextLine();
		}while(picture.length()<1||picture.length()>1000);
		
		Post post = new Post(title,content,postadapter.themeCreate(theme),picture);
		History history = History.getInstance();
		history.add(post);
	}
	
	public void view() {
		History history = History.getInstance();
		history.show();
	}
	
	public void input() {
		String yesorno;
		do {
			view();
			System.out.println("Do you want to create post " + name + "(^ o ^) [ Y | N ] (Case Insensetive)");
			yesorno = scan.nextLine();
			if(yesorno.equalsIgnoreCase("Y")) {
				create();
			}else {
				break;
			}
		}while(yesorno.equalsIgnoreCase("Y"));
	}
	
	public void logOut() {
		System.out.println("Thank you for using BinusBoard, Have a great day (>_<)/");
	}
}
