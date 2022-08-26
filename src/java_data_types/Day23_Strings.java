package java_data_types;

public class Day23_Strings {

	public static void main(String[] args) {
		
		String topic = new String("What is the topic we are learning today ?");
		System.out.println(topic.length());
		String firtsname = "EDW";
		
		String name = new String("John");
		String lastname = "JOHN";
		System.out.println(name.length());
		System.out.println("This will print the length of name variable :"+name.length());
		System.out.println(name);
		System.out.println("This will print the name variable :"+name);
		System.out.println(name.toLowerCase());
		System.out.println("This will convert the name variable to lowercase :"+name.toLowerCase());
	
		System.out.println(topic.toUpperCase());
		// name = JOHN
		// name.toLowerCase = john
		System.out.println("Using equalsignorecase : "+name.equalsIgnoreCase(name.toLowerCase()));
		System.out.println("Using equals method : "+name.equals(lastname));
		System.out.println(name.compareTo(lastname));
		System.out.println(name.compareToIgnoreCase(lastname));

		// if the value is 0 we print the value is 0 if tha value is negative print the value is negative
		// if the value is positive print the value is positive
		// task
		// fName, lName
		
		
		String fName = "Edward";
		String lName = "Guti";
		
		int value = fName.compareToIgnoreCase(lName);
		
		if (value == 0 ) {
			System.out.println("The value is 0");
		} else if (value < 0) {
			System.out.println("The value is negative");
		} else {
			System.out.println("The value is positive");
		}
		
	}

}
