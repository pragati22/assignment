package com.training;

import java.io.File;
import java.util.Scanner;

import com.training.model.CreditCard;
import com.training.service.BusinessService;
import com.training.service.ClientDetails;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessService service = new BusinessService();
		Scanner sc= new Scanner(System.in);
		String path = null;
		int choice;
		
		CreditCard card1 = new CreditCard(1212121,"RON",2020,2000);
		CreditCard card2 = new CreditCard(1231231,"SONAM",2023,4400);
		CreditCard[] cards = {card1,card2};
		
		do{
		service.menu();
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("ENTER PATH");
			path = sc.next();
			service.writeFile(cards,path);
			break;
			
		case 2:
			service.writeObject(cards);
			break;
			
		case 3:
			CreditCard[] entity2=service.readFile(path);
			System.out.println("ENTER NAME OF CARD HOLDER");
			for(CreditCard card:entity2) {
	
				System.out.println(card.toString());
			}
				
				break;
		
		case 4:
			CreditCard[] entity=service.readObject();
			for(CreditCard card:entity) {
				
				System.out.println(card.toString());
				
			}
			
			break;
			
		case 5:
			String name=sc.next();
			CreditCard[] entity3=service.delete(cards, name);
			for(CreditCard card:entity3) {
				System.out.println("CARD DETAILS");
				System.out.println(card.toString());
			}
			
		}
		}while(choice!=0);
		
		
		
	
		}

}
