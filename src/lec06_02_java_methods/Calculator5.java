package lec06_02_java_methods;

public class Calculator5 {
	// global variable or class variable
	float a = 1.34f;
	float b = 3.22f;
	
	// return type method (not parameterized)
	public float multiplication() {
		float total1 = a * b; // local variable
		System.out.println("Multiplication of a and b is: " + total1);
		return total1;
	}
	
	// new here
	// return type parameterized method
	public float addition (float a, float b) {
		float total2 = a + b;
		System.out.println("Addition of float a and b is: " + total2);
		return total2;
	}
	
	// void type parameterized method
	// Don't think parameterized method is only return type or only for float
	// any data type can  be used
	public void subtraction (float a, float b) {
		float total3 = a - b;
		System.out.println("Subtraction of float a and b is: " + total3);
	}
	
	// learning something new
	// return type parameterized method
	// inside parameterized method, we don't need 'this' keyword like constructor
	// Also, we can write the parameter directly. see line 36
	// we don't need a relation of variable and parameter inside method
	public float division (float c, float d) {
		float total4 = c / d; // local variable
		System.out.println("Division of c and d is: " + total4);
		return total4;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
