package oneEdw;

public class ClassEdw3 {
//defino mi propiedades de mi clase	
	 String Accion1;
	 String Accion2;
	 String Accion3;
	 int phone=33;
 	 String name="Laura";	
	 String status="married";
	 char sexo='F';
	//contructor  es el 1er evento que sucede al instanciar mi clase en un objeto
	public  void ClassEdw3() {
		}
 
	public void levanta()
	{
		Accion1="Se laba la carita";
		
	}
	
	public void dormirse()
	{
		this.Accion1="Se sepilla los dientes";
		this.cambiarsexo();
	}

	public void sexo()
	{
		this.Accion1="femina";
		
	}
	
    public void cambiarsexo()
    {
    	this.sexo='M';
    	
    }
	
	
}
