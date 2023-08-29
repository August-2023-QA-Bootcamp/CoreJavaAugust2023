package lec05_01_java_constructor;

public class Employee {
	// Global variable or class variable
	// variables declared
	public String empName;
	public int empId;
	public char empGender;
	public boolean fullTimeEmployee;
	
	
	// Constructor are 2 types --
	// default constructor (no argument constructor) and parameterized constructor
	// A class can contain one default constructor and one or (more than one) parameterized constructor
	// Default Constructor must be declared before parameterized constructor.
	// you shouldn't write a parameterized constructor without writing a default constructor. It's a norm.
	
	// default Constructor declared
	public Employee () {
		System.out.println("I am a default Constructor");
	}
	
	// parameterized Constructor 01 declared	
	public Employee (String empName) { // here empName is called parameter, in line 5, it is variable
		this.empName = empName;
		System.out.println("Employee Name: " + empName);
	}
	
	// parameterized Constructor 02 declared	
	public Employee (String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId);
	}
	
	// Parameterized Constructor 03 declared
	// line 29 vs line 39 -- just the position of parameters are changed
	// It is possible to create a parameterized constructor with the same number of parameters. Ans: Yes
	// but they are organized in a different position.
	// But the syso outcome doesn't matter, line 43 vs 32
	public Employee (int empId, String empName) {
		this.empId = empId;
		this.empName = empName;		
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId);
		// see the outcome from below. default value will be printed if parameter is absent but in sysout you use it
		System.out.println("Employee name: " + empName+" and Full time Employee? Ans: " + fullTimeEmployee + ", Id: " + empId);
	}
	
	// Important interview question
	// When no values assigned for variables, after execution, they show default value
	// The default value for String is null
	// The default value for byte is 0
	// The default value for short is 0
	// The default value for int is 0
	// The default value for long is 0
	// The default value for float is 0.0
	// The default value for double is 0.0
	// The default value for char is some unicode, which come from ASCII table
	// eclipse can't express default value of char, IntelliJ idea can do
	// The default value for boolean is false

	// parameterized Constructor 04 declared	
	public Employee (String empName, int empId, char empGender) {
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId + ", Employee Gender: " +empGender);
	}
	
	// parameterized Constructor 05 declared	
	public Employee (String empName, int empId, char empGender, boolean fullTimeEmployee) {
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId + ", Employee Gender: " + empGender + " and Full time Emplyee? Ans: "  + fullTimeEmployee);
	}

	
	// Parameterized Constructor 06 declared
	// 06 vs 05 -- just the position of parameters are changed
	// It is possible to create a parameterized constructor with the same number of parameters 
	// but they are organized in a different position.
	public Employee(String empName, int empId, boolean fullTimeEmployee, char empGender) {
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId + ", Employee Gender: " + empGender + " and Full time Emplyee? Ans: "  + fullTimeEmployee); 
	}
	
	public Employee (String empName, char empGender, int empId) { 
		this.empName = empName; 
		this.empId = empId; 
		this.empGender = empGender;
		System.out.println("Employee name: " + empName+ ", Gender: " + empGender + ", Id: " + empId);
		// But the sequence of outcome doesn't matter
		// that's why I change the sequence
	}
	
	public Employee (char empGender, int empId, String empName) { 
		this.empName = empName; 
		this.empId = empId; 
		this.empGender = empGender;
		System.out.println("Employee name: " + empName+ ", Gender: " + empGender + ", Id: " + empId);
		// But the sequence of outcome doesn't matter
		// that's why I change the sequence
	}
	
	public Employee (char empGender, String empName,  int empId) { 
		this.empName = empName; 
		this.empId = empId; 
		this.empGender = empGender;
		System.out.println("Employee name: " + empName+ ", Gender: " + empGender + ", Id: " + empId);
		// But the sequence of outcome doesn't matter
		// that's why I change the sequence
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
