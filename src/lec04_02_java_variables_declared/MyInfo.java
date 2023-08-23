package lec04_02_java_variables_declared;

public class MyInfo {
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

	// Constructor declared
	public MyInfo () {
		System.out.println(":----- This is all about Myself -----:");
	}
	
	// method implemented
	public void myInfo () {
		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance" + myBankBalance + "\nGender: " + myGender
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}

}
