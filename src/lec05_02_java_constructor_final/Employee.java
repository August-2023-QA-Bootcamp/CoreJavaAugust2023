package lec05_02_java_constructor_final;

public class Employee {
	// variables declared
	public String empName;
	public int empId;
	public char empGender;
	public boolean fullTimeEmployee;
	
	// default Constructor declared
	public Employee () {
		System.out.println("------ :Our Employee's Information are below: ------");
	}

	// parameterized Constructor declared
	public Employee (String empName, int empId, char empGender, boolean fullTimeEmployee) {
		this.empName = empName;
		this.empId = empId;
		this.empGender = empGender;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId + ", Employee Gender: " + empGender + " and Full time Emplyee? Ans: "  + fullTimeEmployee);
	}

	
	
	
	

}
