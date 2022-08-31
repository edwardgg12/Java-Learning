package java_data_types;

final class example1 {
	final int a = 10;
	final String api = "ASDFGHG34567";
	
	final void methodOne()
	{
		System.out.println("This is methodOne from example1 class"+a);
	}
	
}

/*
 * If you have a final keyword with the class you cannot perform inheritance
 * If you have a final keyword with the variable you cannot re-initialize a new value
 * If you have a final keyword with the method you cannot perform overriding
 * 
 */

class example4 {
	
	}

public class Day28_Final {

	public static void main(String[] args) {
		example1 ex = new example1();
		ex.methodOne();
		
		
		

	}

}
