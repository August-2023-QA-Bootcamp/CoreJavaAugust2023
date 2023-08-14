package lec02_java_basic;

// how to delete a specific line?
// put your cursor at the end, or beginning or middle, and then control/command + d

// some symbol and characters are used inside String
// use of \n --> creating a new line (not next line) ---> a lot of use of \n in IT industry
// use of \t --> creating a tab  ---> a lot of use of \t
// No need to give a space after \n or \t, it will give you a space

// Below 2 is: extra information, not used generally
// use of \b --> creating back space -- not used --- also doesn't work in eclipse (Work in IntelliJ)
// use of \r --> creating carriage return -- not used -- similar like \n

public class F_jannet_yellen {
	public static void main(String[] args) {		
		System.out.println("Janet Yellen, Born in 1946, American economist and Chair of the US Federal Reserve, born in Brooklyn, New York");
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------");
		System.out.println("\tJanet Yellen, \nBorn in 1946," + " \nAmerican economist and Chair " + "\tof the US Federal Reserve, \n\nborn in Brooklyn, New York");
		
	}

}
