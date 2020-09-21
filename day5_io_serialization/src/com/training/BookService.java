package com.training;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectInputValidation;
import java.io.ObjectOutputStream;

public class BookService {

	public boolean writeObject(Book book)  {
		boolean persisted=false;
		ObjectOutputStream outStream = null;
		
		try {
			outStream = new ObjectOutputStream(new FileOutputStream(new File("book.ser")));
			
			outStream.writeObject(book);
			
			persisted=true;
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			try {
				outStream.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		return persisted;
	}
	
	public Book readObject() {
		
		Book book = null;
		
		ObjectInputStream instream = null;
		
		try {
			instream = new ObjectInputStream(new FileInputStream(new File("book.ser")));
			
			book=(Book)instream.readObject();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				instream.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
		}
		
		return book;
	}
	
	public boolean writeWithDataStream(Book book,File file) {
	
		boolean persisted=false;
		DataOutputStream outStream= null;
		
		try {
			 outStream=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			
			outStream.writeInt(book.getBookNumber());
			outStream.writeUTF(book.getBookName());
			outStream.writeUTF(book.getAuthorName());
			outStream.writeDouble(book.getPrice());
			persisted=true;
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
		
			e.printStackTrace();
		}finally {
			try {
				outStream.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		
		return persisted;
	}
	
public Book readWithDataStream(File file) {
	Book book = new Book();
	DataInputStream instream = null;
	
	try {
		instream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
		
		book.setBookNumber(instream.readInt());
		book.setBookName(instream.readUTF());
		book.setAuthorName(instream.readUTF());
		book.setPrice(instream.readDouble());
		
			
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
			instream.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	return book;
		
	}
}
