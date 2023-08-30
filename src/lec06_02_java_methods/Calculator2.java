package lec06_02_java_methods;

public class Calculator2 {
	// Global variable or class variable
	// default type of access modifier is used, no reason, just for practice
	int a = 67;
	int b = 30;
	
	String fName = "Alex";
	String lName = "Fergunson";

	// void type method
	public void addition () {
		int total = a+b;
		System.out.println("Additon of a and b is: " + total);
	}
	
	// return type method
	public int sum () {
		int total1 = a+b; 
		System.out.println("Sum of a and b is returning: " + total1);
		return total1;
		// return keyword should be the last statement of return type method
		// if you don't know what to return, then return the default value of that variable type : important info
		// here int default value is : 0	
	}
	
	// return type method
	public String myName () {
		String fullName = fName + " " + lName;
		System.out.println("My Name is: " + fullName);
		return fullName;
	}
	
	// return type method
	public int subtraction() {
		int total2 = a-b;
		System.out.println("Subtraction of a and b is: "+total2);
		return total2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
