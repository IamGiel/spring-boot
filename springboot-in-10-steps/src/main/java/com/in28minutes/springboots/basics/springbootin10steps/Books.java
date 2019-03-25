package com.in28minutes.springboots.basics.springbootin10steps;

public class Books {
	
	Long id;
	String Title;
	String Author;
	
	
	public Books(Long id, String title, String author) {
		super();
		this.id = id;
		Title = title;
		Author = author;
	}
	
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return Title;
	}
	public String getAuthor() {
		return Author;
	}
	
	@Override
	public String toString() {
		return "Books [id=" + id + ", Title=" + Title + ", Author=" + Author + "]";
	}
	

}
