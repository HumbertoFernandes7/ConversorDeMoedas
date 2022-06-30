import java.util.Scanner;

import entities.ConversorDeMoedas;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual moeda voc� deseja comprar? ");
		System.out.println("1-Dolar 2-Euro ");
		int moedaDesejada = sc.nextInt();

		if (moedaDesejada == 1) {

			System.out.println("Qual o pre�o da moeda dolar? ");
			double dolar = sc.nextDouble();

			System.out.println("Quantos dolares voc� deseja comprar? ");
			double quantidade = sc.nextDouble();

			double resultado = ConversorDeMoedas.converterDolar(dolar, quantidade);
			System.out.println("Voc� pagara " + resultado + " reais" + " com uma taxa de leves 6%");
			

		} else if (moedaDesejada == 2) {
			System.out.println("Qual o pre�o da moeda euro? ");
			double euro = sc.nextDouble();

			System.out.println("Quantos dolares voc� deseja comprar? ");
			double quantidade = sc.nextDouble();

			double resultado = ConversorDeMoedas.converterEuro(euro, quantidade);
			System.out.println("Voc� pagara " + resultado + " reais" + " com uma taxa de leves 10%");
		}

		sc.close();
	}
}
