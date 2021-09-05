package OOP_Abstraction;

public class LoginPage extends Page{
	
	public LoginPage() {
		System.out.println("Default constrctor----LoginPage");
	}

	@Override
	public void header() {
		// TODO Auto-generated method stub
		System.out.println("LP-------header");
		
	}

	@Override
	public void title() {
		// TODO Auto-generated method stub
		System.out.println("LP-------Title");
		
	}
	public void forgotPassword() {
		System.out.println("LP------forgot password");
		
	}
	
	public void doLogin(String username,String password) {
		System.out.println("Login with"+username+":"+password);
	}

}
