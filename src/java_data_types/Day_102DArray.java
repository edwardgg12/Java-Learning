package java_data_types;

public class Day_102DArray {

	public static void main(String[] args) {
		
//		String [][] countries = new String [2][2];
//		countries [0][0] = "USA";
//		countries [0][1] = "Canada"; 
//		countries [1][0] = "Switzerland";
//		countries [1][1] = "France";
		
		
//		System.out.println(countries [1][1]);
//		System.out.println(countries [1][0]);
		
		
		
//		int [][] age = new int [2][2];
//		age [0][0] = 20;
//		age [1][0] = 30;
//		age [0][1] = 40;
//		age [1][1] = 50;
		
//		System.out.println(age [1][0]);
		
//		int [][] _TruckNumber = {
//				 {60,70,80,90},
//				 {100,110,120,130},
//				 {20,30,40,50}
				 
//		};
//		System.out.println(_TruckNumber [0][1]);
//		System.out.println(_TruckNumber [1][2]);
		
		
		String [][] _Countries = {
				{"USA", "Canada"},
				{"France", "Switzerland", "Ireland"},
				{"Germany", "England"}
		};
//			System.out.println(_Countries [0][1]);
//			System.out.println(_Countries [2][1]);
			
		System.out.println(_Countries.length);
		System.out.println(_Countries[0].length);
		
		for(int rows=1; rows<_Countries.length; rows++) {
			for(int column = 1; column<_Countries[rows].length; column++) {
				System.out.println(_Countries[rows][column]);
			}
		}
		
		int [][] TruckNumber = {
				 {60,70,80,90},
				 {100,110,120,130},
				 {20,30,40,50}
				 
		};		
		for(int rows=1; rows<TruckNumber.length; rows++) {
			for(int column=2; column<TruckNumber[rows].length; column++) {
				System.out.println(TruckNumber[rows][column]);
			}
		}
			
		
	}

}
