package Basics;

public class IfElseConcept {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a==b);
		if(a==b) {
			System.out.println("Both are equal");
		}
		else
			System.out.println("Both are not equal");
		boolean flag=false;
		if(flag)
			System.out.println("hi");
		else
			System.out.println("Bye");
		
		String s="selenium";
		if(s.equals("selenium")) {
			System.out.println("I learnt selenium");
		}
		if(s.equals("cypress")) {
			System.out.println("I learnt cypress");
		}
		if(s.equals("python")) {
			System.out.println("I learnt python");
		}

	}

}
