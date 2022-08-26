package java_data_types;

public class Day12_Methods {

	public static void main(String[] args) {
//		name();
		
//		name2("John");
//		name2("Ali");
//		name2("Ken");
		
//		name3("John", 25);
//		name3("Mike", 35);
//		name3("Steve", 28);
		
		
//		String a = day(); // in return it is going to give me String value
//		System.out.println(a);
		
//		String b = month(); // August
//		System.out.println(b);
		
//		int a = Stnumber();
//		System.out.println(a);
		
	
		String value = topic(" void and non void methods");
		System.out.println(value);
		
		System.out.println(topic(" parameterized and non parameterized methods"));
		
		
		
		
	}
	
	public static int Stnumber() {
		int number = 30;
		return number;
	}
	
	public static String topic(String a) {
		return "Today we are learning"+a;
	}
	
	
	
	
	//non void method without parameter
	public static String day() {
		String todaysDay = "Tuesday";
		return todaysDay;
		
	}
	
	public static String month() {
		return "August";
	}
	
	// method without parameter
	public static void name () {
		System.out.println("My name is Waqas Khan");
	}
	
	// method with parameter
	public static void name2(String a) {
		System.out.println(" My name is "+a);
	}
	
	public static void name3(String name, int age) {
		System.out.println(name + " is " + age + " yeard okd ");
	}
	
	
	
	
	
	
}
