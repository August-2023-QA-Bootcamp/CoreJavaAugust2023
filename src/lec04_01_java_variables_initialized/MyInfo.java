package lec04_01_java_variables_initialized;

public class MyInfo {
	// variables initialized
	public String myName = "Mohammad Tofael Kabir Sharkar";
	public byte myAge = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 2147483647;
	public long myBankBalance = 9223372036854775807l;
	public float myHeight = 1.65473f;
	public double myGrade = 3.4665636567;
	public char myGender = 'M';
	public boolean usCitizen = false;

	// This Constructor is declared here
	public MyInfo () {
		System.out.println(":----- This is all about Myself -----:");
	}
	
	// method implemented here
	// method name can be same as class name, but in lower case
	// but, this is not mandatory to make a method name as class name
	public void myInfo () {
		// Can I use/call variable inside method body? Ans: Yes
		System.out.println(myName);
		System.out.println("-------------------------");
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge);
		System.out.println("-------------------------");
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance" + myBankBalance + "\nSex: " + myGender
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}

}
