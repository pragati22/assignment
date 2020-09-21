/**
 * 
 */
package com.training.model;

import java.io.Serializable;

/**
 * @author SANSKRITI
 *
 */
public class CreditCard implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 12L;
	private long creditCardNumber;
	private String cardHolderName;
	private int expiryYear;
	private transient int creditLimit;
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(long creditCardNumber, String cardHolderName, int expiryYear, int creditLimit) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.cardHolderName = cardHolderName;
		this.expiryYear = expiryYear;
		this.creditLimit = creditLimit;
	}
	public long getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardHolderName == null) ? 0 : cardHolderName.hashCode());
		result = prime * result + (int) (creditCardNumber ^ (creditCardNumber >>> 32));
		result = prime * result + expiryYear;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCard other = (CreditCard) obj;
		if (cardHolderName == null) {
			if (other.cardHolderName != null)
				return false;
		} else if (!cardHolderName.equals(other.cardHolderName))
			return false;
		if (creditCardNumber != other.creditCardNumber)
			return false;
		if (expiryYear != other.expiryYear)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return  creditCardNumber + ","  +  cardHolderName
				+ "," + expiryYear ;
	}
	
	

}
