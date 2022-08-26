package java_data_types;

import java.util.Scanner;

public class Day06_Switchhomework {

	public static void main(String[] args) {


		Scanner car = new Scanner (System.in);
		System.out.println("get the car model");
		String model = car.next();
		
	switch(model) {
	
	case "Audi":
		System.out.println("get a bonus of $1,500");
		break;
	case "Toyota":
		System.out.println("get a bonus of $2,000");
		break;
	case "Ford":
		System.out.println("get a bonus of 1,800");
		break;
	case "Honda":
		System.out.println("get a bonus of 1,000");
		break;
		 default:
			 System.out.println("wrong car model");
		
	}
		
		
	}

}
