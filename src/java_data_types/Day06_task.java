package java_data_types;

import java.util.Scanner;

public class Day06_task {

	public static void main(String[] args) {

		Scanner Input1 = new Scanner (System.in);
		System.out.println("Enter the value");
		int aa = Input1.nextInt();
		System.out.println("Enter the value");
		int bb = Input1.nextInt();
		System.out.println("Enter operation = + - * /");
		char Op = Input1.next().charAt(0);
		
		if (Op == '+') {
			System.out.println(aa+bb);
		}else if (Op == '-') {
			System.out.println(aa-bb);
		}else if (Op == '*') {
			System.out.println(aa*bb);
		}else if (Op == '/') {
			System.out.println(aa/bb);
		}else {
			System.out.println("Wrong operation");
		}
		
			
		

	}

}
