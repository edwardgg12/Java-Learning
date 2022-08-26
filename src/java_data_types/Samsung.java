package java_data_types;

public class Samsung extends Phone {

	public static void main(String[] args) {
		
		Samsung mobl = new Samsung();
		mobl.imei = 7654321;
		mobl.make = "Samsung";
		mobl.model = "Note";
		mobl.color = "Blue";
		mobl.memory = 124;
		mobl.camera = "13";
		
		mobl.makecalls();
		
		
		
	}
	
	
}
