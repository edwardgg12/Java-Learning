package soccer;
//Padre
abstract class Pelotero {

	public String Velocidad;
	public String Disparo;
	public String Dribleo;
	public String Reflejos;
	
	
	void Estadistica()
	{
		System.out.println("dddddddddddddddddddddd");
	}
	void Puntacion()
	{
		System.out.println("Tiene un record de anotacion");
	}
	void Valores()
	{
		System.out.println("El deportista tiene un valor");
	}
	
	abstract void correxHora();
	
	abstract void respiraxMinuto();
	
	
	
	
	
	
	
}
