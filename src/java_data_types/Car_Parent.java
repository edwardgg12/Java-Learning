package java_data_types;

public class Car_Parent {

	String Color = "Black";
	boolean Sedan = false;
	int Year = 2003;
	String Type = "SUV";
	String Model = "XL";
	
	
	
	void Car_method() {
		System.out.println("Info the vehiculo :");
	
		System.out.println("the color is :"+Color);
		System.out.println("the car is Sedan :"+((Sedan == true)?"Yes":"Not") );
		System.out.println("the year car is :"+Year);
		System.out.println("the car type is :"+Type);
		System.out.println("the car model is :"+Model);
	
	}
	
	
	
	
	
}


