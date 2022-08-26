package oneEdw;

public class ClassEdw1 {
	
	public int a1 = 20;
	private int b1 = 30;
	protected String c1 = "Edward";
	

	public static void main(String[] args) {
		ClassEdw3 v1 = new ClassEdw3();
		 
		System.out.println(v1.sexo);
		
		v1.dormirse();
		
		System.out.println(v1.sexo);
		System.out.println(v1.phone);
		
		v1.levanta();
		
		System.out.println(v1.Accion1);

	}

	public static void methEdw1 () {
		System.out.println("Method one");
	}
	
}
