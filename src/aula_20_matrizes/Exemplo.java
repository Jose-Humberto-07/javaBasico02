/**
 * 
 */
package aula_20_matrizes;

import java.util.Scanner;

/**
 * @author humbe
 *
 */
public class Exemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Entre com número de pessoas que serão entrevistadas: ");
		int numEntrevistados = teclado.nextInt();
		
		String[][] nomeFilhos = new String[numEntrevistados][];
		
		for (int l = 0; l < nomeFilhos.length; l++ ) {
			System.out.println("Entre com a quantidade de filhos: ");
			int quantidadeFilhos = teclado.nextInt();
		}
	}

}
