package evaluables3;

import java.util.*;



public class Ejercicio_1_Rafa {

	public static int sumaCuadrados(int n) {

		if (n == 0) {

			return 0;
		}
		int digito = n % 10;
		return (digito * digito) + sumaCuadrados(n / 10);
	}

	public static boolean esElegante(int n) {
		if (n == 1) {
			return true; // Es elegante
		} else if (n == 4) {
			return false; // No es elegante
		} else {
			int nuevaSuma = sumaCuadrados(n);
			return esElegante(nuevaSuma);
		}
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String numero;
		int parseado = 0;
		boolean continua = false;

		while (parseado != -1) {
			do {
				try {
					System.out.println("Introduce un número: ");
					numero = leer.nextLine();
					numero = numero.replace(" ", "");
					parseado = Integer.parseInt(numero);
					continua = false;
					if (esElegante(parseado)) {
						System.out.println("El número " + parseado + " es elegante.");
					} else {
						System.out.println("El número " + parseado + " no es elegante.");
					}
				} catch (NumberFormatException ex)	 {
					System.err.println("Introduce solo números enteros");
					leer.nextLine();
					continua = true;
				}
			} while (continua);
		}
		System.out.println("Programa finalizado");

		leer.close();

	}

}
