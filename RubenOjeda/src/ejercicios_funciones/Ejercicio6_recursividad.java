package ejercicios_funciones;

import java.util.Scanner;

public class Ejercicio6_recursividad {
	
	public static String determinarimpar (int par1) {//No es recursiva :(
		String determinacion;
		if (par1 % 2 == 0) {
			determinacion = "Es par";
			return determinacion;
		}else {
			determinacion = "Es impar";
			return determinacion;
		}
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int numero;
		String imparsi;
		System.out.println("Introduce un numero ");
		numero = leer.nextInt();
		imparsi = determinarimpar(numero);
		System.out.println(imparsi);
		leer.close();
		
	}
}
