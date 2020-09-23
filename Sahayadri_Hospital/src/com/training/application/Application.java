package com.training.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.training.model.Doctor;
import com.training.model.Patient;
import com.training.services.HospitalServicesImpl;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Doctor> doctorList = new ArrayList<>();
		List<Doctor> patientList = new ArrayList<>();
		
		
		Scanner sc = new Scanner(System.in);
		
		//Doctor objects 
		Doctor ram = new Doctor(101,"RAM");
		Doctor sham = new Doctor(102,"SHAM");
		Doctor raju = new Doctor(103,"RAJU");
		
		//Patient objects
		Patient ramu = new Patient(201,"RAMU");
		Patient shamu = new Patient(202,"SHAMU");
		Patient rajesh= new Patient(203,"RAJESH");
		Patient dee= new Patient(204,"DEE");
		Patient jack= new Patient(205,"Jack");
		
	
		//main implementation to book appointment
		HospitalServicesImpl apt=new HospitalServicesImpl();
		
		int k;
		do{
		
		System.out.println("WELCOME TO SAHAYADRI HOSPITAL");
		
		System.out.println("1.BOOK APPOINTMENT");
		System.out.println("2.CANCEL APPOINTMENT");
		System.out.println("3.VIEW APPOINTMENT");
		 k=sc.nextInt();
		switch(k) {
			
		case 1:
			apt.bookAppointment(ram, ramu);
			apt.bookAppointment(sham, shamu);
			apt.bookAppointment(ram, rajesh);
			apt.bookAppointment(raju, dee);
			apt.bookAppointment(raju, jack);
			
		case 2:
			apt.cancelAppointment(ram, ramu);
			
		case 3:
			Set<Patient> patients=apt.viewApointment("raju");
			System.out.println(patients.toString());
			
		}
		}while(k!=0);
		
		
		
		
		
		

	}

}
