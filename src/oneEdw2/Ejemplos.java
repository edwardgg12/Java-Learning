package oneEdw2;

import java.util.Scanner;

public class Ejemplos {

	public static void main(String[] args) {
		
		
		Scanner Numeros = new Scanner (System.in);
		System.out.println("Guardar numeros :");
		int Num1 = Numeros.nextInt();
		
		float [] Num = new float [Num1];
		
		
		for (int i=0;i<Num.length;i++) {
			System.out.println("Enter value "+(i+1)+ " is :");
			Num[i] = Numeros.nextFloat();
		}
			System.out.println("\n Print numbers :");
		for (float i:Num) {
			System.out.println(i);
		}
	}

}
