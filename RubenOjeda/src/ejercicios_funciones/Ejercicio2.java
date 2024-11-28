package ejercicios_funciones;

import java.util.*;

public class Ejercicio2 {

	public static int factorialnum (int par1) {
		int factorialnumero = 0;
		
		if (par1 == 1) {
		return par1;
		}else {
		factorialnumero = par1 * factorialnum(par1 - 1);
		return factorialnumero;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int factorial;
		int numero = -1;
		String num = "";
		
		while (numero < 0){
				
			System.out.println("Introduce un numero mayor que 0 y te digo su factorial");
			num = leer.next();
			numero = Integer.parseInt(num);
		

		}
		
		factorial = factorialnum(numero);
		System.out.println("El factorial de "+numero+" es: "+factorial);
		
		leer.close();
	}
}
