package metodos;

public class Metodos_Basicos {

//Obten el caracter de la posicion x de la frase y
	public char obtenerCaracter(String str, int index) {
		return str.charAt(index);
	}

	public String obtenerSubcadena(String str, int beginIndex) {
		return str.substring(beginIndex);
	}

	public String convertirAMayusculas(String str) {
		return str.toUpperCase();
	}
//	Verifica si la cadena contiene una secuencia de caracteres específica.

	public boolean contieneSubcadena(String str, String subcadena) {
		return str.contains(subcadena);
	}
//	Elimina espacios en blanco

	public String eliminarEspacios(String str) {
		return str.trim();
	}

	public boolean sonIguales(String str1, String str2) {
		return str1.equals(str2);
	}

	public int obtenerIndiceSubcadena(String str, String subcadena) {
		return str.indexOf(subcadena);
	}

	public static void main(String[] args) {

	}
}
