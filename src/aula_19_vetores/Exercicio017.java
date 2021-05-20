/**
 * 
 */
package aula_19_vetores;

import java.util.Random;

/**
 * @author humbe
 *
 */
public class Exercicio017 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random numeroRandom = new Random();
		
		int[] vetorA = new int[10];
		
		int idadeSuperior = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = numeroRandom.nextInt(100);
			if (vetorA[i] > 35) {
				idadeSuperior++;
			}
		}
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Quantidade de pessoas que tem idade superior a 35: " + idadeSuperior);
	}

}
