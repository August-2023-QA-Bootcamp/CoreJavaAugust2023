package lec14_02_java_oop_abstraction_final;


public interface Car  {
	public void start ();
	public void stop();
	public abstract String brake(String brakeName);
	
	public default void honk () {
		System.out.println("This Honk feature came from Car Interface");
	}
	
	public static void gear () {
		System.out.println("This Gear feature is from Car Interface");
	}
	
	

}
