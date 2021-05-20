/**
 * 
 */
package aula_19_vetores;

import java.util.Random;

/**
 * @author humbe
 *
 */
public class Exercicio015 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random numeroRandom = new Random();
		
		int[] vetorA = new int[10];
		int impar = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = numeroRandom.nextInt(30);
			if (vetorA[i] % 2 != 0) {
				impar++;
			}
		}
		
		int par = vetorA.length - impar;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		
		//calculando a porcentagem
		//vetorA.length - 100%
		//par            - x
		//= x*vetorA.length - == par * 100
		
		
		// x == (par * 100) / vetorA.length 
		double porcPar = (par * 100) / vetorA.length;
		double porcImpar = 100 - porcPar;
		System.out.println();
		System.out.println();
		
		
		//out put (resultado)
		System.out.println("Porcentagem pares: " + porcPar );
		System.out.println("Porcentagem ímpares: " + porcImpar);
	}
	
}

