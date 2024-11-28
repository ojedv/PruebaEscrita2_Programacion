package evaluables2;

import java.util.*;

public class Actividad_4 {
public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);

	int matrizintr[][] = new int [5][5];
	int primeranillo[] = new int[16];
	int segundoanillo[] = new int[8];
	boolean correcta = true;
	
	
	for(int i = 0; i < 5; i++) {
		for(int c = 0; c < 5; c++) {
			
			
			try {
			System.out.println("Introduce la posicion "+(i)+", "+(c)+" :");
			matrizintr [i][c] = (int)(leer.nextFloat());
			}catch(InputMismatchException e){
				System.out.println("Entrada inválida. Por favor, introduce un número.");
				 leer.next();			}
			
		}
	}
primeranillo[0] = matrizintr[0][0];
primeranillo[1] = matrizintr[0][1];
primeranillo[2] = matrizintr[0][2];
primeranillo[3] = matrizintr[0][3];
primeranillo[4] = matrizintr[0][4];
primeranillo[5] = matrizintr[1][0];
primeranillo[6] = matrizintr[1][4];
primeranillo[7] = matrizintr[2][0];
primeranillo[8] = matrizintr[2][4];
primeranillo[9] = matrizintr[3][0];
primeranillo[10] = matrizintr[3][4];
primeranillo[11] = matrizintr[4][0];
primeranillo[12] = matrizintr[4][1];
primeranillo[13] = matrizintr[4][2];
primeranillo[14] = matrizintr[4][3];
primeranillo[15] = matrizintr[4][4];

segundoanillo[0] = matrizintr[1][1];
segundoanillo[1] = matrizintr[1][2];
segundoanillo[2] = matrizintr[1][3];
segundoanillo[3] = matrizintr[2][1];
segundoanillo[4] = matrizintr[2][3];
segundoanillo[5] = matrizintr[3][1];
segundoanillo[6] = matrizintr[3][2];
segundoanillo[7] = matrizintr[3][3];




for (int i = 0; i < primeranillo.length;i++) {
		if(primeranillo[0] != primeranillo[i]) {
			correcta = false;
		}
}


for (int i = 0; i < segundoanillo.length;i++) {
	if (segundoanillo[0] != segundoanillo[i]) {
		correcta = false;
	}
}

if (!correcta) {
	System.out.println("La matriz NO es concentrica");
}else {
	System.out.println("La matriz SI es concentrica");
}

System.out.println("La matriz es :");
System.out.println(matrizintr[0][0]+" "+matrizintr[0][1]+" "+ matrizintr[0][2]+" "+matrizintr[0][3]+" "+matrizintr[0][4]);
System.out.println(matrizintr[1][0]+" "+matrizintr[1][1]+" "+ matrizintr[1][2]+" "+matrizintr[1][3]+" "+matrizintr[1][4]);
System.out.println(matrizintr[2][0]+" "+matrizintr[2][1]+" "+ matrizintr[2][2]+" "+matrizintr[2][3]+" "+matrizintr[2][4]);
System.out.println(matrizintr[3][0]+" "+matrizintr[3][1]+" "+ matrizintr[3][2]+" "+matrizintr[3][3]+" "+matrizintr[3][4]);
System.out.println(matrizintr[4][0]+" "+matrizintr[4][1]+" "+ matrizintr[4][2]+" "+matrizintr[4][3]+" "+matrizintr[4][4]);

leer.close();

}
}
