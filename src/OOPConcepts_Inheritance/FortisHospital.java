package OOPConcepts_Inheritance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor


public class FortisHospital implements USMedical,UKMedical,IndianMedical{
	
	private String name;
	private String city;
	public void physioServices() {
		System.out.println("FH-----physioServices");
		
	}
	public void cardioServices() {
		System.out.println("FH-----cardioServices");
		
	}
	public void emergencyServices() {
		System.out.println("FH-----emergencyServices");
		
	}
	public void gynicSeervices() {
		System.out.println("FH-----gynicSeervices");
		
	}

	public void ENTServices() {
		System.out.println("FH------ENTServices");
		
	}
	public void oncologyServices() {
		System.out.println("FH-------oncologyServices");
		
	}
	public void radiologyServices() {
		System.out.println("FH-----radiologyServices");
	}
	public void neuroServices() {
		System.out.println("FH-------neuroServices");
		
	}
	
}
