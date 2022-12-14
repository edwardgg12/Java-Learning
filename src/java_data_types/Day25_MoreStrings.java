package java_data_types;

public class Day25_MoreStrings {

	public static void main(String[] args) {
		
		String words = "!@#$J#1#m$%O%3^i&4*H(5)k_6+N7e8";
		String noNumbers = words.replaceAll("[0-9]", "");
			System.out.println("Before removing [0-9] numbers :"+words);
			System.out.println("After removing [0-9] numbers :"+noNumbers);
			
		String noUpperCase = words.replaceAll("[A-Z]", "");
			System.out.println("After removing [A-Z] characters :"+noUpperCase);
		String noLowerCase = words.replaceAll("[a-z]", "");
			System.out.println("After removing [a-z] characters :"+noLowerCase);
		
		String onlySpecialCharacters = words.replaceAll("[A-Za-z0-9]", "");
			System.out.println("This will show special characters only"+onlySpecialCharacters);
			
		String showNumbersOnly = words.replaceAll("[^0-9]", "");
			System.out.println(showNumbersOnly);
		String showUpperCase = words.replaceAll("[^A-Z]", "");
			System.out.println(showUpperCase);
		String showLowerCase = words.replaceAll("[^a-z]", "");
			System.out.println(showLowerCase);
			
			
			
			
	}

}
