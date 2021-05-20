/**
 * 
 */
package aula_19_vetores;
import java.util.Random;
/**
 * @author humbe
 *
 */
public class Exercicio005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random numeroRandom = new Random();
		
		int[] A = new int[10];
		int[] B = new int[10];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = numeroRandom.nextInt(50);
			B[i] = A[i] * (i+1);
		}
		
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("vetor A = " + A[i]);
		}
		
		
		System.out.println();
		
		for (int i = 0; i < B.length; i++) {
			System.out.println("vetor B = " + B[i]);
		}
	}

}
