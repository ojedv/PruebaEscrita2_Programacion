package prueba_escrita2;

import java.util.Scanner;

public class Ejercicio_1 {
	
	public static float calcularIMC (float par1, float par2) {
		float x;
		x = par1/(par2 * par2);
		return x;
	}

	public static void contarVocales(String par1) {
		int numa = 0;
		int nume = 0;
		int numi = 0;
		int numo = 0;
		int numu = 0;

		for (int i = 0; i < par1.length(); i++) {
			char temp = par1.charAt(i);
			if (temp == 'a' || temp == 'A') {
				numa++;
			} else if (temp == 'e' || temp == 'E') {
				nume++;

			} else if (temp == 'i' || temp == 'I') {
				numi++;

			} else if (temp == 'o' || temp == 'O') {
				numo++;

			} else if (temp == 'u' || temp == 'O') {
				numu++;

			} else {

			}
		}
		System.out.println("a: " + numa + " veces");
		System.out.println("e: " + nume + " veces");
		System.out.println("i: " + numi + " veces");
		System.out.println("o: " + numo + " veces");
		System.out.println("u: " + numu + " veces");

	}

	public static boolean esPrimo(int par1) {
		int cont = 0;

		for (int i = 1; i <= par1; i++) {
			if (par1 % i == 0) {
				cont++;
			}
		}
		if (cont > 2) {
			return false;
		} else {
			return true;
		}
	}
	public static double calcularPotencia(double par1,int par2) {
		if (par2 == 1) {
			return par1;
		}else {
			
			return  par1 * calcularPotencia(par1,(par2 - 1));
		}
	}
	

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		boolean bien = false;
		String numintr;
		int num = 0;
		boolean terminar = false;

		while (!terminar){
		while (!bien) {
			try {
				do{System.out.println("1.-Calcular el IMC");
				System.out.println("2.-Contar vocales");
				System.out.println("3.-Determinar si un número es primo");
				System.out.println("4.-Potencia recursiva");
				System.out.println("5.-Matriz Simétrica");
				System.out.println("6.-Salir del programa");
				System.out.println("");
				System.out.println("Elige lo que quieres hacer (1-6)");
				numintr = leer.next();
				numintr = numintr.replace(" ", "");
				num = Integer.parseInt(numintr);
				}while(num < 1 || num > 6);
				bien = true;
			} catch (NumberFormatException ex) {
				leer.nextLine();
				bien = false;
			}
		}
		switch (num) {
		case 1: {
			float peso;
			float altura;
			float imc = 0;


			System.out.println("Introduce tu peso en Kg");
			peso = leer.nextFloat();

			System.out.println("Introduce tu altura en metros");
			altura = leer.nextFloat();
			
			imc = calcularIMC(peso,altura);
			
			if (imc < 18) {
				System.out.println("Estás en la categoría: Bajo peso");
			}else if (imc < 25) {
				System.out.println("Estás en la categoría: Peso normal");
			}else if (imc < 27) {
				System.out.println("Estás en la categoría: Sobrepeso");
			}else if (imc < 50) {
				System.out.println("Estás en la categoría: Obesidad morbida ¡Adelgaza!");
			}
			bien = false;
			break;
		}
		case 2: {
			System.out.println("Introduce una frase");
			String frase = leer.next();
			frase = frase.replace(" ", "");
			contarVocales(frase);
			
			bien = false;
			break;

		}
		case 3: {
			System.out.println("Introduce el numero que quieres comprobar (Debe ser entero)");
			int numeroprim = (int) (leer.nextFloat());
			boolean primo = esPrimo(numeroprim);
			
			if (primo) {
				System.out.println("El numero es primo");
				System.out.println("");
			}else if(!primo){
				System.out.println("El numero no es primo");
				System.out.println("");
			}
			bien = false;
			break;
		}
		case 4: {
			double base;
			int entero;
			double potencia;
			
			System.out.println("Introduce una base");
			base = leer.nextDouble();
			System.out.println("Introduce un numero entero positivo (negativos incluidos)");
			entero = leer.nextInt();
			potencia = calcularPotencia(base,entero);
			System.out.println(potencia);
			
			bien = false;
			break;
		}
		case 5: {
			int matriz[][] = new int[2][2];
			System.out.println("Introduce los valores de la matriz y te digo si es simetrica (2x2)");
			for (int i = 0; i < 2;i++ ) {
				for(int j = 0; j < 2;j++ ) {
					System.out.println("Escribe la posicion ["+i+"]["+j+"]" );
					matriz[i][j] = (int)(leer.nextFloat());
				}
			}
			System.out.println("Esta es tu matriz: " );
			System.out.print(matriz[0][0]+"  ");
			System.out.println(matriz[0][1]);
			System.out.print(matriz[1][0]+"  ");
			System.out.print(matriz[1][1]);
			System.out.println(" ");
			if(matriz[0][1] == matriz[1][0]) {
				System.out.println("SI es simetrica");
			}else {
				System.out.println("NO es simetrica");
				System.out.println(" ");

			}

			bien = false;
			break;
		}
		case 6: {
			System.out.println("Saliendo del programa...");
			System.out.println("Examen realizado por Rubén Ojeda León. 27/11/2024");
			terminar = true;
			break;
		}

		default:
			break;
		}
	}

		leer.close();
	}
}
