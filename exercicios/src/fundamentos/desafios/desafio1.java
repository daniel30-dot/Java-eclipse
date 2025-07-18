package fundamentos.desafios;

import java.util.Scanner;

public class desafio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celcius: ");
		double celcius = entrada.nextDouble();
		
		double conversao = celcius * 1.8 + 32;
		System.out.println("Valor em Farenheit:" + conversao);
		
		entrada.close();
	}
}
