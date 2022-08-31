package oneEdw;

public class perro {

	private String nombre;
	//private String raza;
	private float altura;
	public float pulgas;
	
	//constructor (puede tener multiples con diferentes parametros)
	public void perro()
	{
		
	}
	public String getname()
	{
		return this.nombre;
	}
	public void setname(String p_name)
	{
		this.nombre = p_name;
	}
	private void tick()
	{
		System.out.println("Rascarse con la patita");
	}
	public void comer(String comida)
	{
		System.out.println("Empezando a comer :"+comida);
	}
	public void dormir() 
	{
		System.out.println("perro alistandose a dormir");
		tick();
		System.out.println("Se duerme");
	}
	public void ladrar()
	{
		System.out.println("Empieza a ladrar");
	}
	
	
	
	
	
}
