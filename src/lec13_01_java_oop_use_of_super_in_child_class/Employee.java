package lec13_01_java_oop_use_of_super_in_child_class;

import javax.management.remote.SubjectDelegationPermission;

// A child class: Employee, Parent Class: MountSiani
public class Employee extends MountSinai {
	// Global variable declared
	public String empName;
	public int empId;
	public char sex;
	public boolean fullTimeEmp;
	
	// default Constructor
	public Employee() {
		// super() method is used to call the constructor of super (parent/base) class 
		// try to put the super method (after sysout of default constructor) and find the below outcome
		// Constructor call must be the first statement inside a constructor of child class 
		// We can use only one super() method inside constructor
		// Either default (line 19)  or parameterized constructor (line 20) can be called/initialized by super method from the super class,
		// That's why we use java comments in the below line 19
		// super(); // super() method represents the default constructor of super/parent class
		super("Bronx", 6); // represents the parameterized constructor of super/parent class
		
		// super keyword is used to call (initialize) any types of method from super (Parent) class
		super.msInfo();
		super.mountSinaiInfo("Staten Island", 7);
		super.mountSinaiInfo("Terry Town", 8);
		
		// super keyword is also used to call (initialize) the variables of super (Parent) class
		super.inNewYork = true;
		super.rating = 8.99f;
		System.out.println("Is this hospital in NY? Ans: " + inNewYork + " and The rating is: " + rating);
		
		System.out.println("This is a default constructor from the Child class Employee");
	}

	// parameterized Constructor
	// Inside Parameterized Constructor, super() and super keyword do same function like they did inside default constructor
	public Employee(String empName, int empId, char sex, boolean fullTimeEmp) {
		// super();
		super("Brooklyn", 10);
		
		super.msInfo();
		super.mountSinaiInfo("Nassau County", 10);
		
		super.inNewYork = false;
		super.rating = 9.004f;
		System.out.println("Is this hospital in NY? Ans: " + inNewYork + " and The rating is: " + rating);
			
		this.empName = empName;
		this.empId = empId;
		this.sex = sex;
		this.fullTimeEmp = fullTimeEmp;
		System.out.println("Name: " + empName + ", Id: " + empId + ", Sex: " + sex + " and Full time employee? : " + fullTimeEmp);
	}
	
	// void type or no return method or non parameterized method
	public void empInfo() {
		// by super(), we can't call constructor of super class inside a method of child class.
		// super();
		
		super.msInfo();
		super.mountSinaiInfo("Orange County", 15);
		
		super.inNewYork = false;
		super.rating = 9.2f;
		System.out.println("Is this hospital in NY? Ans: " + inNewYork + " and The rating is: " + rating);		
		
		System.out.println("This is a void type method from child class Employee");
	}
	
	// parameterized method
	public void employeeInfo (String empName, int empId, char sex, boolean fullTimeEmp) {
		// we can't call constructor of super class inside a method of child class.
		// super();
		
		super.msInfo();
		super.mountSinaiInfo("Staten Island", 19);
		
		super.inNewYork = true;
		super.rating = 9.8f;
		System.out.println("Is this hospital in NY? Ans: " + inNewYork + " and The rating is: " + rating);
				
		System.out.println("Name: " + empName + ", Id: " + empId + ", Sex: " + sex + " and Full time employee? : " + fullTimeEmp);
	}
	
	
	
	
	

}
