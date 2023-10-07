package lec17_01_Java_Nested_Class;

public class JFKTest {

	public static void main(String[] args) {
		System.out.println("\n-------------- JFK01 --------------\n");
		JFK01 jfk01 = new JFK01();
		jfk01.welcome();// outer class method is initialized
		// The below method doesn't work
		// jfk01.destination();
		// How to take care the inner class method?
		// object of outer class dot object of inner class dot properties/methods of the inner class
		jfk01.t1.destination(); // inner class method is initialized
	
		// Line 17 is not ok, because TrminalTwo is an inner class, inner class can't be instantiated here
		// Creating object from inner class desn't help here
		// TerminalTwo t2 = new TerminalTwo();
		
		jfk01.t2.usAirlines(); // same like line 13
		jfk01.t4.arabianFlights();
	
		System.out.println("\n-------------- JFK02 --------------\n");
		JFK02 jfk02 = new JFK02();
		jfk02.welcome();
		
		System.out.println("-------------------- Or -------------------");
		// Line 29 is also possible, but the above line (24) can do the same purpose, so no need to write it again
		// Below 3 line is same as line 13
		jfk02.t1.destination();
		jfk02.t2.usAirlines();
		jfk02.t4.arabianFlights();
		
		System.out.println("\n-------------- JFK02 --------------\n");
		// As the inner class TerminalFour is static, then it can be called by the outer class directly
		JFK02.TerminalFour jt01 = new JFK02.TerminalFour();
		jt01.arabianFlights();
		
		// Please see line no 17
		// And we follow, line 35 below at line 41 is not working.
		// TerminalTwo is the non static inner class, that's why below line doesn't work
		// JFK02.TerminalTwo jt02 = new JFK02.TerminalTwo();
		
		System.out.println("\n-------------- JFK03 --------------\n");
		JFK03 jfk03 = new JFK03();
		jfk03.welcome();
		
		System.out.println("\n-------------- JFK03 --------------\n");
		JFK03.TerminalFour jt02 = new JFK03.TerminalFour();
		jt02.arabianFlights();
		// jt02.asianFlights(); // it shows warning for static method
		JFK03.TerminalFour.asianFlights(); // This is new here
		// If outer class have static inner class, and static inner class have static method
		// you don't need to create object like line 48
		
		// inner class always need the help of outer class, see line 58
		// TerminalFour.asianFlights();
		
		System.out.println("\n-------------- JFK04 --------------\n");
		JFK04 jfk04 = new JFK04();
		jfk04.t1.destination();
		
		System.out.println("--------------------------------------------");
		// The below methods are usual
		jfk04.t2.usAirlines();
	
	}

}
