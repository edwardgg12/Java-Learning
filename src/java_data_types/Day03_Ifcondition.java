package java_data_types;

public class Day03_Ifcondition {

	public static void main(String[] args) {
		// if Statement
		
		if(2 == 2) {
			System.out.println("the value is 2");
			
		}
		System.out.println("After the if statement");
		// false statement
		if (2==3) {
			System.out.println("the value is not 2");
		}
		
		
		int a = 31;
		if (a==30) {
			System.out.println("The value of a is 30");
		} else {
			System.out.println("The value of is not 30");
		}
//// task //////		
		double aa = 10.78;
		double bb = 35.99;
		
		if (aa == bb) {
			System.out.println("the value is same");
			
		}else {
			System.out.println("the value is diferent");
		}
		
		if (aa < 10) {
			System.out.println("Positivo");
		}else {
			System.out.println("Negativo");
		}
		
		int bbb = 0;
		if (bbb > 0) {
			System.out.println("The value is positive");
		} else {
			System.out.println("The values is negative");
		}
		
		char value = 'j';
		if (value == 'a') {
			System.out.println("The values is a");
		}else if (value == 'b') {
			System.out.println("The value is b");
		}else if (value == 'c') {
			System.out.println("The value is c");
		}else if (value == 'd') {
			System.out.println("The value is d");
		}else {
			System.out.println("The value is something else");
		}
		
		String day = "monday";
		
		if (day == "monday") {
			System.out.println("The day is monday");
		} else if (day == "tuesday") {
			System.out.println("The day is tuesday");
		} else if (day == "wednessday") {
			System.out.println("The day is wednessday");
		} else if (day == "thursday") {
			System.out.println("The day is thursday");
		} else if (day == "friday") {
			System.out.println("The day is friday");
		} else if (day == "saturday") {
			System.out.println("The day is saturday");
		} else if (day == "sunday") {
			System.out.println("The day is sunday");
		}else {
			System.out.println("You have enterred an invalid day of the week");
		}
			
		
		int day2 = 2;
		
		if (day2 == 1) {
			System.out.println("The day is monday");
		} else if (day2 == 2) {
			System.out.println("The day is tuesday");
		} else if (day2 == 3) {
			System.out.println("The day is wednessday");
		} else if (day2 == 4) {
			System.out.println("The day is thursday");
		} else if (day2 == 5) {
			System.out.println("The day is friday");
		} else if (day2 == 6) {
			System.out.println("The day is saturday");
		} else if (day2 == 7) {
			System.out.println("The day is sunday");
		}else {
			System.out.println("You have enterred an invalid day of the week");
		}
		
		boolean isRaining = true;
		
		if(isRaining == true) {
			System.out.println("It is raining");
		}else {
			System.out.println("It is not raining");
		}
			
		
	}

}
