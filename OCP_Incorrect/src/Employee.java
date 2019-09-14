
public class Employee {
	long id;
	String name;
	String department;
	boolean working;

	Employee(long id, String name, String department, boolean working) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.working = working;
		System.out.println("Employee calling");
	}

}
