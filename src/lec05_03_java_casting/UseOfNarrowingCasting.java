package lec05_03_java_casting;

public class UseOfNarrowingCasting {

	public static void main(String[] args) {
		// default type access modifier
		double myGrade = 3.659839487;
		System.out.println("What is my Grade? Ans: " + myGrade);
		
		// How can you convert a double to an int type?
		// By Narrowing casting
		int myNewGrade = (int) myGrade;
		System.out.println("What is my new Grade in int? Ans: " + myNewGrade);
		
		// How can you convert a double to a byte type?
		// By Narrowing casting
		byte myGradeInByte = (byte) myGrade;
		System.out.println("What is my new Grade in byte? Ans: " + myGradeInByte);
		
	}

}
