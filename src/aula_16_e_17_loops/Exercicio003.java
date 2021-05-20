/**
 * 
 */
package aula_16_e_17_loops;
import java.util.Scanner;
/**
 * @author humbe
 *
 */
public class Exercicio003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		boolean  infoValida = false;
		String nome, sexo;
		int idade;
		double salario;
		
		do {
			System.out.println("Entre com o nome:");
			nome = teclado.next();
			
			if (nome.length() >= 3) {
				infoValida = true;
			}else {
				System.out.println("Nome precisa no m�nimo de 3 caracteres.");
			}
			
		} while (!infoValida);
		
		
		
		infoValida = false;
		do {
			System.out.println("Entre com a idade:");
			idade = teclado.nextInt();
			
			if (idade >= 0 && idade <= 100) {
				infoValida = true;
			}else {
				System.out.println("Idade precisa ser entre 0 e 100.");
			}
			
		} while (!infoValida);
		
		
		
		infoValida = false;
		do {
			System.out.println("Entre com o sal�rio:");
			salario = teclado.nextDouble();
			
			if (salario > 0) {
				infoValida = true;
			}else {
				System.out.println("Sal�rio precisa ser maior que 0.");
			}
			
		} while (!infoValida);
		
		
		
		infoValida = false;
		do {
			System.out.println("Entre com o sexo:");
			sexo = teclado.next();
			
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			}else {
				System.out.println("Sexo precisa ser 'f' ou 'm'.");
			}
			
		} while (!infoValida);
		
		
		String estadoCivil;
		infoValida = false;
		do {
			System.out.println("Entre com o estado civil:");
			estadoCivil = teclado.next();
			
			if (estadoCivil.equalsIgnoreCase("s") ||
					estadoCivil.equalsIgnoreCase("c") ||
					estadoCivil.equalsIgnoreCase("v") || 
					estadoCivil.equalsIgnoreCase("d") ) {
				infoValida = true;
			}else {
				System.out.println("Estado civil ser 's' , 'm' , 'v' ou 'd'");
			}
			
		} while (!infoValida);//(n�o for v�lida)
		
		
		//out put (resultados)
		System.out.println();
		System.out.println("====================");
		System.out.println("INFOMA��ES COLETADAS");
		System.out.println("====================");
		System.out.println();
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sal�rio: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
	}

}
