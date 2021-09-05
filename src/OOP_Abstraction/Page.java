package OOP_Abstraction;

public abstract class  Page {
	
	public Page() {
		System.out.println("Default const----Page");
	}
	public  abstract void header();
	public abstract void title();
	
	public void pageUrl() {
		System.out.println("http://www.xyz.com");
	}
	
	public final void logo() {
		System.out.println("App logo");
		
	}

}
