package com.training;

import java.io.File;

public class Application {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Book java = new Book(101,"Head First Java",450,"Subhash");
		
		BookService service=new BookService();
		
		boolean result= service.writeWithDataStream(java, new File ("book.txt"));
		
		if(result) {
			System.out.println("Book persisted");
			
		}
		else {
			System.out.println("Error-Check");
		}
		Book cpp=new Book();
		
		cpp=service.readWithDataStream(new File("book.txt"));
		System.out.println(cpp.toString());

	}

}
