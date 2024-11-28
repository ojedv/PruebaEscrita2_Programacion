package evaluables2;

import java.util.Scanner;

public class Actividad_1 {
public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);

	String string = "Voy a tener un sobresaliente en la asignatura de programación";
	String stringsinesp = string.replace(" ", "");

//	Su longitud.
	System.out.println("La longitud del string sin espacios es: "+stringsinesp.length());
	
//	El carácter asociado al índice 5.
	/*Con char.At() hacemos referencia a la posicion indicada.
	 */
	char indicefive = stringsinesp.charAt(5);
	System.out.println("El caracter en la posicion 5 es: "+indicefive);
	
//	La subcadena desde la posición 4 a la 10.
	/*Cons substring(x,y) creamos una subfrase que recoge todas las posiciones entre los numeros indicados
	*/
	System.out.println("La subcadena de la posicion 4 a la 10 es: "+stringsinesp.substring(4,10));
	
//	El índice que ocupa el carácter X pedido por el usuario.
	/*Para hacer mas completo el ejercicio le pedimos al usuario la cantidad de indices que 
	 * quiere que se muestren
	 */
	System.out.println("Introduce la cantidad de posiciones que quieres que se muestren ");
	int cantidad = (int)(leer.nextFloat());
	/*Cuando sea menor que 0 le volvemos a pedir el numero
	 */
	while (cantidad < 0) {
		System.out.println("Introduce una cantidad valida");
		cantidad = (int)(leer.nextFloat());
	}
	for (int i = 0 ; i < cantidad; i++) {
		System.out.println("Introduce la "+(i+1)+" posicion que quieres mostrar: ");
		int numero = (int)(leer.nextFloat());
		/*Cuando sea menor que 0 o mayor que el string.length le volvemos a pedir el numero 
		 */
		while (numero < 0 || numero > (stringsinesp.length()-1)) {
			System.out.println("Introduce una cantidad valida");
			numero = (int)(leer.nextFloat());
		}
		System.out.println(stringsinesp.charAt(numero));
	}
	
//	Por último, comprobar si el primer carácter coincide con “ E ” y mostrar por consola un mensaje que lo indique.
	if (stringsinesp.startsWith("e")) {
		System.out.println("La frase SI empieza por e ");
	} else {
		System.out.println("La frase NO empieza por e ");
	}
	leer.close();

	
}
}
