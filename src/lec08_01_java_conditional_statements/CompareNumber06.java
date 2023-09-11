package lec08_01_java_conditional_statements;

import java.util.Scanner;


/*
Even number (2, 4, 6, 8, 10, ......): A number divided by 2 with a remainder of 0.
Example 56 : 56/2 --- divisor 2, quotient 28, remainder/modulus 0
Odd number (1, 3, 5, 7, 9, .......) : A number divided by 2 with a remainder of 1.
Example 37 : 37/2 --- divisor 2, quotient 18, remainder/modulus 1
Is 0 an Even Number? The answer is easy: Yes, zero is an even number. 
Usually, zero together with the even numbers, 
so certainly it is not an odd number. An even number is formally defined as an integer of the form n = 2x, 
where x is an integer.
an odd or even number can also be negative

Logically
val1 % 2 == 1   represent odd number
val1 % 2 == 0   represent even number

 */

public class CompareNumber06 {

	public static void main(String[] args) {
		System.out.println(" ---- Please find the nature of the number you put ---- ");
		Scanner scanner = new Scanner(System.in);
		int val1 = scanner.nextInt();
		
		if (val1 % 2 == 0) {
			System.out.println(val1 + " is an Even Number");
		} else if (val1 % 2 == 1) {
			System.out.println(val1 + " is an Odd Number");
		} else {
			System.out.println("The System failed to execute it");
		}
		scanner.close();
	}

}
