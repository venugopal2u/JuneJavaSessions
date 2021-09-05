package SuperKeyWord;

public class HDFCBank extends Bank {
	int min_bal=200;
	
	public HDFCBank() {
		super(10);
		System.out.println("HDFCBank----Constructor");
	}
	
	@Override
	public void balanceDisplay() {
		System.out.println("HDFCBank-----balanceDisplay");
		System.out.println(min_bal);
		System.out.println(super.min_bal);
		
	}
	

}
