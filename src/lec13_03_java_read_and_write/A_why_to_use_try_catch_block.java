package lec13_03_java_read_and_write;

public class A_why_to_use_try_catch_block {
	public static void main(String[] args) {
		int a = 13;
		int b = 0;
		int division = a/b;
		System.out.println(division); // Exception occurred here
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println("August 2023 Batch"); // this line will not be executed
		// An Exception is an unwanted event that interrupts the normal flow of the program
		// How can we handle exception? -- very very important interview question
		// By --> try, catch, finally, throw, throws
	}

}
