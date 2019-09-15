
public class Nurse extends Employee {
	Nurse(long id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Nurse calling");
	}
}
