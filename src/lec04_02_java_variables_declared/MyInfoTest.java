package lec04_02_java_variables_declared;

public class MyInfoTest {

	public static void main(String[] args) {
		
		MyInfo tofael = new MyInfo(); // Constructor initialized
		tofael.myName = "Mohammad Sharkar"; // variable initialized
		tofael.myAge = 100;
		tofael.myApartmentRent = 30000;
		tofael.myYearlySalary = 547263546;
		tofael.myBankBalance = 76858384872682l;
		tofael.myHeight = 1.6453f;
		tofael.myGrade = 3.53874653;
		tofael.myGender = 'M';
		tofael.usCitizen = true;		
		tofael.myInfo(); // method initialized
		
		System.out.println("\n------------------------------------");
		MyInfo amber = new MyInfo();
		amber.myName = "Amber Diamond";
		amber.myAge = 44;
		amber.myApartmentRent = 26000;
		amber.myYearlySalary = 453624361;
		amber.myBankBalance = 65842847263486l;
		amber.myHeight = 1.87653f;
		amber.myGrade = 3.1221223;
		amber.myGender = 'F';
		amber.usCitizen = false;
		amber.myInfo();
		
		System.out.println("\n------------------------------------");
		MyInfo shabnin = new MyInfo();
		shabnin.myName = "Shabnin";
		shabnin.myAge = 120;
		shabnin.myApartmentRent = 19000;
		shabnin.myYearlySalary = 542384624;
		shabnin.myBankBalance = 7325457263562l;
		shabnin.myHeight = 1.603f;
		shabnin.myGrade = 3.84283742;
		shabnin.myGender = 'F';
		shabnin.usCitizen = true;
		shabnin.myInfo();

		System.out.println("\n----------------------------------------");

		MyInfo aroah = new MyInfo();
		aroah.myName = "Aroah";
		aroah.myAge = 23;
		aroah.myApartmentRent = 32445;
		aroah.myYearlySalary = 1782364;
		aroah.myBankBalance = 86536472686l;
		aroah.myHeight = 1.679f;
		aroah.myGrade = 3.488346;
		aroah.myGender = 'F';
		aroah.usCitizen = false;		
		aroah.myInfo();

	}

}
