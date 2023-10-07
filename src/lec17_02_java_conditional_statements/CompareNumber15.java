package lec17_02_java_conditional_statements;

public class CompareNumber15 {

	public static void main(String[] args) {
	/*	
		int age1 = 18;
		
		if (age1<18) {
			System.out.println("You can't vote");
		} else {
			System.out.println("You are a voter, you can vote");
		}
	*/
		
		
	int age = 17;
	
	String outcome = (age<18) ? "You can't vote" : "You are a voter, you can vote" ;
	System.out.println(outcome);	
		

	}

}
