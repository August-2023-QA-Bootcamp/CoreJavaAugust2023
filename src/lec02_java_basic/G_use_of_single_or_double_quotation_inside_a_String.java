package lec02_java_basic;

// use of " " inside String---> \"  \" 
// use of ' ' inside String ---> \'  \'
// use of \ \  inside String---> \\   \\

public class G_use_of_single_or_double_quotation_inside_a_String {
	public static void main(String[] args) {		
		System.out.println("Janet Yellen, Born in 1946, American economist and Chair of the US Federal Reserve, born in Brooklyn, New York");
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------");
		System.out.println("\"Janet Yellen\", \nBorn in 1946," + " \n\tAmerican \\economist\\ and Chair " + "\tof the US Federal Reserve, \n\nborn in \'Brooklyn, New York\'");
		
	}

}
