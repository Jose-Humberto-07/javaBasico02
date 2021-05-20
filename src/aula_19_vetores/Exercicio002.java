/**
 * 
 */
package aula_19_vetores;

import java.util.Random;
import java.util.Scanner;

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
		Scanner teclado = new Scanner (System.in);
		Random numeroRandom = new Random();
		
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[8];
		
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = numeroRandom.nextInt(50); 
			vetorB[i] = vetorA[i] * 2;
		}
		
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Vetor A = " + vetorA[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Vetor B = " + vetorB[i]);
		}
	}

}
