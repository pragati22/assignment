

import java.util.List;

import com.training.model.Patient;


public interface PatientServices {

	List<Patient> viewPatientList();
	boolean removePatient(int id);
	List<Patient> addPatientToList(Patient Patient);
	Patient viewPatient(int id);
}
