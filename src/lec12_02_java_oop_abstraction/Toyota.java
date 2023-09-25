package lec12_02_java_oop_abstraction;

// A regular class
// A regular class can inherit only one (regular class or one abstract class) by extends keyword
// A regular class can't inherit an Interface by extends keyword

public class Toyota extends Mercedez {
	// Global variable
	// Inside a class, variable can be declared or initialized
	public int priceOfToyota;
	public int yearOfManufacture = 1885;
	
	// Constructor is declared inside Class
	public Toyota () {
		System.out.println("This constructor is from Toyota class");
	}
	
	// method implemented inside class, method can't be declared inside class
	// This is a very very important interview question
	// Called non abstract method or implemented method
	public void toyotaInfo() {
		System.out.println("This method is from toyota Class");
	}
	
	// return type method can also be created inside the regular class
	public int ToyotaPrice () {
		int price = 45000; // local variable
		System.out.println(price);
		return price;
	}
	
	// we can also create parameterized method
	
	
	// Default methods are allowed only in interfaces, not in regular class
	/*
	public default void toyotaColor () {
		
	}
	*/
	
	// static method can be used inside Regular class
	public static void countryOfOrigin() {
		System.out.println("Made in Japan");
	}
	
	

}
