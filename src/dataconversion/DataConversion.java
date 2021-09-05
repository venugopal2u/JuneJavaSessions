package dataconversion;

public class DataConversion {

	public static void main(String[] args) {
		String s="100";
		
		System.out.println(s+20);
		
		int i=Integer.parseInt(s);
		
		System.out.println(i+20);
		
		String d="12.33";
		System.out.println(d+20);
		
		double dd=Double.parseDouble(d);
		
		System.out.println(dd+20);
		
		String t="100A";
		String s3=t.substring(0, 3);
		
		System.out.println(Integer.parseInt(s3)+20);
		
		
				
		

	}

}
