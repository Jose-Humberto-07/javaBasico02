/**
 * 
 */
package aula_19_vetores;

import java.util.Random;

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
		//gerar n�mero aleat�rio
		Random numeroRandom = new Random();
		
		int [] vetorA = new int[15];
		int [] vetorB = new int[15];
		
		for (int i = 0; i < vetorA.length; i++ ) {
			vetorA[i] = numeroRandom.nextInt(100);
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A na posi��o "+(i+1)+" �: " + vetorA[i]);
		}
		
		
		System.out.println();
		
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("O quadrado do vetor A na posi��o "+(1+i)+" �:" + vetorB[i]);
		}
	}

}
