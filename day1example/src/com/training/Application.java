package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greeting grObj = new Greeting();
		
		System.out.println(grObj.getMessage());
		
		Book headFirst = new Book();
		
		headFirst.setBookNumber(1010);
		headFirst.setBookName("Head First Java");
	
		Book spring = new Book(2020,456,"Hello world","degreed","Manoj");
		
		System.out.println(spring.getBookName());
		System.out.println(spring.getPrice());
		
		System.out.println(headFirst.getBookName());
	}

}