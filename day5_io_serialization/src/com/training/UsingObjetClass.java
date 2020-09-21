package com.training;

public class UsingObjetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book java = new Book(101,"Head First Java",450,"Kathy");
		Book java2 = new Book(101,"Head First Java",450,"Kathy");
		System.out.println(java.equals(java2));
		Book java3=java;
		System.out.println(java3.equals(java));

	}

}
