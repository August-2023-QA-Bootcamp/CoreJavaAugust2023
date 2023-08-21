package lec03_java_variables;

public class MyInfo {
	// This is a class body
	// A class body contains first: variables, second: Constructor, third: methods
	
	// String itself is a class, represents for String type variable here
	// String is not a pure primitive data type, important interview question
	public String myName = "Mohammad Tofael Kabir Sharkar";
	
	// primitive data type - 8 type
	// byte, short, int, long are used for complete/solid number
	public byte myAge = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 2147483647;
	public long myBankBalance = 9223372036854775807l;
	// we must have to use lower case L (l), at the end of long type value
	// Long can accept int range and no need of l, but when you cross the range of int, you must have to use l
	
	// float and double are used for not a complete number [a number with decimal]
	public float myHeight = 1.65473f;
	// we must have to use lower case f, at the end of float value
	public double myGrade = 3.4665636567;
	// Above 6 types are used for number
	// Mostly int is used for complete number and float for decimal number
	
	// Char type have single character inside single quotation in upper case
	public char myGender = 'M';
	public boolean usCitizen = false;

	// How to create a Constructor?
	// Constructor name same as Class name, so starts with Upper Case 
	// and follow camel case or snake case feature
	// This Constructor is declared here
	public MyInfo () {
		// Constructor body
		System.out.println("This is all about Myself");
	}
	
	// How to create a method?
	// This is a void type method
	// method name generally starts with lower Case 
	// and follow camel case or snake case feature
	// Inside the class, method can't be declared  (very important info)
	// method implemented here
	public void newYork () {
		System.out.println("I am the newYork method");
	}
	
	// there can be more than one methods inside a class with different name
	public void city_bus() {
		System.out.println("I am the city_bus method");
	}
	
	// method name can be same as class name, but in lower case
	// but, this is not mandatory to make a method name as class name
	public void myInfo () {
		System.out.println("I am myInfo method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// We use java comments below to use it in MyInfoTest class
	/*
	public static void main(String[] args) {
		// You have to create object inside the main method
		// MyInfo (blue color) is a class, myInfo (yellow color) is an object, also called reference type variable
		// object name always start with lower case, follow camel case or snake case feature
		// = equal operator, new is a keyword of Java
		
		// What happened below?
		// an object is created (myInfo) (by you) from 'MyInfo' class (following blueprint) which (object) is new and MyInfo type
		// This action (line 40) --> (when an object is created from a class) is called instantiation, (vvImp info)
		// Then we say the class (MyInfo) is instantiated Class Instantiated

		// here myInfo is the object
		MyInfo myInfo = new MyInfo();
		System.out.println(myInfo.myName);
		System.out.println(myInfo.myAge);
		System.out.println(myInfo.myApartmentRent);
		System.out.println(myInfo.myYearlySalary);
		System.out.println(myInfo.mybankBalance);
		System.out.println(myInfo.myHeight);
		System.out.println(myInfo.myGrade);
		System.out.println(myInfo.myGender);
		System.out.println(myInfo.usCitizen);
			
		MyInfo myInfo1 = new MyInfo();
		MyInfo myInfo2 = new MyInfo();
		MyInfo myInfo3 = new MyInfo();
		MyInfo myInfo4 = new MyInfo();
		MyInfo myInfo5 = new MyInfo();
		MyInfo myInfo6 = new MyInfo();
		MyInfo myInfo7 = new MyInfo();
		MyInfo myInfo8 = new MyInfo();
	}
	*/

}
