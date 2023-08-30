package lec06_02_java_methods;

public class Calculator4 {
	// Global variable or class variable
	// default type of access modifier is used, no reason, just for practice
	int a = 39;
	int b = 23;
	
	// return type method
	public int addition () {
		int total1 = a+b; 
		System.out.println("Sum of a and b is returning: " + total1);
		return total1;
	}
	
	// new here
	// return type method
	public int subtraction() {
		int total2 = a-b;
		System.out.println("Subtraction of a and b is: "+total2);
		// we can call other methods inside a method body
		addition();
		multiplication();
		return total2;
	}
	
	// return type method
	public int multiplication () {
		int total3 = a * b;
		System.out.println("The value is: " + total3);
		return total3;
		// here int default value is : 0
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
