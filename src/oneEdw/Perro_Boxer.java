package oneEdw;

public class Perro_Boxer extends perro {

	private String raza = "Boxer";
	//constructor
	void Perro_Boxer()
	{
		
	}
	
	@Override
	public void ladrar()
	{
		System.out.println("Ya ladro");
	}
	public void morder()
	{
		ladrar();
		System.out.println("Empieza a morder ...");
	}
	
	
}
