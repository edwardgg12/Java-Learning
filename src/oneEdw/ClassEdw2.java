package oneEdw;

public class ClassEdw2 extends ClassEdw1 {

	public int c1 = 40;
	
			
	public static void methEdw2() {
		System.out.println("Method two");
		
		
		ClassEdw1 v2 = new ClassEdw1();
		v2.methEdw1();
		System.out.println(v2.a1);
		
		v2.methEdw1();
		System.out.println(v2.c1);
	
		
		
		
	}
}
