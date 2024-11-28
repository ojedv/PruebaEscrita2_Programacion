package evaluables2;

import java.util.*;
public class Actividad_2 {
public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);
	
	int cantidad;
	int dni;
	int numeroletra;
	int cont = 0;
	
	System.out.println("Introduce la cantidad de dni's que va a introducir");
	cantidad= (int)(leer.nextFloat());
	
	while (cont < cantidad) {
		while(cantidad<= 0) {
			System.out.println("Introduce un numero valido");
			cantidad= (int)(leer.nextFloat());
		}
System.out.println("Introduce los numeros de tu "+(cont + 1)+" DNI");
	dni = leer.nextInt();
	String stringdni= Integer.toString(dni);
	cont++;

	while (stringdni.length() != 8) {
		System.out.println("Introduce numeros del DNI validos");
		dni = leer.nextInt();
		
//		Para pasar de string a entero parseInt(Var que queramos convertir a entero)
		stringdni= Integer.toString(dni);
	}
	System.out.println("Introduce la letra de tu dni");
	String letraint = leer.next();
	String letra;
    

	numeroletra = dni % 23;
	 switch (numeroletra) {
	 case 0:
	        letra = "T"; // Resto 0
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 1:
	        letra = "R"; // Resto 1
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 2:
	        letra = "W"; // Resto 2
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 3:
	        letra = "A"; // Resto 3
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 4:
	        letra = "G"; // Resto 4
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 5:
	        letra = "M"; // Resto 5
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 6:
	        letra = "Y"; // Resto 6
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 7:
	        letra = "F"; // Resto 7
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 8:
	        letra = "P"; // Resto 8
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 9:
	        letra = "D"; // Resto 9
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 10:
	        letra = "X"; // Resto 10
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 11:
	        letra = "B"; // Resto 11 
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 12:
	        letra = "N"; // Resto 12
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 13:
	        letra = "J"; // Resto 13
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 14:
	        letra = "Z"; // Resto 14
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 15:
	        letra = "S"; // Resto 15
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 16:
	        letra = "Q"; // Resto 16
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 17:
	        letra = "V"; // Resto 17
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 18:
	        letra = "H"; // Resto 18
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 19:
	        letra = "L"; // Resto 19
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 20:
	        letra = "C"; // Resto 20
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 21:
	        letra = "K"; // Resto 21
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
	    case 22:
	        letra = "E"; // Resto 22
	        if (letraint.equalsIgnoreCase(letra)) {
	            System.out.println("Letra correcta");
	        } else {
	            System.out.println("Letra incorrecta");
	        }
	        break;
     default:
         System.out.println("Número no válido. Debe estar entre 1 y 22.");
         return;
	 }
	}
	leer.close();
}}

