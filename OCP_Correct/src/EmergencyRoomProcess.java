
public class EmergencyRoomProcess {

	public static void main(String ...args) {
		HospitalManagment hospitalManagment = new HospitalManagment();
		Nurse ahmad = new Nurse(1, "ahmad", "Children", true);
		Doctor mohammed = new Doctor(2, "mohammed", "Children", true);
		hospitalManagment.callUpon(ahmad);
		hospitalManagment.callUpon(mohammed);
	}
}
