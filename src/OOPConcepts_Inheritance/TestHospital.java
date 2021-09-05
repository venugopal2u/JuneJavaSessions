package OOPConcepts_Inheritance;

public class TestHospital {

	public static void main(String a[]) {
		FortisHospital fh=new FortisHospital("Fortis","Bengalpre");
		System.out.println(fh.getName()+":"+fh.getCity());
		fh.setCity("Chennai");
		System.out.println(fh.getName()+" :"+fh.getCity());
		fh.cardioServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.oncologyServices();
		fh.physioServices();
		fh.radiologyServices();
		

	}

}
