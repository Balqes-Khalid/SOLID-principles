
public class Doctor extends Employee{
	Doctor(long id ,	String name,String department,boolean working){
		super(id ,	name, department, working);
		System.out.println("Doctor calling");
		}

}
