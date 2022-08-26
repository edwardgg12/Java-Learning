package java_data_types;

public class Day04_Nestedif {

	public static void main(String[] args) {
		// VP 200000 Sr/Jr, IT_PROG 120000, ANALYST 80000
		
		String title = "Developer";
		String role = "Junior";
		
		
		if(title == "VP") {
			System.out.println("Vice President");
			if (role == "Junior") {
				System.out.println("Salary is $200,000");
			} else if (role == "Senior") {
				System.out.println("Salary is $250,000");
			} else {
				System.out.println("The role does not exist");
			}				
		} else if (title == "IT_PROG") {
			System.out.println("IT Programmer");
			if (role == "Junior") {
				System.out.println("Salary is $120,000");
			} else if (role == "Senior") {
				System.out.println("Salary is $170,000");
			} else {
				System.out.println("The role does not exist");
			}			
		} else if (title == "ANALYST") {
			System.out.println("System Analyst");
			if (role == "Junior") {
				System.out.println("Salary is $80,000");
			} else if (role == "Senior") {
				System.out.println("Salary is $130,000");
			} else {
				System.out.println("The role does not exist");
			}			
		} else {
			System.out.println("The role does not exist");
		}
		
		
		

	}

}
