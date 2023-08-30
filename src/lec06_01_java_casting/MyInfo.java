package lec06_01_java_casting;

public class MyInfo {
	// Global variable or class variable
	// variables declared
	public String myName;
	public byte myAge;
	public short myApartmentRent;
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char myGender;
	public boolean usCitizen;

	// default Constructor 
	public MyInfo () {
		System.out.println(":----- This is all about Myself -----:");
	}
	
	// Parameterized Constructor
	public MyInfo(String myName, byte myAge, short myApartmentRent, int myYearlySalary, long myBankBalance,
			float myHeight, double myGrade, char myGender, boolean usCitizen) {
		this.myName = myName;
		this.myAge = myAge;
		this.myApartmentRent = myApartmentRent;
		this.myYearlySalary = myYearlySalary;
		this.myBankBalance = myBankBalance;
		this.myHeight = myHeight;
		this.myGrade = myGrade;
		this.myGender = myGender;
		this.usCitizen = usCitizen;
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance: " + myBankBalance + "\nGender: " + myGender
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}

}
