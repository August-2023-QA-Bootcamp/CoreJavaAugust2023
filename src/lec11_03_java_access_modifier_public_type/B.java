package lec11_03_java_access_modifier_public_type;

import lec11_07_java_access_modifier_class_from_outside_package.N;

public class B extends C{
	public String name1 = "This variable is coming from class B which is public";

	public B() {
		System.out.println("This constructor is from class B class which is public");
	}

	public void b() {
		System.out.println("This method is coming from class B which is public");
	}

	public static void main(String[] args) {
		System.out.println("\n---------- Inside same package, public type modifier content of Parent class [C] can be accessed by sub/child class (Here B) ----------");
		B b = new B();
		b.cMethod();
		
		System.out.println("\n---------- public type modifier content of Parent class [N] from different package can be accessed in non-sub/child class (Here B)  ----------");
		System.out.println("---------- The below coded is coming from class N of package 'lec16_08_java_access_modifier_class_from_outside_package' ----------\n");
		N n1 = new N();
		n1.n1();
		

	}

}
