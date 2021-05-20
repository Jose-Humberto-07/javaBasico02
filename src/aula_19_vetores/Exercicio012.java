/**
 * 
 */
package aula_19_vetores;

import java.util.Random;

/**
 * @author humbe
 *
 */
public class Exercicio012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random numeroRandom = new Random();
		
		int[] vetorA = new int[10];
		int soma = 0;
		
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = numeroRandom.nextInt(30);
			soma += vetorA[i];
		}
		
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		//out put (resultado)
		System.out.println("Soma: " + soma);
	}


}


