package lec10_01_java_control_statements;

public class E_use_of_java_break {

	public static void main(String[] args) {
		System.out.println("\n---------- for loop  ----------\n");
		for (int i = 1; i <= 5; i++) { 
			System.out.println(i);
		}
		// 1, 2, 3, 4, 5

		System.out.println("\n---------- for loop after break  ----------\n");
		// Iteration: travel, when loop is continuing, that is also called iteration, verb: iterate
		// break cannot be used outside of a loop or switch. it is used inside a condition
		for (int j = 1; j <= 5; j++) {
			if (j==3) {// if the condition meet the criteria, the code will move to body of condition, and the break feature will work
				break;
				// break used inside condition, it shows error without using inside condition
			}
			System.out.println(j);
			
		}
		// 1, 2
		
		System.out.println("\n---------- for loop after break  ----------\n");
		for (int k = 1; k <=5; k+=2) { 
			if (k==4) {
				break; // if the condition doesn't meet, compiler will not move to condition body, so no break
			}
			System.out.println(k);
		}
		// 1, 3, 5
		
		// Try to understand at least the for loop, that is enough, if you feel stress don't go below
		// See the code by yourself
		// This is a while loop
		System.out.println("\n---------- while loop ----------\n");
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\n---------- while loop after break 01 ----------\n");
		int j = 0;
		while (j <= 10) { 
			if (j == 7) {
				break;
			}
			System.out.println("The value is: " + j); // break is not implemented because no value as 7
			j=j+2;
		} 
		// regular outcome if no break: 0, 2, 4, 6, 8, 10
		
		System.out.println("\n---------- while loop after break 02 ----------\n");
		int n = 1;
		while (n <= 10) { 
			if (n == 7) {
				break;
			}
			System.out.println("The value is: " + n); // break is implemented because 7 is present as value
			n=n+2;
		}
		
		// regular outcome if no break 1, 3, 5, 7, 9
		// after break: 1, 3, 5
		
		System.out.println("\n---------- do while loop after break 01 ----------\n");
		int l = 1;
		do { 
			if (l == 5) {
				break;
			}
			System.out.println("The value is: " + l);						
			l = l + 2;
		} while (l <= 7);
		// regular outcome if no break: 1, 3, 5, 7
		// After break: 1, 3
		
		
		System.out.println("\n---------- do while loop after break 02 ----------\n");
		int m = 1;
		do {
			if (m == 6) {  // condition is absent, so break is not implemented
				break;
			}
			System.out.println("The value is: " + m);					
			m = m + 2;
		} while (m <= 7);
		
		// Regular outcome if no break: 1, 3, 5, 7
		// After break: 1, 3, 5, 7
		
		
		
		
		
		
		
		
	}

}
