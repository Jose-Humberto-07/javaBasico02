/**
 * 
 */
package aula_20_matrizes;

import java.util.Random;

/**
 * @author humbe
 *
 */
public class Exercicio002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numerosAleatorios = new int[10][10];
		Random gerarNumeroRandom = new Random();
		
		
		//entrada de dados
		for (int l = 0; l < numerosAleatorios.length;l++) {
			for (int c = 0; c < numerosAleatorios[l].length; c++) {
				numerosAleatorios[l][c] = gerarNumeroRandom.nextInt(100);
			}
		}
		
		
		
		//mostrar matriz na tela
		for (int l = 0; l < numerosAleatorios.length;l++) {
			for (int c = 0; c < numerosAleatorios[l].length; c++) {
				System.out.print(numerosAleatorios[l][c] + "  ");
			}
			System.out.println();
			System.out.println();
		}
		
		
		
		//implementar lógica (processamento) pelas as linhas
		//maior e menor valor da linha 5
		int maiorLinha5 = 0;
		int menorLinha5 = 101;
		int linha5 = 5;
		for (int l = 0; l < numerosAleatorios[linha5].length; l++ ) {
			if (numerosAleatorios[linha5][l] > maiorLinha5) {
				maiorLinha5 = numerosAleatorios[5][l];
			}
			
			if (numerosAleatorios[linha5][l] < menorLinha5) {
				menorLinha5 = numerosAleatorios[5][l];
			}
		}
		
		
		
		//passeando pelas as colunas
		int maiorColuna7 = 0;
		int menorColuna7 = 101; 
		int coluna7 = 7;

		for (int l = 0; l < numerosAleatorios.length; l++) {
			if (numerosAleatorios[l][coluna7] > maiorColuna7) {
				maiorColuna7 = numerosAleatorios[l][maiorColuna7];
			} 
			
			if (numerosAleatorios[l][coluna7] < maiorColuna7) {
				menorColuna7 = numerosAleatorios[l][coluna7];
			}
		}
		
		
		
		//out put (resultado) da linha
		System.out.println("Maior valor da linha 5 = " + maiorLinha5);
		System.out.println("Menor valor da linha 5 = " + menorLinha5);
		System.out.println();
		
		
		//out put da coluna
		System.out.println("Maior valor da coluna 7 = " + maiorColuna7);
		System.out.println("Menor valor da coluna 7 = " + menorColuna7);
	}

}
