package Packageone;

import Packagetwo.ClassTree;

public class ClassOne {
	public int a1 = 10;
	private int b1 = 20;
	

	public static void main(String[] args) {
		ClassOne c1 = new ClassOne ();
		c1.methodOne();
		System.out.println(c1.a1);
		
		Classfour c4 = new Classfour();
		System.out.println(c4.a4);
		
		ClassTree c3 = new ClassTree();
		c3.methodThree();
		System.out.println(c3.a3);
		
		
		//private
		c1.methodFour();
		System.out.println(c1.b1);
		
		Classfour c4_1 = new Classfour();
		//System.out.println(c4_1.b4); variable is not accessible because is private
		
	
		

	}

	
	public static void methodOne () {
		System.out.println("This is method 1");
		
	}
	
	private static void methodFour() {
		System.out.println("This method is 4");
	}
	
	
}
