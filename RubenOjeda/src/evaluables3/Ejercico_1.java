package evaluables3;

import java.util.Scanner;

public class Ejercico_1 {

	public static boolean elegante(String par1) {
		int numero = Integer.parseInt(par1);
		int suma = 0;
		int numtemp;
		char temp;
		String x;

		if (numero == 1) {
			return true;
		} else if (numero == 4) {
			return false;
		} else

			for (int i = 0; i < par1.length(); i++) {
				temp = par1.charAt(i);
				numtemp = temp - '0';
				suma = suma + (numtemp * numtemp);
			}
		if (suma == 1) {
			return true;
		} else if (suma == 4) {
			return false;
		} else {
			x = String.valueOf(suma);
			return elegante(x);
		}
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String num;
		boolean elegante;

		System.out.println("Introduce un numero y te digo si es elegante");
		num = leer.nextLine();
		num = num.replace(" ", "");
		elegante = elegante(num);
		if (elegante) {
			System.out.println("SI es elegante");
		} else {
			System.out.println("NO es elegante");

		}
		leer.close();
	}
}
