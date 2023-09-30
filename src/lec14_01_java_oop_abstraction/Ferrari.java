package lec14_01_java_oop_abstraction;

// if both present, extends keyword come before implements keyword
// if extends keyword not needed, we can use implements keyword

public class Ferrari implements CableCar {
	public void ferrariInfo() {
		System.out.println("Invented in Italy");
	}

	@Override
	public void cheap() {
		System.out.println("cheap method is from CableCar Interface");
		
	}
}
