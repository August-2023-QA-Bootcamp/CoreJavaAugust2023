package lec11_02_java_oop_abstraction;

// Interface names starts with UpperCase 
// They follow Camel case or Snake case pattern.
// CamelCase or Snake_case feature considered from second word, not from first word
// CamelCase example for an Interface --> CarToyota
// Snake_case example for an Interface --> Car_toyota

// What is Interface?
// Interface is a Blueprint of the Class.
// An interface is a collection of methods that are defined (declared) in nature but not implemented. 

public interface Car {
	// Global variable
	// Inside Interface, variable can not be declared, see line 16
	// public int year;
	
	// Interview question: Can we declare variables inside Interface? 
	// No, we must have to initialize
	// what is the feature of variable that can be used inside Interface?
	// the variables inside Interface are final and static in nature.
	public static final int invented = 1880;
	// final means you can't change it
	// static means -- that property is a personal property of the Interface / class, 
	// other Class or Interface can't use it
	
	// Interview question: Does Interfaces have constructors?
	// Ans: No, Interfaces cannot have constructors
	/*
	public Car () {
		
	}
	*/
		
	// Interface doesn't have method body like classes
	// and here method is declared inside Interface body, 
	// method declared inside Interface
	// This is not mandatory to put abstract keyword with the abstract method of Interface
	// called abstract method (when method is declared)
	public void start ();
	public void stop();
	// this is a return type abstract method, but abstract keyword is not mandatory for methods inside Interface
	// return type abstract method can also be created inside the Interface
	public abstract String brake();
	
	

}
