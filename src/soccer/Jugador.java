package soccer;

public class Jugador {

	public static void main(String[] args) {
		

		Futbolista Jugador1 = new Futbolista ();
		
		Jugador1.set_nombre("Juan");
		Jugador1.set_correxhora(30);
		Jugador1.set_respxmin(50);
		
		
		Jugador1.correxHora();
		Jugador1.respiraxMinuto();
		Jugador1.Estadistica();
		Jugador1.correxHora("excelente");
		
		
		
Futbolista Jugador2 = new Futbolista ();
		
		Jugador2.set_nombre("Jhon");
		Jugador2.set_correxhora(20);
		Jugador2.set_respxmin(80);
		
		
		Jugador2.correxHora();
		Jugador2.respiraxMinuto();
		Jugador2.Estadistica();
		Jugador2.correxHora("No pasa nada");
		
		
		
	}

}
