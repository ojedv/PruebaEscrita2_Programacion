package evaluables3;

import java.util.Scanner;

public class Actividad_1 {
/*Se desea realizar un programa que compruebe si un número es elegante a través del uso de funciones recursivas.
 *  Para decidir si un número positivo es elegante se calcula la suma del cuadrado de sus cifras. Si utilizamos 
 *  como ejemplo el número 9100, la suma de los cuadrados de sus cifras seria 82. Repetimos la misma operación
 *  con los dígitos del nuevo número hasta que obtenemos uno de los siguientes resultados:

1: el número es elegante.
4: el número no es elegante.*/
	
	
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String numero;
		
		System.out.println("Introduce un numero y te indico si es elegante o no");
		numero = leer.next();
		String numerodiv[] = new String[numero.length()];
		numerodiv = numero.split("");
		
		
		System.out.println("bien "+ numero);
		
		leer.close();
	}
	
	
	
	
}
