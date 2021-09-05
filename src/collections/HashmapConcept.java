package collections;

import java.util.HashMap;

public class HashmapConcept {

	public static void main(String[] args) {
		// Hashmap stores values on the key value format
		
		HashMap<String, String> empdata=new HashMap<String, String>();
		
		empdata.put("Peter", "SDET1");
		empdata.put("Tom", "SDET2");
		empdata.put("lisa", "SDET3");
		empdata.put("Venu", "QA");
		empdata.put(null, "QA2");
		
		
		System.out.println(empdata.get("Peter"));
		

	}

}
