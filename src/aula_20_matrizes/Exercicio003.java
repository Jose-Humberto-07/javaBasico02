/**
 * 
 */
package aula_20_matrizes;
import java.util.Scanner;
/**
 * @author humbe
 *
 */
public class Exercicio003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		int[][] numeros = new int[3][3];
		
		for (int l = 0; l < numeros.length; l++) {
			for (int c = 0; c < numeros[l].length; c++) {
				System.out.println("Entre com o valor da posição [" +(l+1)+" , "+(c+1)+"]: ");
				numeros[l][c] = teclado.nextInt();
			}
		}
		
		
		//mostrar na tela a matriz
		for (int l = 0; l < numeros.length; l++) {
			for (int c = 0; c < numeros[l].length; c++) {
				System.out.print(numeros[l][c] + "  ");
			}
			System.out.println();
		}
		
		
		
		int qtdPares = 0;
		int qtdImpares = 0;
		for (int l = 0; l < numeros.length; l++) {
			for (int c = 0; c < numeros[l].length; c++) {
				if (numeros[l][c] % 2 == 0) {
					qtdPares++;
				}else {
					if (numeros[l][c] % 2 != 0) {
						qtdImpares++;
					} 
				}
			}
		}
		
		
		
		//out put (resultados)
		System.out.println("A quantidade de pares é " + qtdPares);
		System.out.println("A quantidade de ìmpares é " + qtdImpares);
	}

}
