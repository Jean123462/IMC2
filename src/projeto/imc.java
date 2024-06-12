package projeto;
import java.util.Scanner;

public class imc {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);


	double altura = 0; 
	double peso;
	double IMC; 
	System.out.println("Digite o seu peso e sua altura ");
	peso = teclado.nextDouble();
	altura = teclado.nextDouble();

	
	IMC=peso / Math.pow(altura,2);

	

	
	//nomedafuncao(peso)
					
	}
	static String IMC2 (double IMC){
		String mensagem ="";	//idade

				if (IMC <= 18.5) {
					System.out.println("abaixo do peso");
				} else if (IMC >= 18.6 && IMC <= 24.9) {
					System.out.println("Peso ideal");
				} else if (IMC >= 25 && IMC < 29.9) {
					System.out.println("levemente acima do peso");
				} else if (IMC >= 30 && IMC < 34.9) {
					System.out.println("Obesidade grau 1");
				}else if (IMC >= 35 && IMC < 39.9) {
					System.out.println("Obesidade grau 2");
				}else if (IMC >= 40) {
					System.out.println("Obesidade grau 3");
				}
			 return mensagem;
			}
	






}
