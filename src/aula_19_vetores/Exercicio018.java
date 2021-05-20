/**
 * 
 */
package aula_19_vetores;

import java.util.Random;

/**
 * @author humbe
 *
 */
public class Exercicio018 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random numeroRandom = new Random();
		
		int[] vetorA = new int[10];
		
		int maior = 0;
		int menor = 101;
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = numeroRandom.nextInt(100);
			if (vetorA[i] > maior) {
				maior = vetorA[i];
			}
			
			if (vetorA[i] < menor) {
				menor = vetorA[i];
			}
		}
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
			
		}
		
		
		  System.out.println();
		  System.out.println();
		 
		
		System.out.println("Maior idade: " + maior);
		System.out.println("Menor idade: " + menor);
		 		
	}

}
