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
		
		
		// a variável "nota" é para receber o valor de cada posição do array "notas"
		
		//nota é como se fosse o contador do array
		//notas é o array
		//nesse for eu consigo acessar diretamente a variável
		// o java usa um contador interno, não temos acesso ao mesmo
		// por exemplo: "entre com a nota na posição: + i" , isso não é possivel no for each
		
		// é muito útil quando se quer mostrar uma informação ou obter uma informação, por isso que essa notação é mais simples
		
		
		Random numeroRandom = new Random();
		int[] notas = new int[10];
		
		for (int i = 0; i < notas.length; i++) {
			notas[i] = numeroRandom.nextInt(10);
		}
		
		//internamente é isso que acontece
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
