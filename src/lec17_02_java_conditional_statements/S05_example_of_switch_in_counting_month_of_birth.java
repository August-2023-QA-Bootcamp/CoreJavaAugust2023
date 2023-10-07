package lec17_02_java_conditional_statements;

import java.util.Scanner;

public class S05_example_of_switch_in_counting_month_of_birth {

	public static void main(String[] args) {
		System.out.println("Print the number of month you born: ");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		String birthMonth = null; // default value of String is null or empty , or you can only declare it
		
		switch (month) {
		
		case 1:
			birthMonth = "January";
			break;

		case 2:
			birthMonth = "February";
			break;

		case 3:
			birthMonth = "March";
			break;

		case 4:
			birthMonth = "April";
			break;

		case 5:
			birthMonth = "May";
			break;

		case 6:
			birthMonth = "June";
			break;

		case 7:
			birthMonth = "July";
			break;

		case 8:
			birthMonth = "August";
			break;

		case 9:
			birthMonth = "September";
			break;

		case 10:
			birthMonth = "October";
			break;

		case 11:
			birthMonth = "November";
			break;

		case 12:
			birthMonth = "December";
			break;

		default:
			birthMonth = "Invalid";
			break;
		}
		
		System.out.println("Your Birth Month is: " + birthMonth);
		scanner.close();


	}

}
