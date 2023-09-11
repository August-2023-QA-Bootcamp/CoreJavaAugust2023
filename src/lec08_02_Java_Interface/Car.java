package lec08_02_Java_Interface;

// What is Interface?
// Interface is a Blueprint of the Class.
// An interface is a collection of methods that are defined (declared) in nature but not implemented. 

public interface Car {
	// Interface doesn't have method body like classes
	// and here method is declared inside Interface body, 
	// method declared inside Interface
	// This is not mandatory to put abstract keyword with the abstract method of Interface
	// called abstract method (when method is declared)
	public void start ();
	public void stop();
	public abstract String brake();
	
	// I am not initializing interface today
	// Also not showing a relation between class and Interface

}
