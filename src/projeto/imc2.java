package projeto;
import java.util.Scanner;

public class imc2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Número de viagens de um veículo por dia");

		System.out.println("-------------------------");

		System.out.println("digite a distância de ida:");
		double distancia1 = teclado.nextInt();
		System.out.println("digite a velociadade de ida:");
		double velociada1 = teclado.nextInt();
		System.out.println("digite a distância de volta:");
		double distancia2 = teclado.nextInt();
		System.out.println("digite a distância de volta:");
		double velociada2 = teclado.nextInt();
		System.out.println("digite o tempo de carga e descarga em minutos na ida:");
		double cargaEdescarga = teclado.nextInt();
		System.out.println("digite o tempo de carga e descarga em minutos na volta:");
		double cargaEdescarga2 = teclado.nextInt();

		System.out.println( tempo(distancia1, velociada1, distancia2, velociada2, cargaEdescarga, cargaEdescarga2) );

			


}
	static double tempo(double distancia1, double velociada1, double distancia2, double velociada2,
			double cargaEdescarga, double cargaEdescarga2) {
		double tempoViagem1 = (distancia1 / velociada1) * 60;
		double tempoViagem2 = (distancia2 / velociada2) * 60;
		double tempoViagem3=cargaEdescarga + cargaEdescarga2;
		
		double tempoTotal = tempoViagem2 + tempoViagem1 + tempoViagem3;
		
		return tempoTotal;

}
}