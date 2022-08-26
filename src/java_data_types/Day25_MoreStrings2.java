package java_data_types;

public class Day25_MoreStrings2 {

	public static void main(String[] args) {
		
		String name = "Hello World";
		char[] characters = name.toCharArray(); // {'H','e','l','o', ..........
		
		System.out.println(characters.length);
		
		for (int i=0; i<characters.length;i++) {
			System.out.println(characters[i]);
		}
		
		String sentence = "Hello today we are learning more strings";
		String [] words = sentence.split(" "); //{Hello, today, we, .............
					
		for (int i=0; i<words.length;i++) {
			String word = words[i];
			char[] characs = word.toCharArray();
			for(int j=0;j<characs.length;j++) {
				System.out.println(words[i]);
			}
		}
		
		String carName = "Audi";
		char [] auto = carName.toCharArray();
		for (int i=0; i<auto.length;i++) {
			System.out.println(auto [i]);
		}
		
		String wOrld = "!2#4Ef%hD)7%ot+W{54$#";
		String aaa = wOrld.replaceAll("[A-Za-z0-9]", "");
				System.out.println(aaa.length());
		
		
	}

}
