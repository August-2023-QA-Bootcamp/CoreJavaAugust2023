package lec11_06_java_access_modifier_default_type;

public class J extends K{
	String info4 = "This is coming from a variable which is default";

	J() {
		System.out.println("This is coming from a constructor which is default");
	}

	void msg4() {
		System.out.println("This is coming from a method which is default");
	}
	
	public static void main(String[] args) {
		System.out.println("\n---------- default type modifier content can be accessed inside the same class ----------");
		J j = new J();
		System.out.println(j.info4);
		j.msg4();
		
		System.out.println("\n---------- Inside same package, default type modifier content of Parent class [K] can be accessed by sub/child class (Here J) ----------");
		K k = new K();
		System.out.println(k.name4);
		k.k();
		
	}

}
