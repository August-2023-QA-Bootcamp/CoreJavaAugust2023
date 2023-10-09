package lec18_01_java_array;

import java.util.Arrays;

public class UseOfArray04 {

	public static void main(String[] args) {
		// new --> how to update the existing Array
		int [] a = { 5, 15, 50, 0, 0, 56 };
		// Array is fixed size (Array is static)
		System.out.println("\nBefore update, the value of a[0] is: " + a[0]);
		System.out.println("To find the list of an Array: " + Arrays.toString(a));
		System.out.println("The length: " + a.length);
		
		// New: How can we "update a value" in the index of an Array?
		a[0] = 65;
		System.out.println("\nAfter update, the value of a[0] is: " + a[0]);
		System.out.println("After Update to find the list of an Array: " + Arrays.toString(a));
		System.out.println("The length: " + a.length);
		
		// How many times we can update: As many time as we want
		a[0] = 75;
		System.out.println("\nAfter second update, the value of a[0] is: " + a[0]);
		System.out.println("After Update to find the list of an Array: " + Arrays.toString(a));
		System.out.println("The length: " + a.length);
		
		// you can update any index
		a[0] = 25;
		a[1] = 39;
		a[4] = 76;
		// a[8] = 99; // no compilation error, java.lang.ArrayIndexOutOfBoundsException
		System.out.println("\nAfter update, the value of a[0] is: " + a[0]); // final output:?
		System.out.println("To find the list of an Array: " + Arrays.toString(a));
		System.out.println("The length: " + a.length);
		
		System.out.println("\n----- Increasing the length of an Array by Copying another array -----");
		// Array is fixed size (Array is static), but line 40, name is b
		// how can we increase the length of an Array? [Important]: Arrays.copyOf(original array, new length)
		// Array name is b 
		int [] b = Arrays.copyOf(a, 10);
		// declaring size of a new array along with old Array Name [a] and new length 10
		
		// Is the length changed?
		// Is the length changed? line 34 is for line 45 comparison
		System.out.println("\nThe length of the new array is: " + b.length);
		System.out.println("To find the list of an Array: " + Arrays.toString(b));
		
		System.out.println("\n--------------------- Updating value of index of Array b -------------------------");
		b[2] = 27;

		b[5] = 99;
		b[6] = 60;
		b[7] = 65;
		b[8] = 68;
		
		System.out.println("Single index value for new Array: " + b[0]);// why output is: 25? 
		System.out.println("Single index value for new Array: " + b[2]);// output: how it happen? 27 // because updated
		System.out.println("Single index value for new Array: " + b[5]);// output: 99
		System.out.println("Single index value for new Array: " + b[7]);// output: 65
		System.out.println("Single index value for new Array: " + b[9]);// output: ? 0
		System.out.println("To find the list of an Array after update of index value: " + Arrays.toString(b));
			
		System.out.println("\n------------------------------------------------------------------------");
		// increasing the size of Array can be done several times
		// Array name is c
		int [] c = Arrays.copyOf(b, 12); // Array vS Arrays, Arrays is a class is used to manipulate the Array
	
		System.out.println("Single index value for new Array: " + c[0]);// why output is: 25?
		System.out.println("Single index value for new Array: " + c[11]);// output: ? 0
		System.out.println("The list of the array's elements: " + Arrays.toString(c));
	}

}
