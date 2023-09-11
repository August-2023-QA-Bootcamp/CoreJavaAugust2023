package lec08_01_java_conditional_statements;

import java.util.Scanner;

/*
Java Logical Operators: 
Logical operators are used to determine the logic between variables or values. example below:

&& ---> Logical and operator (Returns true if both statements are true, x < 5 &&  y < 10)
If both condition is true, outcome [go to condition body] is true
If both condition is false, outcome is false
If one condition is true and one false, outcome is false

||    Logical or operator (Returns true if one of the statements is true, x < 5 || y < 4)
If both condition is true, outcome is true
If both condition is false, outcome is false
If one condition is true and one false, outcome is true

!     Logical not operator [Reverse the result, returns false if the result inside is true, (!(x < 5 && y < 10))] 

 */

public class CompareNumber07 {

	public static void main(String[] args) {
		System.out.println("---: Please put number belows :---");
		Scanner scanner = new Scanner(System.in);

		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		
		if (val1 % 2 == 0 && val1 < val2) {
			System.out.println(val1+" is an Even Number and " + val1 + " is smaller than " + val2);
		} else if (val1 % 2 == 0 && val1 > val2) {
			System.out.println(val1+" is an Even Number and " + val1 + " is greater than " + val2);
		} else if (val1 % 2 == 1 && val1 < val2) {
			System.out.println(val1+" is an Odd Number and " + val1 + " is smaller than " + val2);
		} else if (val1 % 2 == 1 && val1 > val2) {
			System.out.println(val1+" is an Odd Number and " + val1 + " is greater than " + val2);
		} else if (val1 % 2 == 0 && val1 == val2) {
			System.out.println(val1+" is an Even Number and " + val1 + " is equal to " + val2);
		} else if (val1 % 2 == 1 && val1 == val2) {
			System.out.println(val1+" is an Odd Number and " + val1 + " is equal to " + val2);
		} else {
			System.out.println("The system failed to execute your order");
		}

		scanner.close();	

	}

}
