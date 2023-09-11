package lec08_01_java_conditional_statements;

public class CompareNumber10 {
	// Why static? Non static method or variable can't be called inside main method
	static int val1 = 87;
	static int val2 = 87;
	
	// Condition by team: If val1 < val2, multiply val1 with val2
	public static void multiplication() {
		int mult = val1*val2;
		System.out.println("Multiplication Result is: " + mult);
	}
	
	// Condition by team: If val1>val2, divide val1 by val2
	public static void division () {
		int div = val1/val2;
		System.out.println("Division Result is: " + div);
	}
	
	// Condition by team: If val1 == val2, do an addition of val1 and val2
	public static void addition () {
		int add = val1 + val2;
		System.out.println("Addition Result is: " + add);
	}
	
	public static void main(String[] args) {
		if (val1<val2) {
			multiplication();
		} else if (val1>val2) {
			division();
		} else if (val1==val2) {
			addition();
		} else {
			System.out.println("Please provide a correct Value");
		}

	}

}
