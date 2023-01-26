package main;

import java.util.Scanner;
import java.util.Vector;

import builder.Theme;
import builder.ThemeBuilder;
import director.Director;
import post.Post;
import singleton.History;
import user.PostAdapter;

public class Main {

	Scanner scan = new Scanner(System.in);
	FacadeMain facade = new FacadeMain();
	
	public Main() {
//		LogIn
		facade.logIn();
//		Input
		facade.input();
//		LogOut
		facade.logOut();
	}

	public static void main(String[] args) {
		new Main();
	}

}
