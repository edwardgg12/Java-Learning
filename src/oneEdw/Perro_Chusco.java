package oneEdw;

public class Perro_Chusco extends Perro_Boxer {


	
	
	
	void Perro_Chusco ()
	{
		
	}
	public void no_morder ()
	{
		ladrar();
		System.out.println("No puede morder");
	}
	@Override
	public void ladrar()
	{
		System.out.println("prohibido ladrar");
	}
	
	
	
	
}
