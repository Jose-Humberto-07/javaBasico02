/**
 * 
 */
package aula_21_loop_for_each;

import java.util.Random;

/**
 * @author humbe
 *
 */
public class For_Each {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FOR EACH (para cada)
		
		
		// a vari�vel "nota" � para receber o valor de cada posi��o do array "notas"
		
		//nota � como se fosse o contador do array
		//notas � o array
		//nesse for eu consigo acessar diretamente a vari�vel
		// o java usa um contador interno, n�o temos acesso ao mesmo
		// por exemplo: "entre com a nota na posi��o: + i" , isso n�o � possivel no for each
		
		// � muito �til quando se quer mostrar uma informa��o ou obter uma informa��o, por isso que essa nota��o � mais simples
		
		
		Random numeroRandom = new Random();
		int[] notas = new int[10];
		
		for (int i = 0; i < notas.length; i++) {
			notas[i] = numeroRandom.nextInt(10);
		}
		
		//internamente � isso que acontece
		for (int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.print(nota);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Usando o for each");
		System.out.println();
		
		  for(int nota : notas) { 
			  System.out.println(nota);
			}
		  
		  Random numerosRandom = new Random();
		  //exemplo 02, matriz usando o for EACH
		  
		  System.out.println();
		 
		  double[][] notasAlunos = new double[3][4];
		  
		  for (double[] notasAluno : notasAlunos) {
			  for (double nota : notasAluno) {
				  System.out.print(nota + " ");
			  }
			  System.out.println();
		  }
		
	}

}
