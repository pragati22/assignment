package com.training.service;

import java.util.Scanner;

import com.training.model.CreditCard;

public class ClientDetails {
	
	CreditCard card = new CreditCard();
	CreditCard[] cards;
	Scanner sc = new Scanner(System.in);

	public CreditCard[] enterDetails(int count) {
		
	for(int i=0;i<count;i++) {
	System.out.println("ENTER THE FOLLOWING DETAILS:");
	System.out.println("CARD NUMBER :");
	int cardNumber =sc.nextInt();
	card.setCreditCardNumber(cardNumber);
	System.out.println("CARD HOLDER NAME :");
	String name=sc.next();
	card.setCardHolderName(name);
	System.out.println("EXPIRY YEAR :");
	int year=sc.nextInt();
	card.setExpiryYear(year);
	System.out.println("CARD LIMIT :");
	int limit=sc.nextInt();
	System.err.println(card.toString());
	
	
	
	}
	for(int i=0;i<count;i++) {
		cards=new CreditCard[count];
		cards[i]=card;
		}
	
	return cards;
	}

}
