package java_data_types;

import java.util.Scanner;

public class Day07_Loopsjava {

	public static void main(String[] args) {
		
		//System.out.println("Before the loop");
		//for(int i=2; i<=10;i++) {
			//System.out.println("Hello world");
		//}
			//System.out.println("After the loop");
			
	
		//for (int a=0; a<=100;a++) {
			//System.out.println(a);
		//}
			
		//for (int a=100; a>=0;a--) {
			//System.out.println(a);
		//}
		
		//for (int a=20; a<=50;a++) {
			
			//if(a%2 == 0 ) {
				//System.out.println(a);
			//}
		//}
		
		//for (int a=20; a<=50;a++) {
			
			//if(a%2 == 1 ) {
				//System.out.println(a);
			//}
		//}
			
		///for (int a=0; a<2;a++) {
			///Scanner month1 = new Scanner (System.in);
			///System.out.println("What month you were born");
			///String month = month1.next();
				///	switch (month) {
					
					///case "January":
						///System.out.println("You born in winter");
						///break;
					///case "February":
						///System.out.println("You born in winter");
						///break;
					///case "March":
						///System.out.println("You born in winter");
						///break;
					///case "April":
						///System.out.println("You born in spring");
						///break;
					///case "May":
						///System.out.println("You born in spring");
						///break;
					///case "June":
						///System.out.println("You born in spring");
						///break;
					///case "July":
						///System.out.println("You born in summer");
						///break;
					///case "August":
						///System.out.println("You born in summer");
						///break;
					///case "September":
						///System.out.println("You born in summer");
						///break;
					///case "October":
						///System.out.println("You born in fall");
						///break;
					///case "November":
						///System.out.println("You born in fall");
						///break;
					///case "December":
						///System.out.println("You born in fall");
						///break;				
						
						///default:
							///System.out.println("Provide the valid month");
						
					///}
		///}
		
			//Scanner monthInput = new Scanner (System.in);
			//for (int a=0; a<3; a++) {
				//System.out.println("Enter the month you were born : ");
				//String monthName = monthInput.next();
				//if (monthName.equalsIgnoreCase("Jan") || monthName.equalsIgnoreCase("Feb") || monthName.equalsIgnoreCase("Mar")) {
				//	System.out.println("Winter");
				//} else if (monthName.equalsIgnoreCase("Apr") || monthName.equalsIgnoreCase("May") || monthName.equalsIgnoreCase("Jun")) {
				//	System.out.println("Spring");
				//} else if (monthName.equalsIgnoreCase("Jul") || monthName.equalsIgnoreCase("Aug") || monthName.equalsIgnoreCase("Sep")) {
				//	System.out.println("Summer");
				//} else if (monthName.equalsIgnoreCase("Oct") || monthName.equalsIgnoreCase("Nov") || monthName.equalsIgnoreCase("Dec")) {
				//	System.out.println("Fall");
				//} else {
				//	System.out.println("Provide the valid month");
				//}
					
					
			//}
		
			Scanner Yearcar = new Scanner (System.in);
			System.out.println("Enter the year car");
			int Caryear = Yearcar.nextInt();
			
				if (Caryear <= 2000 || Caryear <= 2005) {
					System.out.println("discount 30%");
				} else if (Caryear <=(2010) || Caryear <=(2020)) {
					System.out.println("discount 50%");
				} else {
					System.out.println("not discount");
				}
			
			
					
		
			
	}

}
