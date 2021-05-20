/**
 * 
 */
package aula_19_vetores;

import java.util.Random;

/**
 * @author humbe
 *
 */
public class Exercicio006 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random numeroRandom = new Random();
		int[] A = new int[10];
		int[] B = new int[10];
		int[] C = new int[10];
		
		
		for (int i = 0; i < A.length; i++) {
			A[i] = numeroRandom.nextInt(50);
		}
		
		
		
		for (int i = 0; i < B.length; i++) {
			B[i] = numeroRandom.nextInt(50);
			C[i] = A[i] + B[i];
		}
		
		
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Vetor A = " + A[i]);
		}
		
		
		System.out.println();
		
		for (int i = 0; i < B.length; i++) {
			System.out.println("Vetor B = " + B[i]);
		}
		
		System.out.println();
		
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Vetor C = " + C[i]);
		}
	}

}
