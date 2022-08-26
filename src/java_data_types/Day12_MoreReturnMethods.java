package java_data_types;

public class Day12_MoreReturnMethods {

	public static void main(String[] args) {
		
		int sum = task();
		if(sum%2==0) {
			System.out.println("The sum is even");
		}else {
			System.out.println("The sum is odd");
		}
		
		
		int sum2 = task2(4, 3);
		System.out.println(sum2);
		
		boolean a = isRaining();
		System.out.println(a);
		
		
				
		// non void method without parameters
		// write a method which is going to return the sum of two values
		// which is a = 5 and b = 90 if the mod is 0 we can print the sum is even number
		
		
	}

	private static boolean isRaining() {
		// TODO Auto-generated method stub

		return true;
	}

	private static int task() {
		int a = 5;
		int b = 90;
		int sum = a + b;
		return sum;
	}

	private static int task2(int a, int b) {
		int sum2 = a + b;
		return sum2;
		
	}
	
	
	
}
