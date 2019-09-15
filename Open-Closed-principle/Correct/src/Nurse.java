
public class Nurse extends Employee {
	Nurse(long id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Nurse calling");
	}
	
	public void checkValidSigns() {
		System.out.println("Nurse checkValidSigns() calling");
	}

	public void drawBlood() {
		System.out.println("Nurse drawBlood() calling");
	}

	public void cleanPatientArea() {
		System.out.println("Nurse cleanPatientArea() calling");
	}

	@Override
	public void performDuties() {
		checkValidSigns();
		drawBlood();
		cleanPatientArea();
		
	}
}
