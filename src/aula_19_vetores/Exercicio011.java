/**
 * 
 */
package aula_19_vetores;
import java.util.Random;
/**
 * @author humbe
 *
 */
public class Exercicio011 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random numeroRandom = new Random();
		
		int[] vetorA = new int[10];
		int totPar = 0;
		
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = numeroRandom.nextInt(30);
			if (vetorA[i] % 2 == 0) {
				totPar++;
			}
		}
		
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		//out put (resultado)
		System.out.println("Total de pares: " + totPar);
	}

}
