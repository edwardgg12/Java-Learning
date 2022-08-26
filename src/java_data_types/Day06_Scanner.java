package java_data_types;

import java.util.Scanner;

public class Day06_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// classname objectname = new classname ();
		
		Scanner takeInput = new Scanner(System.in);
		System.out.println("Enter the int value : ");
		int val1 = takeInput.nextInt();
		System.out.println("The enterred value is : "+val1);
		
		// nextBoolean (true, false)
		System.out.println("Is it raining outside");
		boolean val2 = takeInput.nextBoolean(); //true or false
		System.out.println("If it is true it is raining, if its false its not raining : "+val2);
		
		// next (String)
		System.out.println("Enter you name : ");
		String name = takeInput.next();
		System.out.println("The name you enterred is : "+name);
		
		//next double
		System.out.println("Enter mount : ");
		double pay_check = takeInput.nextDouble();
		System.out.println("The mount enterred is : "+pay_check);
		
		// next byte 
		System.out.println("Enter the age : ");
		byte age = takeInput.nextByte();
		System.out.println("The weight enterred is : "+age);
		
		// next float
		System.out.println("Enter the weight");
		float weight = takeInput.nextFloat();
		System.out.println("The enterred weight is : "+weight);
		
		
		
		
	
		
	}

}
