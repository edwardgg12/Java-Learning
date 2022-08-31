package oneEdw;

public class probando {

	public static void main(String[] args) {
		
		//creacion de la instancia del objeto
		perro p = new perro();
		//aaciones del objeto del p (perro)
		p.setname("Chispita");
		p.dormir();
		p.comer("croquetas");
		
		perro p2 = new perro();
		p2.setname("Chabuco");
		
		Perro_Boxer p3 = new Perro_Boxer();
		p3.morder();
		p3.ladrar();
		
		Perro_Chusco p4 = new Perro_Chusco();
		p4.no_morder();
		

	}

}
