package com.gel.springboot.basics.gelspringbootbasics;

public class Books {
	
	Long id;
	String Title;
	String Author;
	
	
	public Books(long i, String title, String author) {
		super();
		this.id = i;
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
