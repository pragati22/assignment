package com.training.ifaces;


import java.util.List;
import java.util.Map;
import java.util.Set;

import com.training.model.Doctor;
import com.training.model.Patient;


public interface HospitalServices {
	
	boolean bookAppointment(Doctor doctor,Patient patient);
	Set<Patient> cancelAppointment(Doctor doctor,Patient patient);
	Set<Patient> viewApointment(String name);
	
	

}
