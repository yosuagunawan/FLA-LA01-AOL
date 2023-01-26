package main;

import java.util.Scanner;

import post.Post;
import singleton.History;
import template.JPG;
import template.PNG;
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
		
		String picture = "";
		int height;
		int width;
		int dpi;
		
		do {
			System.out.println("Picture: ");
			picture = scan.nextLine();
		}while(!picture.equalsIgnoreCase("JPG")&&
			   !picture.equalsIgnoreCase("PNG"));
		do {
			System.out.println("Height: ");
			height = scan.nextInt();scan.nextLine();
		}while(height < 100 || height > 10_000);
		do {
			System.out.println("Width: ");
			width = scan.nextInt();scan.nextLine();
		}while(width < 100 || width > 10_000);
		do {
			System.out.println("DPI: ");
			dpi = scan.nextInt();scan.nextLine();
		}while(dpi < 10 || dpi > 1_000);
		
		if(picture.equals("JPG")) {			
			Post post = new Post(title,content,postadapter.themeCreate(theme),new JPG(height,width,dpi));
			History history = History.getInstance();
			history.add(post);
		}else if(picture.equals("PNG")) {			
			Post post = new Post(title,content,postadapter.themeCreate(theme),new PNG(height,width,dpi));
			History history = History.getInstance();
			history.add(post);
		}
	}
	
	public void view() {
		History history = History.getInstance();
		history.show();
	}
	
	public void update() {
		System.out.println("update");
	}
	
	public void delete() {
		History history = History.getInstance();
		history.remove();;
	}
	
	public void input() {
		int choose = 0;
		do {
			view();
			System.out.println("What do you want to do " + name + " ? (^ o ^)");
			System.out.println("1. Make a Post");
			System.out.println("2. Update a Post");
			System.out.println("3. Delete a Post");
			System.out.print(">> ");
			choose = scan.nextInt();scan.nextLine();
			switch (choose) {
			case 1:
				create();
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
			}
		}while(choose!=4);
	}
	
	public void logOut() {
		System.out.println("Thank you for using BinusBoard, Have a great day (>_<)/");
	}
}
