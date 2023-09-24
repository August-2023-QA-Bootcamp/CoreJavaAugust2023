package lec11_04_java_access_modifier_protected_type;

public class D extends E {
	protected String info2 = "This is coming from a variable which is protected";

	protected D() {
		System.out.println("This is coming from a constructor which is protected");
	}

	protected void msg2() {
		System.out.println("This is coming from a method which is protected");
	}
	
	public static void main(String[] args) {
		System.out.println("\n---------- protected type modifier content can be accessed inside the same class ----------");
		D d = new D();
		System.out.println(d.info2);
		d.msg2();
		
		System.out.println("\n---------- Inside same package, protected type modifier content of Parent class [E] can be accessed by sub/child class (Here D) ----------");
		E e = new E();
		System.out.println(e.name2);
		e.e();
		
	}

}
