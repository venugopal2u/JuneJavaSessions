package StringsConcept;

public class StringManupulations {

	public static void main(String[] args) {
		String s="Hi this is my java code and I am so happy";
		System.out.println(s.length());
		
		int l=s.length();
		System.out.println(l);
		int hi=l-1;
		int li=0;
		System.out.println(s.charAt(hi));
		System.out.println(li);

		System.out.println("---------------");
		
		System.out.println(s.indexOf("i"));//first occurrence of i
		
		System.out.println(s.indexOf('i', s.indexOf('i')+1));//Second occurrence of i
		
		System.out.println(s.indexOf('H'));
		
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("naveen"));
		
		String mesg="welcome null";
		if(mesg.indexOf("admin")>0) {
			System.out.println("Admin user logged in");
		}
		else {
			System.out.println("user is null");
		}
		
		String s1="This is my code";
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		
		String header="This is amazon page";
		
		System.out.println(header.contains("amazon"));
	}

}
