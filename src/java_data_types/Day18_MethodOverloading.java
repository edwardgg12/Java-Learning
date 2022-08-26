package java_data_types;

import java.util.Scanner;

public class Day18_MethodOverloading {

	public static void main(String[] args) {
		
		addition(10, 20);
		addition(5,4,3);
		addition(3, 5.33f);
		addition("Hello " , "World");	
		
		
		Scanner Value = new Scanner (System.in);
			System.out.println("How many values do you need enter :");
		int ValueAA = Value.nextInt();
		
				
		int [] aaa = new int [ValueAA];
		int sum = 0;
		
		for (int i=0;i< aaa.length;i++) {
			System.out.println("Value"+(i+1)+"is :");
			aaa[i] = Value.nextInt();
			sum = sum + aaa[i];
			
		}
		System.out.println("The sum is : "+sum);	
		
	}

	
	
	// method overloanding by changing the number of parameters
	static void addition(int a, int b)
	{
		System.out.println(a + b);
	}
	
	static void addition(int a, int b, int c)
	{
		System.out.println(a + b + c);
	}

	// method overloading by changing the type of variables
	static void addition(int a, float b)
	{
		System.out.println(a + b);
	}
	static void addition(String a, String b)
	{
		System.out.println(a + b);
	}




}





