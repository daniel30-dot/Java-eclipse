package fundamentos.desafios;

import java.util.Scanner;

public class desafio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit: ");
		double farenheit = entrada.nextDouble();
		
		double conversao = (farenheit - 32) / 1.8;
		System.out.printf("Valor em Celcius: %.2f", conversao);
		
		entrada.close();
	}
}
