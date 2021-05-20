/**
 * 
 */
package aula_20_matrizes;
import java.util.Scanner;
import java.util.Random;
import java.util.Random;
/**
 * @author humbe
 *
 */
public class Exercicio001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] numero = new int[4][4];
		
		Random numeroRandom = new Random();
		//gerar números aleatórios
		
		for (int l = 0; l < numero.length; l++) {
			for (int c = 0; c < numero[l].length; c++) {
				numero[l][c] = numeroRandom.nextInt(100);
			}
		}
		
		
		//maior número
		int maior = 0;
		int linha = 0;
		int coluna = 0;
		
		
		for (int l = 0; l < numero.length; l++) {
			for (int c = 0; c < numero[l].length; c++) {
				numero[l][c] = numeroRandom.nextInt(100);
				if (numero[l][c] > maior) {
					maior = numero[l][c];
					linha = l+1;
					coluna = c+1;
				}
			}
		}
		
		
		
		//mostrar a matriz na tela
		for (int l = 0; l < numero.length; l++) {
			for (int c = 0; c < numero[l].length; c++) {
				System.out.print(numero[l][c] + " ");
			}
			System.out.println("");
		}
		
		
		//espaços na tela
		System.out.println();
		System.out.println();
		
		
		
		// OUT put significa RESULTADO
		//gerando o out put
		System.out.println("Mior valor = " + maior);
		System.out.println("Linha = " + linha);
		System.out.println("coluna = " + coluna);
		
	}
	
	

}
