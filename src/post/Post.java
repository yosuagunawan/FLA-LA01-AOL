package post;

import builder.Theme;

public class Post {
	
	private String title;
	private String content;
	private Theme theme;
	private String picture;
	
	public Post(String title, String content, Theme theme, String picture) {
		super();
		this.title = title;
		this.content = content;
		this.theme = theme;
		this.picture = picture;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Theme getTheme() {
		return theme;
	}
	public void setTheme(Theme theme) {
		this.theme = theme;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
}
