package OOP_Abstraction;

public class TestPage {

	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.header();
		lp.title();
		lp.doLogin("admin", "admin");
		
		
		//Top casting:Loginpage object can be referred by abstract class reference variable
		Page p=new LoginPage();
		p.header();
		p.logo();
		p.pageUrl();
		p.title();

	}

}
