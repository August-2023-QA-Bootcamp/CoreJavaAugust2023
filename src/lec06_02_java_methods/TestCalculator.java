package lec06_02_java_methods;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator1 cal1 = new Calculator1();
		cal1.addition();
		cal1.subtraction();
		cal1.multipliaction();
		cal1.division();
		
		System.out.println("-----------------------------------------------------\n");
		Calculator2 cal2 = new Calculator2();
		cal2.sum();
		cal2.myName();
		
		System.out.println("-----------------------------------------------------\n");
		Calculator3 cal3 = new Calculator3();
		// cal3 can call addition(), myName(), subtraction(), mutiplication()
		// But we use them inside Constructor, so when object is created, Constructor initialized, and the methods inside Constructor are initialized too
		
		System.out.println("-----------------------------------------------------\n");
		Calculator4 cal4 = new Calculator4();
		cal4.subtraction();
		
		System.out.println("-----------------------------------------------------\n");
		Calculator5 cal5 = new Calculator5();
		cal5.addition(4.5463f, 6.5672f);
		cal5.addition(1.34f, 667.4321f);
		cal5.addition(2.34f, 7.4321f);
		// What is the advantage of using parameterized method?
		// you can reuse that method as many time as you want with different argument
		
		cal5.subtraction(2.33f, 0.331f);
		cal5.subtraction(7.33f, 10.331f);
		cal5.subtraction(9.33f, 8.331f);
		
		cal5.division(88.332f, 12.003f);
		cal5.division(18.332f, 2.003f);
		cal5.division(5.332f, 1.003f);
		
		System.out.println("-----------------------------------------------------\n");
		Calculator6 cal6 = new Calculator6();
		cal6.allMethods(32242, 42);
		
		cal6.stName("Shabnin", "Shahrin");
		cal6.stName("Tania", "Sultana");
		cal6.stName("Abdullah", "Baki");
		
		cal6.employee("Pronoy", 320423, 'M', true);
		cal6.employee("Tanzila Zafar", 73043, 'M', true);
		cal6.employee("Tanvir Saimoon", 9088458, 'M', true);
		cal6.employee("Shaila Mukta", 1088458, 'F', true);
		
		System.out.println("-----------------------------------------------------\n");
		Calculator7 cal7 = new Calculator7();
		cal7.addition(45, "21");
		cal7.addition(32, "66");
		// cal7.addition(34, "Tofael"); // see what kind of error come
		cal7.multiplication(3.65426, "2.73687");	
		cal7.multiplication(3.65426, "2.73687");
		cal7.subtraction(323, 24.4234);
		cal7.division01(62357, 642.823974f);
		cal7.division02(2357, 42.84f);
		
		System.out.println("------------------------------------------------\n");
		Calculator8 cal8 = new Calculator8();
		cal8.division();
		cal8.multiplication();
		
	}

}
