package lec05_01_java_constructor;

public class EmployeeTest {

	public static void main(String[] args) {
		// default Constructor initialized
		Employee employee = new Employee ();
		
		// parameterized Constructor 01 Initialized in line 15-18
		// How? we pass the value of the parameter inside parentheses body
		// Here 'Mohammad Sharkar' is called Argument and this is String type
		// Why String type? Why inside double quotation?
		// because parameter is String type
		
		Employee tofael = new Employee("Mohammad Sharkar");
		Employee kazi = new Employee("Kazi Mustafiz");
		Employee baki = new Employee("Abdulla Al Baki");
		Employee ummey = new Employee("Ummey Habiba");
		// although parameterized constructor is declared once, you can initialize it as many times [4 above] as you want

		// parameterized Constructor 02 Initialized
		Employee ruhul = new Employee("Ruhul Kuddus Rana 007", 2188458);
		
		// parameterized Constructor 03 Initialized
		Employee shabnin = new Employee(438458, "Shabnin Shehrin");

		// parameterized Constructor 04 Initialized
		Employee salma = new Employee("Salma Akter", 463846, 'F');
		
	
		// parameterized Constructor 05 Initialized
		Employee taraque = new Employee("Taraque", 6587465, 'M', true);
		
		// parameterized Constructor 06 Initialized
		Employee shumona = new Employee("Shumona", 1187465, false, 'F');
		
		// We can initialize parameters more than one time by creating different object
		Employee john = new Employee("John J", 53588, true, 'M');
		Employee joe = new Employee("Joe Biden", 55580, false, 'M');
		Employee hillary = new Employee("Hillary Clinton", 75512, true, 'F');
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
