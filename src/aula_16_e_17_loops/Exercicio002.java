/**
 * 
 */
package aula_16_e_17_loops;
import java.util.Scanner;
/**
 * @author humbe
 *
 */
public class Exercicio002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		boolean infoValidas = false;
		String nomeUser;
		String senha;
		
		do {
			System.out.println("Entre com o nome do usuário: ");
			 nomeUser = teclado.next();
			
			System.out.println("Entre com a senha: ");
			 senha = teclado.next();
			
			
			if (nomeUser.equalsIgnoreCase(senha)) {
				//infoValidas = false;
				System.out.println("Senha igual a usuário, digite novamente.");
			} else {
				infoValidas = true;
				System.out.println("Senha e usuários válidos.");
			}
			
		} while (infoValidas == false);
	}

}
