

import java.util.List;

import com.training.model.Doctor;

public interface DoctorServices {
	
	List<Doctor> viewDoctorList();
	boolean removeDoctor(int id);
	List<Doctor> addDoctorToList(Doctor doctor);
	Doctor viewDoctor(int id);
	

}
