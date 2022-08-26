package Packageone;

import Packagetwo.ClassTree;

public class ClassOne2 {
	public int a1 = 10;
	private int b1 = 20;
	int c1 = 90;

	public static void main(String[] args) {
		ClassOne2 c1 = new ClassOne2();
		c1.methodSeven();
		System.out.println(c1.c1);

		
	ClassTree c3 = new ClassTree();

	}
	
	static void methodSeven() {
		System.out.println("This is method Seven");
	}
	
	
	
	
	public static void methodOne () {
		System.out.println("This is method 1");
		
	}
	
	private static void methodFour() {
		System.out.println("This method is 4");
	}
	
	
}
