package OOPConcepts_Inheritance;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b=new BMW();
		b.start();
		b.refuel();
		b.stop();
		b.autoParking();
		b.airBags();
		b.engine();
		//calling static methods using Class name
		BMW.testing();
		Car.testing();
		
		//calling car methods/parent class
		Car c=new Car();
		c.start();
		c.refuel();
		c.stop();
		
		//Top casting/up casting
		Car c1=new BMW();
		c1.start();
		c1.refuel();
		c1.stop();
		
		
		
		
		
		

	}

}
