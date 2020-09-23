

import java.util.ArrayList;
import java.util.List;

import com.training.ifaces.PatientServices;

import com.training.model.Patient;


public class PatientServiceImpl implements PatientServices {

	List<Patient> patientList=new ArrayList<Patient>();
	Patient patient=new Patient();
	
	
	public List<Patient> addPatientToList(Patient patient) {
	patientList.add(patient);
	return patientList;
}


	@Override
	public List<Patient> viewPatientList() {
		// TODO Auto-generated method stub
		return patientList;
	}


	@Override
	public boolean removePatient(int id) {
		// TODO Auto-generated method stub
		boolean status;
		if(id==patient.getPatientId()){
			patientList.remove(patient);
		status= true;
		}
		else {
			System.out.println("NO MATCHING ID AVAILABLE");
			status= false;
		}
		return status;
	}


	@Override
	public Patient viewPatient(int id) {
		// TODO Auto-generated method stub
		Patient found=new Patient();
		
		if(id==patient.getPatientId()) {
			found=patient;
		}
		
		return found;
	}
}
