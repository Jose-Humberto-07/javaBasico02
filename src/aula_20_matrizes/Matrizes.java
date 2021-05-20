/**
 * 
 */
package aula_20_matrizes;
import java.util.Scanner;
/**
 * @author humbe
 *
 */
public class Matrizes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double[][] notasAlunos = new double[3][4];
		
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		
		for (int l = 0; l < notasAlunos.length; l++) {
			for (int c = 0; c < notasAlunos[l].length; c++) {
				System.out.print(notasAlunos[l][c] + "");
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("Calculado a média de cada aluno");
		System.out.println("");
		double soma = 0;
		
		for (int l = 0; l < notasAlunos.length; l++) {
			
			soma = 0;
			for (int c = 0; c < notasAlunos[l].length; c++) {
				soma += notasAlunos[l][c];
			}
			System.out.println("A média do aluno "+l+" é = "+ (soma/4));
		}
	}
	
}
