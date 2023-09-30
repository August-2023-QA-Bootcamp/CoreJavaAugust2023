package lec14_03_java_oop_polymorphism;

public class ModernCalculator extends LandCalculator{
	
	// return type parameterized method -01 implemented
	@Override
	public int landCalculator(int a, int b, int c) { // parameter
		int total1 = a/2+b+c+5;
		System.out.println("Total area from Local Calculator: " + total1);
		return total1;
	}
	
	// return type parameterized method -02 implemented
	@Override
	public int landCalculator(int d, int e, float f) {
		int total2 = d+e*4+(int)f;
		System.out.println("Total area from Local Calculator: " + total2);
		return total2;
	}
	
	// return type parameterized method -03 implemented
	@Override
	public int landCalculator(int d, String e, int f) {
		int total3 = d+34+Integer.parseInt(e)+f;
		System.out.println("Total area from Local Calculator: " + total3);
		return total3;
	}
	
	// return type parameterized method -04 implemented
	@Override
	public int landCalculator(int a, int b) {
		int total4 = a+b/4;
		System.out.println("Total area from Local Calculator: " + total4);
		return total4;
	}
	
	// Return type parameterized method implemented -05
	@Override
	public int landCalculator (int d, double f, int e) {
		int total5 = d/2 + (int)f + e/3; 
		System.out.println("Total area from Local Calculator: " + total5);
		return total5;
	}

	// Return type parameterized method which is final and implemented
	// Final type method cannot be Overriden -- important interview question
	// Cannot override the final method from LandCalculator	
	/*
	@Override
	public final int landCalculator (int a, int b, int c, int d) {
		int total6 = a+b+c+d; // local variable
		System.out.println("Total area from Local Calculator: " + total6);
		return total6;
	}
	*/
	
	

	// Static type Method (7) implemented
	// -- important interview question
	// This below method - landCalculator can't override or implemented
	// because static is a local member method of a class
	// So, static method can't be override, if we remove @override it will work as
	// static method of this modern calculator class
	
	/*
	@Override
	public static int landCalculator (int a, int b, int c, int d, int e) {
		int total7 = a+b+c+d+e; // local variable
		System.out.println("Total area from Local Calculator: " + total7);
		return total7;
	}
	*/
		
	
	// void type method (8) is implemented
	@Override
	public void landCalculator () {
		System.out.println("This is from void type method from Modern Calculator");
	}
	
	// void type parameterized method (9) is implemented
	@Override
	public void landCalculator(int a, String b, int c, int d, int e, int f) {
		int total8 = a + Integer.parseInt(b) + c/2 + d/3 + e + f;
		System.out.println("Total area from local calculator: " + total8);
	}
		

}
