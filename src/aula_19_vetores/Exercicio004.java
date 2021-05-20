/**
 * 
 */
package aula_19_vetores;

import java.util.Random;

/**
 * @author humbe
 *
 */
public class Exercicio004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random numeroRandom = new Random();
		
		double [] vetorA = new double[15];
		double [] vetorB = new double[15];
		
		for (int i = 0; i < vetorA.length; i++ ) {
			vetorA[i] = numeroRandom.nextInt(20);
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A na posição "+(i+1)+" é: " + vetorA[i]);
		}
		
		
		System.out.println();
		
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("O quadrado do vetor A na posição "+(1+i)+" é:" + vetorB[i]);
		}
	}

}
