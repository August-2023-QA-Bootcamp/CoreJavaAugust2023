package lec07_01_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class03 {

	public static void main(String[] args) {
		System.out.println("Please Type your Full Name: ");
		Scanner scanner = new Scanner(System.in);
		String fullName = scanner.nextLine();
		System.out.println("\nHey! " + fullName + ". Now You know how the Scanner class works!");
		scanner.close();

	}

}

// Can we type 73526435  374678364 as String?
// Yes, because nextLine() accept everything, but not nextInt()