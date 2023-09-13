package lec09_01_java_conditional_statements;

import java.util.Scanner;

public class CompareNumber14 {

	public static void main(String[] args) {
		System.out.println("---: Please put number belows :---");
		Scanner scanner = new Scanner(System.in);

		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		
		if (val1 % 2 == 0) { // outer if block
			
			if (val1 < val2) { // inner if block
				System.out.println(val1+" is an Even Number and " + val1 + " is smaller than " + val2);
			} else if (val1 > val2) {
				System.out.println(val1+" is an Even Number and " + val1 + " is greater than " + val2);
			} else if (val1 == val2) {
				System.out.println(val1+" is an Even Number and " + val1 + " is equal to " + val2);
			} else if (val1 >= val2) {
				System.out.println(val1+" is an Even Number and " + val1 + " is greater than or equal to " + val2);
			} else if (val1 <= val2) {
				System.out.println(val1+" is an Even Number and " + val1 + " is less than or equal to " + val2);
			}
		
		} else if (val1 % 2 ==1) { // outer else of block
			
			if (val1 < val2) { // inner if block
				System.out.println(val1+" is an Odd Number and " + val1 + " is smaller than " + val2);
			} else if (val1 > val2) {
				System.out.println(val1+" is an Odd Number and " + val1 + " is greater than " + val2);
			} else if (val1 == val2) {
				System.out.println(val1+" is an Odd Number and " + val1 + " is equal to " + val2);
			} else if (val1 >= val2) {
				System.out.println(val1+" is an Odd Number and " + val1 + " is greater than or equal to " + val2);
			} else if (val1 <= val2) {
				System.out.println(val1+" is an Odd Number and " + val1 + " is less than or equal to " + val2);
			}
			
		} else {
			System.out.println("The system failed to execute your order");
		}

		scanner.close();	

	}

}
