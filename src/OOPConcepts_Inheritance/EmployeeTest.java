package OOPConcepts_Inheritance;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee();
		e1.setName("Venu");
		e1.setAge(33);
		e1.setCity("Piler");
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getCity());
		
		Employee e2=new Employee("Ved", 6, "Bangalore");
		System.out.println(e2.getName());
	}

}
