package lec08_01_java_conditional_statements;

import java.util.Random;

public class CompareNumber05 {
	public static void main(String[] args) {
		Random random = new Random();
		int val1 = random.nextInt(1000);
		int val2 = random.nextInt(1000);
		
		if (val1 == val2) {
			System.out.println(val1 + " is equal to " + val2);
		} else if (val1 != val2) { // not equal to
			System.out.println(val1 + " is not equal to " + val2);
		} else if (!(val1 == val2)) { // logical not operator
			System.out.println(val1 + " is not equal to " + val2); // This is same as line 13, represent logical not operator
		} else {
			System.out.println("Please provide a correct value");
		}
				
	}

}
