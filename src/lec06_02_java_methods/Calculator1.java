package lec06_02_java_methods;

public class Calculator1 {
	// Global variable or class variable
	// default type of access modifier is used, no reason, just for practice
	int a = 67;
	int b = 30;

	// void type method
	public void addition () {
		int total1 = a+b; // here total1 is a local variable
		// why? because this variable 'total1' belongs to the addition method
		System.out.println("Additon of a and b is: " + total1);
	}
	
	// Same as above
	public void subtraction() {
		int total2 = a - b; // local variable
		System.out.println("Subtraction of a and b is: " + total2);
	}

	public void multipliaction() {
		int total3 = a * b; // local variable
		System.out.println("Multipliaction of a and b is: " + total3);
	}

	public void division() {
		int total4 = a / b; // local variable
		System.out.println("Division of a and b is: " + total4);
	}
	
	
	
	
}
