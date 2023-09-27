package lec13_01_java_oop_use_of_super_in_child_class;

public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("---------- default constructor initialized from The Child Class Employee -----------");
		Employee employee1 = new Employee();
		
		System.out.println("\n---------- parameterized constructor initialized from The Child Class Employee -----------");
		Employee employee2 = new Employee("Mohammad Sharkar", 2188458, 'M', true);
		
		System.out.println("\n---------- void type method initialized from The Child Class Employee -----------");
		employee2.empInfo();
		
		System.out.println("\n---------- parameterized method initialized from The Child Class Employee -----------");
		employee2.employeeInfo("Robert Hajjar", 216675, 'M', false);
		
		System.out.println("\n---------- default constructor initialized from The Parent Class Mount Sinai -----------");
		MountSinai mountSinai1 = new MountSinai();
		
		System.out.println("\n---------- parameterized constructor initialized from The Parent Class Mount Sinai -----------");
		MountSinai mountSinai2 = new MountSinai("Manhattan", 4);
		
		System.out.println("\n---------- void type method initialized from The Parent Class Mount Sinai -----------");
		mountSinai2.msInfo();
		
		System.out.println("\n---------- parameterized method initialized from The Parent Class Mount Sinai -----------");
		mountSinai2.mountSinaiInfo("Queens", 3);
		
		
	}

}
