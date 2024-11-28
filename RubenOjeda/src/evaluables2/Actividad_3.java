package evaluables2;

import java.util.*;

public class Actividad_3 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int longitud;
		do {
			System.out.println(" Introduce la longitud del codigo Fibonacci, (0 para finalizar)");
			longitud = (int) (leer.nextFloat());
			while (longitud < 0) {
				System.out.println("Introduce un numero mayor que 0");
				longitud = (int) (leer.nextFloat());
			}
			if (longitud > 0) {
				int vector[] = new int[longitud];
				vector[0] = 1;
				System.out.print("La serie de Fibonacci de " + longitud + " numeros es: ");
				System.out.print(vector[0]);
				if (longitud > 1) {
					vector[1] = 1;
					System.out.print(", " + vector[1]);
				}
				for (int i = 2; i < longitud; i++) {
					vector[i] = vector[i - 2] + vector[i - 1];
					System.out.print(" ," + vector[i]);
				}
			}
		} while (longitud != 0);
		System.out.print(" Programa finalizado.");
		leer.close();
	}

}