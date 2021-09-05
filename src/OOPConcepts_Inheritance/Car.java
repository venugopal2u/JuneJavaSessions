package OOPConcepts_Inheritance;

public class Car extends Vehicle{
	
	public Car() {
		System.out.println("Default Car constructor");
	}
	
	public void start() {
		System.out.println("Car------Start");
	}
	public void refuel() {
		System.out.println("Car---refuel");
	}
	public void stop() {
		System.out.println("Car-----Stop");
	}
	public  static void testing() {
		System.out.println("Car------testing");
	}

}
