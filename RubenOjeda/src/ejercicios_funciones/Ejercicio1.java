package ejercicios_funciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static int sumardosnum(int par1, int par2) {
		int suma = par1 + par2;
		return suma;
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		int num1, num2;
		int result = 0;

		System.out.println("Introduce el primer numero entero");
		num1 = (int) (leer.nextFloat());
		System.out.println("Introduce el segundo numero entero");
		num2 = (int) (leer.nextFloat());
		while (num1 <= 0 || num2 <= 0) {
			System.out.println("Introduce dos numeros validos");
			System.out.println("Introduce el primer numero entero");
			num1 = (int) (leer.nextFloat());
			System.out.println("Introduce el segundo numero entero");
			num2 = (int) (leer.nextFloat());
		}
		result = sumardosnum(num1, num2);
		System.out.println("Este es el resultado de la suma: " + result);
		leer.close();
	}
}
