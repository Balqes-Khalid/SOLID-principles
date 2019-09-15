
public class HospitalManagment {
	public void callUpon(Employee employee) {
		if (employee instanceof Nurse) {
			checkValidSigns();
			drawBlood();
			cleanPatientArea();
		}
		if (employee instanceof Doctor) {
			prescribeMedicine();
			diagnosPatient();
		}
	}
	//Nurse
	public void checkValidSigns() {
		System.out.println("Nurse checkValidSigns() calling");
	}

	public void drawBlood() {
		System.out.println("Nurse drawBlood() calling");
	}

	public void cleanPatientArea() {
		System.out.println("Nurse cleanPatientArea() calling");
	}
	//Doctor
	public void prescribeMedicine() {
		System.out.println("Doctor prescribeMedicine() calling");
	}

	public void diagnosPatient() {
		System.out.println("Doctor diagnosPatient() calling");
	}
}
