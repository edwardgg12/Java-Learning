package soccer;
//Hijo
public class Futbolista extends Pelotero {
	
	private int a_respxmin;
	private int a_correxhora;
	private String a_nombre;
	
	//constructor (es el primer metodo q se ejecuta al instanciar un objeto)
	public void Fubtbolista()
	{
		a_respxmin = 0;
		a_correxhora = 0;
		a_nombre = "";
	}
	public void correxHora(String p_observacion)
	{
		if (a_respxmin>20) 
		{
			System.out.println(a_nombre + "corre x hora " +a_correxhora + "obs" + p_observacion + "Es muy bueno");
		}else
		{
			System.out.println(a_nombre + "corre x hora " +a_correxhora + "obs" + p_observacion);

		}
	}
	
	
	
	public void correxHora()
	{
		System.out.println(a_nombre + "corre x hora " +a_correxhora);
	}
	public void respiraxMinuto()
	{
		System.out.println(a_nombre + "respira x minuto " +a_respxmin);
	}
	
	public void set_respxmin(int p_rxmin) 
	{
		a_respxmin = p_rxmin; 	
	}
	public void set_correxhora(int p_cxhora)
	{
		a_correxhora = p_cxhora;
	}
	public void set_nombre(String p_nombre)
	{
		a_nombre = p_nombre;
	}
	
	
	
	
}
