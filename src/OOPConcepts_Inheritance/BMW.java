package OOPConcepts_Inheritance;

public class BMW extends Car{
	
	public BMW() {
		System.out.println("BMW constructor");
	}
	
	@Override
	public void start() {
		System.out.println("BMW -----Start");
	}
	@Override
	public void stop() {
		System.out.println("BMW-----Stop");
	}

	public void autoParking() {
		System.out.println("BMW---Auto parking");
	}
	
	public  static void testing() {
		System.out.println("BMW------testing");
	}

}
