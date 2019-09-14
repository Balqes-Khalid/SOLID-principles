
public class Doctor extends Employee{
	Doctor(long id ,	String name,String department,boolean working){
		super(id ,	name, department, working);
		System.out.println("Doctor calling");
		}

	@Override
	public void performDuties() {
		prescribeMedicine();
		diagnosPatient();
		
	}

		public void prescribeMedicine() {
			System.out.println("Doctor prescribeMedicine() calling");
		}

		public void diagnosPatient() {
			System.out.println("Doctor diagnosPatient() calling");
		}
}
