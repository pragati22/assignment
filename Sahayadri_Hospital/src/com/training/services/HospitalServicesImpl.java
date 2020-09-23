package com.training.services;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.training.ifaces.HospitalServices;
import com.training.model.Doctor;
import com.training.model.Patient;

public class HospitalServicesImpl implements HospitalServices {

	HashMap<Doctor,Set<Patient>> doctorPatienTable ;
	
	public HospitalServicesImpl() {
		super();
		Appointment appointment = new Appointment();
		doctorPatienTable=appointment.getDoctorPatienTable();
		
	}

//tp book appointment
	@Override
	public boolean bookAppointment(Doctor doctor, Patient patient) {
		// TODO book appointment for patient
		if(doctorPatienTable == null) {
			return false;
		}
		if((doctorPatienTable.containsKey(doctor)&&(doctorPatienTable.get(doctor)!=null))){
			Set<Patient> patients=doctorPatienTable.get(doctor);
			patients.add(patient);
			doctorPatienTable.put(doctor, patients);
			return true;
			
		}
		else {
			Set<Patient> patients = new HashSet<Patient>();
			patients.add(patient);
			doctorPatienTable.put(doctor, patients);
			return true;
		}
		
	}

	//to cancel appointmet
	@Override
	public Set<Patient> cancelAppointment(Doctor doctor, Patient patient) {
		// TODO Auto-generated method stub
		
			Set<Patient> patients=doctorPatienTable.get(doctor);
			patients.remove(patient);
			return patients;
	
	}

	//to view appointment
	@Override
	public Set<Patient> viewApointment(String name) {
		// TODO Auto-generated method stub
		Set<Map.Entry<Doctor, Set<Patient>>> set = doctorPatienTable.entrySet();
		
		for(Entry<Doctor, Set<Patient>> eachEntry : set) {
			Doctor doctor=eachEntry.getKey();
			if(doctor.getDocName().equalsIgnoreCase(name)) {
				return eachEntry.getValue();
			}
			
		
		}
		return null;
	}

	
}
