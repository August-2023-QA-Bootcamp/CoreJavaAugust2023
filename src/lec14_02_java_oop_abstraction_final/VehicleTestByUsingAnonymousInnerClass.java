package lec14_02_java_oop_abstraction_final;

public class VehicleTestByUsingAnonymousInnerClass {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class Toyota ------------------------\n");
		Toyota toyota = new Toyota(); 
		toyota.toyotaInfo();
		toyota.battery();
		toyota.start();
		toyota.stop();
		toyota.price();
		toyota.brake("ABC");		
		toyota.honk();
	
		// This is high level
		// A QA don't need to know
		// If a Interview question: what’s the other way to instantiate an interface with out implementing a class
		System.out.println("\n--------------------- Interface Car ------------------------\n");
		Car car = new Car() {
		// Instantiated by anonymous inner class Car, no need of concrete class	
			
			@Override
			public void stop() {
				System.out.println("stop method from Car Interface");
				
			}
			
			@Override
			public void start() {
				System.out.println("start method from Car Interface");
				
			}
			
			@Override
			public String brake(String brakeName) {
				String m = "brake method from Car Interface";
				System.out.println(m);
				return m;
			}
		};
		
		car.start();
		car.stop();
		car.brake("DEF");
		car.honk();
		Car.gear();
		
		System.out.println("\n--------------------- Abstract class ElectricCar ------------------------\n");
		ElectricCar electricCar = new ElectricCar() {
			
			@Override
			public void price() {
				System.out.println("price method from ElectricCar Abstract class");
				
			}
		};	
		electricCar.battery();
		electricCar.price();
		
	}

}
