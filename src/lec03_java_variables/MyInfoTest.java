package lec03_java_variables;

public class MyInfoTest {

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
		// How the variables are printing from here where variables are absent in this class?
		// Ans: Inside same package, public, protected and default type content can be accessible [this info will come later]
		// Ans: Inside different package, only public type content can be accessible [this info will come later]
		
		// When an object [myInfo] is created from a class [MyInfo], Constructor is initialized
		// When an object is created from a class, the class is instantiated
		MyInfo myInfo = new MyInfo(); // Constructor initialized here
		
		// variable is called or executed by object, and we can see the outcome inside syso
		// object can access the properties [variable, constructor, methods] of the class, from where it is created
		System.out.println(myInfo.myName);
		System.out.println(myInfo.myAge);
		System.out.println(myInfo.myApartmentRent);
		System.out.println(myInfo.myYearlySalary);
		System.out.println(myInfo.myBankBalance);
		System.out.println(myInfo.myHeight);
		System.out.println(myInfo.myGrade);
		System.out.println(myInfo.myGender);
		System.out.println(myInfo.usCitizen);	
		
		// Calling one variable
		// We can use String to make our outcome meaningful
		System.out.println("My Name: " + myInfo.myName);
		
		// Calling two variables
		// you can use more than one String
		System.out.println(myInfo.myName + myInfo.myAge);
		System.out.println("My Name: " + myInfo.myName + "\nMy Age: " + myInfo.myAge);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		// Calling all the variables
		// Next line, we printed all the outcome with String Concatenation
		System.out.println("My Name: " + myInfo.myName + "\nMy Age: " + myInfo.myAge + "\nMy Apartment Rent: "
				+ myInfo.myApartmentRent + "\nYearly Salary: " + myInfo.myYearlySalary + "\nMy Bank Balance: "
				+ myInfo.myBankBalance + "\nGender: " + myInfo.myGender + "\nMy Height: " + myInfo.myHeight + "\nMy Grade: "
				+ myInfo.myGrade + "\nAm I US Citizen? Ans: " + myInfo.usCitizen);
		
		// The object can call methods
		// This is called 'method initialized'
		myInfo.newYork();
		myInfo.city_bus();
		myInfo.myInfo();
		
		
		
		
		
		System.out.println("-------------------------------------------------------------------------------");
		// A class can create more than one object		
		MyInfo myInfo1 = new MyInfo();
		System.out.println(myInfo1.myName);
		
		// yellow highlight means warning! it means object is not used yet
		MyInfo myInfo2 = new MyInfo();
		MyInfo myInfo3 = new MyInfo();
		MyInfo myInfo4 = new MyInfo();
		MyInfo myInfo5 = new MyInfo();
		MyInfo myInfo6 = new MyInfo();
		MyInfo myInfo7 = new MyInfo();
		MyInfo myInfo8 = new MyInfo();

	}

}
