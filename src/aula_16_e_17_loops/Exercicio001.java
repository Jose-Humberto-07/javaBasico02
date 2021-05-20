/**
 * 
 */
package aula_16_e_17_loops;

import java.util.Scanner;

/**
 * @author humbe
 *
 */
public class Exercicio001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		boolean notaValida = false;
		
		
		
		do {
			System.out.println("Entre com uma nota: ");
			double nota = teclado.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			} else {
				//notaValida = false
				System.out.println("Nota inválida, digite novamente.");
			}
		} while (notaValida == false);
		
		
	}

}
