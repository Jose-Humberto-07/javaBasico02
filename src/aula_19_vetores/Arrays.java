/**
 * 
 */
package aula_19_vetores;

/**
 * @author humbe
 *
 */
public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] temperaturas = new double [365];
		
		System.out.println("O valor da temperatura do dia 3 é: " + temperaturas[2]);
		
		System.out.println("O tamaho do array: " + temperaturas.length);
		
		System.out.println("valores do array: ");
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " +(i+1)+ " é: " + temperaturas[i]);
			
		}
	}

}
