package java_data_types;

import javax.swing.filechooser.FileNameExtensionFilter;

public class Day09_Arrays {

	public static void main(String[] args) {
		
		int a; // declare the variable
		a = 50; // initialize the variable
		
//		int [] rollNumber; // declare an array variable
//		rollNumber = new int[5];
		
		int [] _rollNumber = new int[5];
		_rollNumber [0] = 500;
		_rollNumber [1] = 300;
		_rollNumber [2] = 100;
		_rollNumber [3] = 400;
		_rollNumber [4] = 200;
		
		System.out.println(_rollNumber [4]);
		
		
		int [] rollNum = {100,200,300,400,500};
		System.out.println(rollNum[4]);
		
		
		String [] ChineYear = new String [8];
		ChineYear [0] = "Monkey";
		ChineYear [1] = "Dog";
		ChineYear [2] = "Chicken";
		ChineYear [3] = "Rat";
		ChineYear [4] = "Snake";
		ChineYear [5] = "Dragon";
		ChineYear [6] = "Shark";
		ChineYear [7] = "Horse";

		System.out.println(ChineYear [3]);
		
		String [] _ChineYear = {"Monkey", "Dog", "Chicken", "Rat", "Snake", "Dragon", "Shark", "Horse"};
		System.out.println(_ChineYear [5]);

		
		int [] CarYear = new int [6];
			CarYear [0] = 2000;
			CarYear [1] = 2005;
			CarYear [2] = 2010;
			CarYear [3] = 2015;
			CarYear [4] = 2020;
			CarYear [5] = 2025;
			
		System.out.println(CarYear.length);
		
		
		int [] roll_Num = {100,200,300,400,500,100,200,300,400,500,100,200,300,400,500};
//		System.out.println(roll_Num[4]);
		System.out.println(roll_Num.length);
		
		for (int i=0;i<roll_Num.length;i++) {
			System.out.println(roll_Num[i]);
		}
		
		
		String [] _Chine_Year = {"Monkey", "Dog", "Chicken", "Rat", "Snake", "Dragon", "Shark", "Horse"};
//		System.out.println(_Chine_Year [5]);
		System.out.println(_Chine_Year.length);
		
		
		for (int aa=0;aa<_Chine_Year.length;aa++) {
			System.out.println(_Chine_Year[aa]);
		}
			
			
			
			
			
			
			
			
		
		
	}

}
