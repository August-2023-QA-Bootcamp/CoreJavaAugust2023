package lec07_01_java_different_type_of_class;

public class Use_of_wrapper_class {

	public static void main(String[] args) {
		System.out.println("Summary of this Page");
		/*
		 how to convert from String to int? Ans:  Integer.parseInt(name1)   ---- Important Interview Question
		 how to convert from String to double? Ans: Double.parseDouble(name1)
		 how to convert from String to float? Ans: Float.parseFloat(name1)
		 Didn't show:
		 how to convert from String to byte? Ans: Byte.parseByte(name1)
		 how to convert from String to short? Ans: Short.parseShort(name1)
		 how to convert from String to long? Ans: Long.parseLong(name1)
		 how to convert from String to boolean? Ans: Boolean.parseBoolean(name1)
		 
		 default value of String is null/Empty  ---- Important Interview Question
		 default value of boolean is false  ---- Important Interview Question
		 default value of int is 0 [Zero]  ---- Important Interview Question
		 
		 how to convert from int to String? Ans:  String.valueOf(int empId) ---- Important Interview Question
		 
		 */
		
		
		
		System.out.println("\n................. Conversion of a String to int type.....................\n");
		String name1 = "100";
		System.out.println(name1); 
		// 100
		System.out.println(name1 + 20);
		// 10020
		System.out.print(100+20); 
		System.out.println(name1 + " " + 20); 
		// 100 20
		System.out.println(name1 + " " + 20 + 10); 
		// 100 2010, Line 15: 20+10 is not following Java Arithmetic Operators: addition
		System.out.println(name1 + " " + (20 + 10));
		// 100 30 (new), Line 17: (20+10) following Java Arithmetic Operators: addition, because inside parentheses
		System.out.println(name1 + " " + 20 + 10 + (10 + 10) + 5 + 6); 
		// 100 20102056
		System.out.println(20 + 25 + name1 + " " + 20 + 10 + (10 + 10) + 5 + 6); 
		// 45100 20102056,  20+25 following Java Arithmetic Operators: addition
		System.out.println(7 + 3 + name1 + 21 + 19); 
		// 101002119
		// Copying Line 21
		System.out.println(20 + 25 + Integer.parseInt(name1) + " " + 20 + 10 + (10 + 10) + 5 + 6); 
		// 145 20102056
		// most common and important interview question: how to convert from String to int? Ans:  Integer.parseInt(name1)
		System.out.println(7 + 3 + name1 + 20 + 10 + (10 + 10) + 5 + 6);
		System.out.println(7 + 3 + Integer.parseInt(name1) + 20 + 10 + (10 + 10) + 5 + 6); 
		// 171
		
		System.out.println("\n................. Conversion of a String to int type (when String is not a pure number, like 100Welcome) .....................\n");
		String name2 = "100Welcome";
		System.out.println(name2);
		// 100Welcome
		System.out.println(name2 + 20);
		// 100Welcome20
		System.out.println(name2 + " " + 20);
		// 100Welcome 20
		// Compilation error vs Runtime error
		// System.out.println(Integer.parseInt(name2) + " " + 20);
		// When the number is not pure, conversion from String to int is not possible, important info
		// it shows java.lang.NumberFormatException
		// when an exception happened, that interrupt the normal/regular flow of the program, 
		// so no execution below for line 42, so thats why we comment line 42
		// you learn this line from above code 
		
		System.out.println("\n................. Conversion of a String to double type .....................\n");
		String name3 = "3.15";
		System.out.println(name3); 
		// 3.15
		System.out.println(name3 + 1.25); 
		// 3.151.25
		System.out.println(name3 + " " + 1.25); 
		// 3.15 1.25
		System.out.println(2.5 + 2.5 + name3 + "  " + 1.25 + 1.25); 
		// 5.03.15 1.251.25
		System.out.println(2.5 + 2.5 + name3 + "  " + (1.25 + 1.25) + 0.5 + 1.0 + (2.0+3.0));
		// 5.03.15 2.50.51.05.0
		// 2.5 + 2.5 is 5.0, (1.25+1.25) is 2.5, 
		System.out.println(2.5 + 2.5 + name3 + "  " + (1.50 + 1.50) + 0.5 + 1.0 + (2.0+3.0));
		// 5.03.15 3.00.51.05.0
		System.out.println(name3 + 3.16);
		// 3.153.16
		System.out.println(Double.parseDouble(name3) + 3.16);
		// 6.31
		// an empty String below, brought it from line 44
		System.out.println(2.5 + 2.5 + Double.parseDouble(name3) + "  " + (1.25 + 1.25) + 0.5 + 1.0 + (2.0 + 3.0));
		// 8.15 2.50.51.05.0
		System.out.println(2.5 + 2.5 + Double.parseDouble(name3) + (1.25 + 1.25) + 0.5 + 1.0 + (2.0 + 3.0)); 
		// 17.15

		
		System.out.println("\n................. conversion of a String to float type .....................\n");
		String name4 = "3.15f";
		System.out.println(name4); // 3.15f
		System.out.println(name4 + 1.25); // 3.15f1.25
		System.out.println(name4 + "  " + 1.25); // 3.15f 1.25
		System.out.println(2.5f + 2.5f + name4 + "  " + 1.25 + 1.25); // 5.03.15f 1.251.25
		System.out.println(2.5f + 2.5f + name4 + "  " + (1.25 + 1.25) + 0.5 + 1.0 + (2.0 + 3.0)); // 5.03.15f 2.50.51.05.0
		// float and double both contain decimal, difference is after decimal how many digit can be present
		System.out.println(name4); // 3.15f
		System.out.println(Float.parseFloat(name4) + 4.15); 
		// Que: float + double = what type? Ans: double type
		// 3.15 wil get by conversion from String to float and 4.15 is double type, that's why result is 7.300000095367432
		System.out.println(2.5f + 2.5f + Float.parseFloat(name4)); // 8.15
		// " " -- Empty String
		System.out.println(2.5f + 2.5f + Float.parseFloat(name4) + "  " + (1.25 + 1.25) + 0.5 + 1.0 + (2.0 + 3.0)); // 8.15 2.50.51.05.0
		// float and double can be added, no issues, but it will take the value of double
		System.out.println(2.5f + 2.5f + Float.parseFloat(name4) + (1.25 + 1.25) + 0.5 + 1.0 + (2.0 + 3.0));
		// Que: float + double = what type? Ans: double type
		// 17.149999618530273
		// Why there are 16-17 after decimal?
		// Why? because float + double happening here, if we use f for rest of them, it will show float value
		
	
		System.out.println("\n................. conversion of a String to character .....................\n");
		// conversion from String to char (We will study it when we start String Manipulation)
		// String is a collection of Character
		// rather we find some different method
		char gender = Character.toLowerCase('M');
		System.out.println(gender); // you learn this line from this page
		char direction = Character.toUpperCase('e'); // you learn this line from this page
		System.out.println(direction);
		
		System.out.println("\n................. conversion of a String to boolean .....................\n");
		String employee1 = "true";
		System.out.println(employee1); // true
		System.out.println(Boolean.parseBoolean(employee1)); // true
		
		System.out.println("\n................. conversion of a String to boolean by default .....................\n");
		// imp interview question: by default boolean is false
		String employee2 = null; // empty or null
		System.out.println(employee2); // outcome will be empty or null
		System.out.println(Boolean.parseBoolean(employee2)); // false, important interview question
		
		// most common and important interview question: how to convert from String to int? Ans:  Integer.parseInt(name1)
		// most common and important interview question: how to convert from int to String? Ans:  String.valueOf(int empId)
				
		System.out.println("\n................. conversion from int to String .....................\n");
		int empId = 220;
		System.out.println(empId); 
		// 220
		System.out.println(empId + 280); 
		// 500
		System.out.println(10 + 20+ empId + " " + 280); 
		// 250 280
		System.out.println(empId); 
		// how to convert from int to String? Ans:  String.valueOf(int empId)
		System.out.println(String.valueOf(empId)); 
		// 220
		System.out.println(String.valueOf(empId) + 80); 
		// 22080
		
	
	}

}
