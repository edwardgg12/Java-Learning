package java_data_types;

import java.util.Scanner;

public class homework_day10 {

	public static void main(String[] args) {
		
		// lets say user enters 5
		// it should ask user to enter those 5 values
		// once the user enters those 5 values it should print the sum of those 5 values
		// Scanner, One dimensional Array, for loop		

		
//		Scanner Val = new Scanner (System.in);
//		System.out.println("How many values :");
//		int Num = Val.nextInt();
		
//		int [] Number = new int [Num];
//		System.out.println("Enter value :");
//		int sum = 0;
			
//		for (int a=0; a<Number.length; a++) {
			
//			sum = sum + Number [a];		
//		}
//		System.out.println("The sum is :"+sum);
		

		Scanner getInput = new Scanner (System.in);
		System.out.println("How many values do you need to do a sum for :");
		int values = getInput.nextInt();
		
		int[] arr = new int[values];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the "+(i+1)+"value :");
			arr[i] = getInput.nextInt();
			sum = sum + arr[i];
				
		}
		System.out.println("The sum of "+arr.length+" values is :"+sum);	
		
		
	}

}
