package lec12_03_java_enumeration;

public class Shirt {
	// chart is Size type variable which is Enum type
	Size chart;
	
	// we wrote default constructor because , 
	// this is a norm when we create parameterized constructor line 13
	public Shirt () {
		
	}

	public Shirt(Size chart) {
		super();
		this.chart = chart;
	}
	
	public void findMyShirtSize() {
		
		switch(chart) {
		
		case SMALL:
			System.out.println("Small Size Shirt is Selected by User");
			break;
		
		case MEDIUM:
			System.out.println("Medium Size Shirt is Selected by User");
			break;
		
		case LARGE:
			System.out.println("Large Size Shirt is Selected by User");
			break;
				
		case XLARGE:
			System.out.println("Extra Large Size Shirt is Selected by User");
			break;
		
		default:
			System.out.println("Sorry we are out of Stock");
			break;
		
		}
	
   }
	
}
