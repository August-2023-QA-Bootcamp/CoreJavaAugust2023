package lec14_03_java_oop_polymorphism;

public class LandCalculator {
	
	// return type parameterized method -01 implemented
	// method name can be same as class name but in lower case
	// if you write like (int c, int b, int a) in a separate method or like (int d, int e, int f) ,
	// it will not work similarly as parameterized constructor
	// same variable type is the problem, how many variables, this is not an issue
	// it allows the same number of variable, if variables type are different as parameter in a different combination
	public int landCalculator(int a, int b, int c) {
		int total1 = a+b+c;
		System.out.println("Total area from Local Calculator: " + total1);
		return total1;
	}
	
	// return type parameterized method -02 implemented
	// but here one of the signature/parameter is float Type
	// line 11 vs 22, although number of parameter same, method name same, but parameter type is different
	// same number of parameter, same type of parameter with same position is not allowed
	// Different position is ok
	public int landCalculator(int d, int e, float f) {
		int total2 = d+e+(int)f;
		System.out.println("Total area from Local Calculator: " + total2);
		return total2;
	}
	
	// return type parameterized method -03 implemented
	public int landCalculator(int d, String e, int f) {
		int total3 = d+Integer.parseInt(e)+f;
		System.out.println("Total area from Local Calculator: " + total3);
		return total3;
	}
	
	// return type parameterized method -04 implemented
	public int landCalculator(int a, int b) {
		int total4 = a+b;
		System.out.println("Total area from Local Calculator: " + total4);
		return total4;
	}
	
	// Return type parameterized method implemented -05
	public int landCalculator (int d, double f, int e) {
		int total5 = d + (int)f + e; 
		System.out.println("Total area from Local Calculator: " + total5);
		return total5;
	}
	
	// Return type parameterized method which is final and implemented -06
	// Also called final method, final method can't be changed
	// Final type of method can be overloaded -- important interview question
	// it is not mandatory the final method to be return type
	public final int landCalculator (int a, int b, int c, int d) {
		int total6 = a+b+c+d; // local variable
		System.out.println("Total area from Local Calculator: " + total6);
		return total6;
	}
	
	// Static type Method (7) implemented
	// Static method can be overloaded -- important interview question
	public static int landCalculator (int a, int b, int c, int d, int e) {
		int total7 = a+b+c+d+e; // local variable
		System.out.println("Total area from Local Calculator: " + total7);
		return total7;
	}
	
	// void type method (8) is implemented
	public void landCalculator () {
		System.out.println("This is from void type method from Local Calculator");
	}
	
	// void type parameterized method (9) is implemented
	public void landCalculator(int a, String b, int c, int d, int e, int f) {
		int total8 = a + Integer.parseInt(b) + c + d + e + f;
		System.out.println("Total area from local calculator: " + total8);
	}
		

}
