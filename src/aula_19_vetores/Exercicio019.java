/**
 * 
 */
package aula_19_vetores;

import java.util.Random;

/**
 * @author humbe
 *
 */
public class Exercicio019 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random numeroRandom = new Random();
		
		int[] nota1 = new int[10];
		int[] nota2 = new int[10];
		int[] result = new int[10];
		
		
		
		for (int i = 0; i < nota1.length; i++) {
			nota1[i] = numeroRandom.nextInt(10);
		}
		
		
		for (int i = 0; i < nota2.length; i++) {
			nota2[i] = numeroRandom.nextInt(10);
		}
		
		
		for (int i = 0; i < result.length; i++) {
			result[i]= (nota1[i] + nota2[i]) / 2;
		}
		
		
		for (int i = 0; i < nota1.length; i++) {
			System.out.print("Nota 1: " + nota1[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < nota2.length; i++) {
			System.out.print("Nota 2: " + nota2[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < result.length; i++) {
			System.out.print("Média: " + result[i] + " ");
		}
		
		
		System.out.println();
		System.out.println();
		
		System.out.println();
	}

}
