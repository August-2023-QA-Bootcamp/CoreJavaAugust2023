package lec02_java_basic;

// we are learning print() vs println()
// println() is mostly used

public class A_GoodAfternoon {
	public static void main(String[] args) {
		System.out.print("Good Afternoon! ");
		System.out.print("How are you all?");
		System.out.print(" Do you understand the function of print() method? ");
		System.out.println("If yes, Great!!");
		// although above line is println(), but the previous 3 is print() and will
		// continue printing together
		System.out.println("If No, please ask me question.");
		
	}

}

// what the println() method do? -- Terminates the current line by writing the line separator string.
// println() -- print line by line
// print() -- print continuously, not line by line, connect the next outcome
// you can make it readable by putting a space at the end or at the beginning of next line
