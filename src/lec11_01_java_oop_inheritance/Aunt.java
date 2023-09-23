package lec11_01_java_oop_inheritance;

// Here Aunt is a child class and GrandFather is a parent class
// we use 'extends' keyword to inherit the parent class
// extends keyword allows only single inheritance, not more than one parent class
// the keyword is 'extends', not 'extend', be careful during interview

// A class can't be private or protected type
// it can be only public or default type in terms of access modifier
public class Aunt extends GrandFather {
	public void auntInfo() {
		System.out.println("Grandfather: Ismail, Aunt: Jamila");
	}

}
