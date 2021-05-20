/**
 * 
 */
package aula_20_matrizes;

import java.util.Scanner;

/**
 * @author humbe
 *
 */
public class Exercicio004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String[][] compromissos = new String[31][24];
		
		
		boolean sair = false;
		byte opcao; //enquanto não sair //quando sair for verdaeiro, terminar execução
		while (!sair) {
			System.out.println("=====================");
			System.out.println("-------AGENDA-------");
			System.out.println("=====================");
			System.out.println();
			System.out.println("MENU");
			System.out.println("Digite 1 para adcionar compromisso: ");
			System.out.println("Digite 2 para verificar compromisso: ");
			System.out.println("Digite 0 para sair: ");
			opcao = teclado.nextByte();
			
			if (opcao == 1) {//adcionar compromisso
				//validar dia
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mês: ");
					 dia = teclado.nextInt();
					 if (dia > 0 && dia <= 31) {
						 diaValido = true;
					 }else {
						 System.out.println("Dia inválido, digite novamnete.");
					 }
				}
				
				
				
				//validar hora
				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso: ");
					 hora = teclado.nextInt();
					 if (hora >= 0 && hora <= 24) {
						 horaValida = true;
					 }else {
						 System.out.println("Hora inválida, digite novamnete.");
					 }
				}
				
				dia--;
				System.out.println("Digite o compromisso: ");
				compromissos[dia][hora] = teclado.next();
				
			}else {
				if (opcao == 2) {//verrificar compromisso
					boolean diaValido = false;
					int dia = 0;
					while (!diaValido) {
						System.out.println("Entre com o dia do mês: ");
						 dia = teclado.nextInt();
						 if (dia > 0 && dia <= 31) {
							 diaValido = true;
						 }else {
							 System.out.println("Dia inválido, digite novamnete.");
						 }
					}
					
					
					
					//validar hora
					boolean horaValida = false;
					int hora = 0;
					while (!horaValida) {
						System.out.println("Entre com a hora do compromisso: ");
						 hora = teclado.nextInt();
						 if (hora >= 0 && hora <= 24) {
							 horaValida = true;
						 }else {
							 System.out.println("Hora inválida, digite novamnete.");
						 }
					}
					
					
					dia--;
					System.out.println("O compromisso agendado é: ");
					System.out.println(compromissos[dia][hora]);
					
					
				}else {
					if (opcao == 0) {
						sair = true;
					}else {
						System.out.println("Opção inválida, digite novamente.");
					}
				}
				
				
			}
		}
		
	}

}
