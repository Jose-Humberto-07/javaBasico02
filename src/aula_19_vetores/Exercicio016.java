/**
 * 
 */
package aula_19_vetores;

import java.util.Random;

/**
 * @author humbe
 *
 */
public class Exercicio016 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random numeroRandom = new Random();
		
		int[] vetorA = new int[10];
		int soma = 0;
		int qtdIgualQuinze = 0;
		double qtdMaiorQuinze = 0;
		int somaMaiorquinze = 0;
		double media = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = numeroRandom.nextInt(30);
			if (vetorA[i] < 15) {
				soma += vetorA[i];
			}
			
			if (vetorA[i] == 15) {
				qtdIgualQuinze++;
			}
			
			if (vetorA[i] > 15) {}
			qtdMaiorQuinze++;
			somaMaiorquinze += vetorA[i];
			media = somaMaiorquinze / qtdMaiorQuinze;
		}
		
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		//out put (resultado)
		
		System.out.println("soma dos valores que s�o menores que 15: " + soma);
		System.out.println("soma dos valores que s�o iguais a � 15: " + qtdIgualQuinze);
		System.out.println("m�dia dos valores que s�o maiores que 15: " + media);


	}

}
