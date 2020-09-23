

import java.util.ArrayList;
import java.util.List;

import com.training.ifaces.DoctorServices;
import com.training.model.Doctor;

public class DoctorServiceImpl implements DoctorServices {

	List<Doctor> doctorList=new ArrayList<Doctor>();
	Doctor doctor=new Doctor();
	
	@Override
	public List<Doctor> addDoctorToList(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorList.add(doctor);
		return doctorList;
	}

	@Override
	public Doctor viewDoctor(int id) {
		// TODO Auto-generated method stub
		Doctor found=new Doctor();
		
		if(id==doctor.getDocId()) {
			found=doctor;
		}
		
		return found;
	}

	@Override
	public boolean removeDoctor(int id) {
		// TODO Auto-generated method stub
		boolean status;
		if(id==doctor.getDocId()){
			doctorList.remove(doctor);
		status= true;
		}
		else {
			System.out.println("NO MATCHING ID AVAILABLE");
			status= false;
		}
		return status;
	}


	@Override
	public List<Doctor> viewDoctorList() {
		// TODO Auto-generated method stub
		return doctorList;
	}
}
