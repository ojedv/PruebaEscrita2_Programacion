package evaluables3;

import java.util.*;

public class Ejercicio_3 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String selecc;
		int seleccion = 0;
		boolean bien = false;

		System.out.println("1.Invertir una cadena de texto");
		System.out.println("2.Convertir un número de decimal a binario");
		System.out.println("3.Que determine si un número es elegante o perfecto");
		System.out.println("4.Salir");
		System.out.println("");


		
		while (!bien) {
			try {
				System.out.println("Introduce Numero");
				selecc = leer.next();
				selecc = selecc.replace(" ", "");
				seleccion = Integer.parseInt(selecc);
				bien = true;
			} catch (NumberFormatException ex) {
				leer.nextLine();
				bien = false;
			}
		}
		switch (seleccion) {

		case 1:
			System.out.println("Inserta una cadena de texto");
			String cadena;
			cadena = leer.next();
			cadena = cadena.replace(" ","");
			
			char cadenavec[] = new char[cadena.length()];
			for (int i = 0; i < cadena.length(); i++) {
				cadenavec[i] = cadena.charAt(i);
			}
			for (int i = cadena.length(); i >= 0; i--) {
				System.out.println(cadenavec[i]);
			}
		
			
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:
System.out.println("Saliendo del ejercicio 3...");
			break;
		default:

		}

	}

	private static String toString(StringBuilder reverse) {
		// TODO Auto-generated method stub
		return null;
	}
}
