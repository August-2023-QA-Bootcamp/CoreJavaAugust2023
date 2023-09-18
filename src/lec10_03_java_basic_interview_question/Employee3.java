package lec10_03_java_basic_interview_question;

// Can you call a non-static (global) variable or method inside the main method (without creating object)?
// Ans: No, a non static variable or method can't be called inside static method
// FYI: main method is static in nature
//How you can resolve that issue?
//By making the variable static

public class Employee3 {
	
	public static void main(String[] args) {
		String empName = "Mohammad Sharkar";
		int empId = 2188458;
		char gender = 'M';
		boolean fullTimeEmployee = false;
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId + ", Employee Sex: " + gender
				+ " and Full time Employee? Ans: " + fullTimeEmployee);

	}

}
