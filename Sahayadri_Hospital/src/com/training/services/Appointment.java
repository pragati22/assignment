package com.training.services;
import java.util.*;

import com.training.model.Doctor;
import com.training.model.Patient;

public class Appointment {
	
	//this class maps doctor and patient
	
	HashMap<Doctor,Set<Patient>> doctorPatienTable ;
	

	public Appointment() {
		super();
		this.doctorPatienTable = new HashMap<Doctor,Set<Patient>>();
	}


	public HashMap<Doctor, Set<Patient>> getDoctorPatienTable() {			//to get hashmap
		return doctorPatienTable;
	}


	public void setDoctorPatienTable(HashMap<Doctor, Set<Patient>> doctorPatienTable) {			//to set hashmap
		this.doctorPatienTable = doctorPatienTable;
	}
	
	
}
