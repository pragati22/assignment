package com.training.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Reader;

import javax.swing.text.AbstractDocument.LeafElement;

import com.training.model.CreditCard;

public class BusinessService {

	public boolean writeObject(CreditCard[] card) {
		// TODO Auto-generated method stub
	
		boolean persisted=false;
		ObjectOutputStream outStream = null;
		
		try {
			outStream = new ObjectOutputStream(new FileOutputStream(new File("CustomerDatabase.ser")));
			
			outStream.writeObject(card);
			
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

	
	public CreditCard[] readObject() {
		// TODO Auto-generated method stub
		CreditCard[] cards = null;
		
		ObjectInputStream instream = null;
		
		try {
			instream = new ObjectInputStream(new FileInputStream(new File("CustomerDatabase.ser")));
			
			cards=(CreditCard[])instream.readObject();
				
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
		
		return cards;
	}
	
	public boolean writeFile(CreditCard[] card,String path) {
				
		boolean persisted=false;
		PrintWriter writer=null;   
		
		try {
			writer=new PrintWriter(new FileWriter(path+"Cards.txt"));
		
			for(CreditCard entity:card) {
				writer.println(entity.getCreditCardNumber());
				writer.println(entity.getCardHolderName());
				writer.println(entity.getExpiryYear());
				writer.println(entity.getCreditLimit());
				
			}
			persisted=true;
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
		
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return persisted;
	}
	
	
	public CreditCard[] readFile(String path) {
	
		CreditCard[] cards = new CreditCard[2];
	
		BufferedReader in = null;
		
		try {
			in = new BufferedReader(new FileReader( path+"Cards.txt" ));
			int character;
			String allCards="";
			
			while((character=in.read())!=-1){
				allCards=allCards+(char)character;
			}
			System.out.println(allCards);

			String split[]=allCards.split(",");
			int count=0;
			if(split!=null){
			for( int i=0;i<cards.length;i++) {
			   CreditCard card = new CreditCard();

			   card.setCardHolderName(split[count++]);
			   card.setCreditCardNumber(Long.parseLong(split[count++]));
			   card.setCreditLimit(Integer.parseInt(split[count++]));
			   card.setExpiryYear(Integer.parseInt(split[count++]));
			 
			   cards[i]=card;
			}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				in.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
		}
		
		return cards;
			
	}
	
	public CreditCard[] delete(CreditCard[] cards,String name)
	{
		int pos=0;
		
		for(int i =0 ; i<cards.length ; i++) {
			if(cards[i].getCardHolderName().equals(name)) {
				pos=i;
			}
		}
		CreditCard[] newCards = new CreditCard[cards.length-1];
		int count=0;
		for(int i =0 ; i<cards.length ; i++) {
			if(i!=pos) {
				newCards[count++]=cards[i];
		}
		}
		return newCards;
		
	}
	public void menu() {
		System.out.println("ENTER 1 to give PATH ");
		System.out.println("ENTER 2 to use default PATH");
		System.out.println("ENTER 3 to read ALL file from specified path ");
		System.out.println("ENTER 4 to read from default PATH");
		System.out.println("Enter 5 to Delete details ");
		System.out.println("PRESS 0 TO EXIT");
	}

}
