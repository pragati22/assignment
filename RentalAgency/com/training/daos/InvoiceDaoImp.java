package com.training.daos;

import com.training.iface.*;
import com.training.util.ComparatorByName;
import com.training.util.ComparatorByNumber;
import com.training.daos.*;
import com.training.entity.*;
import java.util.*;

public class InvoiceDaoImp implements InvoiceDAO {

	private List<Invoice> invList;
	
	public InvoiceDaoImp() {
		super();
		this.invList = new ArrayList<Invoice>();
	}

	@Override
	public Collection<Invoice> findAll() {
		
		return invList;
	}

	@Override
	public boolean add(Invoice entity) {
		
		return this.invList.add(entity);
	}

	@Override
	public Invoice findById(int id,Collection<Invoice> invList) {
	
				return null;
	}

	@Override
	public boolean add(Invoice... invoices) {
		// TODO Auto-generated method stub
		boolean result = false;
		for (Invoice invoice : invoices) {
			add(invoice);
			result=true;
		}
		return result;
	}

	@Override
	public boolean remove(Invoice enity) {
		// TODO Auto-generated method stub
		return this.invList.remove(enity);
	}

	@Override
	public Collection<Invoice> sortedByInvoiceNumber() {
		// TODO Auto-generated method stub
		
		Collections.sort(this.invList);
		return this.invList;
	}

	@Override
	public Collection<Invoice> sortedBy(String propName) {
		// TODO Auto-generated method stub
		do {
			
			System.out.println("ENTER NAME TO SORT BY NAME");
			System.out.println("ENTER NUMBER TO SORT BY NAME");
			System.out.println("ENTER NO TO EXIT");
		switch(propName) {
		case "Name":
			ComparatorByName name = new ComparatorByName();
			Collections.sort(invList,name);
			break;
		case "Number":
			ComparatorByNumber number = new ComparatorByNumber();
			Collections.sort(invList,number);
			break;
			
		}}while(propName.equals("NO"));
		return this.invList;
		
	}

	@Override
	public Comparator<Invoice> getComparator(int key) {
		// TODO Auto-generated method stub
		switch(key) {
		case 1: return new ComparatorByName();
		case 2: return new ComparatorByNumber();
		default: return null;
		}
		
	}
	
	

}
