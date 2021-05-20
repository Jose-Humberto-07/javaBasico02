/**
 * 
 */
package aula_20_matrizes;
import java.util.Scanner;
/**
 * @author humbe
 *
 */
public class Exercicio006_Jogo_Da_Velha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//JOGO DA VELHA
		Scanner teclado = new Scanner (System.in);
		
		char[][] jogoVelha = new char[3][3];
		
		
		
		
		
		System.out.println("=====================================");
		System.out.println("            JOGO DA VELHA            ");
		System.out.println("=====================================");
		System.out.println();
		System.out.println("Símbolos dos jogadores");
		System.out.println("Jogador 1 = x");
		System.out.println("Jogador 2 = o");
		System.out.println();
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("         QUE COMEÇE A PARTIDA        ");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.println();
		
		
		
		boolean ganhou = false;//flag
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;
		
		
		
		
		while (!ganhou) {
			
			
			
			if (jogada % 2 == 1) {
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3): ");
				sinal = 'x';
			}else {
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3): ");
				sinal = 'o';
			}
			
			
			
			
			boolean linhaValida = false; //linha
			while(!linhaValida) {
				System.out.println("Entre com a linha (1, 2 ou 3):");
				linha = teclado.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				}else {
					System.out.println("Entrada inválida, tente novamnete por favor");
				}
			}
			
			
			
			
			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println("Entre com a coluna (1, 2 ou 3): ");
				coluna = teclado.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				}else {
					System.out.println("Entrada inválida, tente novamente.");
				}
			}
			
			
			
			linha--;
			coluna--;
			//verificado condições
			if (jogoVelha[linha][coluna] == 'x' || jogoVelha[linha][coluna] == 'o') {
				System.out.println("Posição já usada, tente novamente.");
			}else { //jogada valida
				jogoVelha[linha][coluna] = sinal;
				jogada++;
			}
			
			
			
			//imprimir o tabuleiro
			for (int l = 0; l < jogoVelha.length; l++) {
				for(int c = 0; c < jogoVelha[l].length; c++) {
					System.out.print(jogoVelha[l][c] + "|");
				}
				System.out.println();
			}
			
			
			
			
			//verificar se tem ganhador
			if ((jogoVelha[0][0] == 'x' && jogoVelha[0][1] == 'x' && jogoVelha[0][2] == 'x')     || //linha1 
					(jogoVelha[1][0] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[1][2] == 'x') || //linha2
					(jogoVelha[2][0] == 'x' && jogoVelha[2][1] == 'x' && jogoVelha[2][2] == 'x') || //linha3
					(jogoVelha[0][0] == 'x' && jogoVelha[1][0] == 'x' && jogoVelha[2][0] == 'x') || //coluna1
					(jogoVelha[0][1] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][1] == 'x') || //coluna2
					(jogoVelha[0][2] == 'x' && jogoVelha[1][2] == 'x' && jogoVelha[2][2] == 'x') || //coluna3
					(jogoVelha[0][0] == 'x' && jogoVelha[1][1] == 'x' && jogoVelha[2][2] == 'x')    //diagonal
					) {
				ganhou = true;
				System.out.println("Parabéns, jogador 1 ganhou!");
			} else {
				if ((jogoVelha[0][0] == 'o' && jogoVelha[0][1] == 'o' && jogoVelha[0][2] == 'o')     || //linha1 
						(jogoVelha[1][0] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[1][2] == 'o') || //linha2
						(jogoVelha[2][0] == 'o' && jogoVelha[2][1] == 'o' && jogoVelha[2][2] == 'o') || //linha3
						(jogoVelha[0][0] == 'o' && jogoVelha[1][0] == 'o' && jogoVelha[2][0] == 'o') || //coluna1
						(jogoVelha[0][1] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][1] == 'o') || //coluna2
						(jogoVelha[0][2] == 'o' && jogoVelha[1][2] == 'o' && jogoVelha[2][2] == 'o') || //coluna3
						(jogoVelha[0][0] == 'o' && jogoVelha[1][1] == 'o' && jogoVelha[2][2] == 'o')    //diagonal
						) {
					ganhou = true;
					System.out.println("Parabéns, jogador 2 ganhou!");
			}else {
				if(jogada > 9) {
					ganhou = true;
					System.out.println("Ninguém ganhou!");
				}
			}
		}
	}
		
  }
	
}
