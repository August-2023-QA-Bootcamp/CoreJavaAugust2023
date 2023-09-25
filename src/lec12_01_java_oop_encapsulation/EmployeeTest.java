package lec12_01_java_oop_encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee("Fatema", 80, 'F', true);
		System.out.println("The Employee Name is: " + emp.getName() + "\nEmployee Age: " + emp.getAge()+"\nEmployee Sex: " + emp.getSex()+"\nand Is US Citizen? Ans: " +emp.isUsCitizen());

	}

}
