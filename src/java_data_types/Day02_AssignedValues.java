package java_data_types;

public class Day02_AssignedValues {
	// default value
	static int b;
	static char c;
	static double e;
	static float g;
	static boolean i;
	static String k;

	public static void main(String[] args) {
		//initializing a variable
		//the variable name is a and the value is 5
		int a = 5;
		// declared a variable b
	
		System.out.println(a);
		System.out.println(b);
		// initialize a char variable d
		char d = 'h';
		System.out.println(c);
		System.out.println(d);
		double f = 10.123456789012345;
		System.out.println(e);
		System.out.println(f);
		float h = 10.123456789012345f;
		System.out.println(g);
		System.out.println(h);
		boolean j = true;
		System.out.println(i);
		System.out.println(j);
		String l = "Helllo";
		System.out.println(k);
		System.out.println(l);
		
		
		String first_name = "Edward";
		String last_name = "Gutierrez";
		System.out.println(first_name + last_name);
		System.out.println(first_name + ' ' + last_name);
		
		String city = "Lima";
		String country = "Peru";
		System.out.println(city + ' ' + country);
		System.out.println("**************************************");
		System.out.println("Arithemtatic Example");
		System.out.println("**************************************");
		
		int value1 = 50;
		int value2 = 10;
		//Addition
		System.out.println(value1 + value2);
		
		int sum = value1 + value2;
		System.out.println(sum);
		//Subtraction
		int sub = value1 - value2;  //-5
		System.out.println(sub);
		
		// Division
		System.out.println(value1 / value2);
		int div = value1/value2;
		System.out.println(div);
		
		// multiplication
		System.out.println(value1 * value2);
		int mul = value1 * value2;
		System.out.println(mul);
		
		// mod
		System.out.println(value1 % value2);
		int mod =  value1%value2;
		System.out.println(mod);
		
		
		// task 1 (316)
		int number = 18;
		System.out.println(number);
		double decimal = 20.09;
		System.out.println(decimal);
		char initial_name = 'E';
		System.out.println(initial_name);
		
		// task 2
		
		int age = 5;
		double pay = 6.2;
		System.out.println(age + pay);
		
		float b = 3.9f;
		System.out.println(b * b);
		
		byte length = 2;
		byte width = 3;
		int area = length * width;
		System.out.println(area);
		System.out.println("**************************************");
		System.out.println("Operators");
		System.out.println("**************************************");
		
		
		int aa =  500;
		int bb = 600;
		System.out.println(aa == bb);//true
		boolean cc = aa==bb;
		System.out.println(cc);
		
		boolean dd = aa != bb;
		System.out.println(dd);
		
		System.out.println(aa > bb);
		boolean ee = aa > bb;
		System.out.println(ee);
		
		System.out.println(200 >= 200);
		boolean ff = 200 >= 200;
		System.out.println(ff);
		
		System.out.println(100 < 200);
		boolean gg = 100 < 200;
		System.out.println(gg);
		
		System.out.println(2000 <= 300);
		boolean hh = 2000 <= 300;
		System.out.println(hh);
			
				
		
		
				
				
		
		
		
		
		
	}
}



