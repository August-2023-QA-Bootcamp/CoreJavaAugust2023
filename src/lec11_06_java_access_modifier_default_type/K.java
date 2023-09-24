package lec11_06_java_access_modifier_default_type;

import lec11_07_java_access_modifier_class_from_outside_package.N;

public class K extends L {
	String name4 = "This variable is coming from K which is default";

	K() {
		System.out.println("This constructor is from K class which is default");
	}

	void k() {
		System.out.println("This method is coming from K which is default");
	}

	public static void main(String[] args) {
		System.out.println(
				"\n---------- Inside same package, default type modifier content of Parent class [L] can be accessed by sub/child class (Here K) ----------");
		K k = new K();
		k.lMethod();

		System.out.println(
				"\n---------- default type modifier content of Parent class [N] from different package can't be accessed in non-sub/child class (Here H)  ----------");
		System.out.println(
				"---------- The below code is coming from class N of package 'lec16_08_java_access_modifier_class_from_outside_package' ----------\n");
		N n4 = new N();
		// n4.n4();

	}
}
