package com.training;

public class Book {
	
	private int bookNumber;
	private double price;
	private String bookName;
	private String publisherName;
	private String authorName;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bookNumber, double price, String bookName, String publisherName, String authorName) {
		super();
		this.bookNumber = bookNumber;   //blue-arguments grey-parameters set
		this.price = price;
		this.bookName = bookName;
		this.publisherName = publisherName;		//publishername
		this.authorName = authorName;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	
    

}