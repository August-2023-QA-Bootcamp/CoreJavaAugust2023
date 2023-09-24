package lec11_06_java_access_modifier_default_type;

import lec11_07_java_access_modifier_class_from_outside_package.M;

public class L extends M {
	void lMethod() {
		System.out.println("This method is from L class (Here as a parent class) which is default");
	}

	public static void main(String[] args) {
		System.out.println(
				"\n---------- default type modifier content of Parent class [M] from different package can't be accessed by sub/child class (Here L)  ----------");
		System.out.println(
				"---------- The below is coming from class M of package 'lec16_08_java_access_modifier_class_from_outside_package' ----------\n");
		L l = new L();
		// l.m4();
	}
}
