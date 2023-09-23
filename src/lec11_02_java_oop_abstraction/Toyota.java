package lec11_02_java_oop_abstraction;

// A regular class
public class Toyota {
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
	
	

}
