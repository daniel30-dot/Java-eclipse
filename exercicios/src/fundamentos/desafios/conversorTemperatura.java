package fundamentos.desafios;

import java.util.Scanner;

public class conversorTemperatura {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("== Conversor de temperatura==");
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Fahrenheit para Celcius");
		System.out.println("2 - Celcius para Fahrenheit");
		
		System.out.print("Escolha uma opção:");
		int opcao = entrada.nextInt();
		
		double temperatura, resultado;
		
		switch (opcao) {
		case 1: 
			System.out.println("Digite a temperatura em Fahrenheit: ");
			temperatura = entrada.nextDouble();
			resultado = (temperatura - 32) * 5/9;
			System.out.printf("%.2f°F = %.2f°C\n", temperatura, resultado);
			break;
		case 2:
			System.out.println("Digite a temperatura em Celcius: ");
			temperatura = entrada.nextDouble();
			resultado = (temperatura * 9/5) + 32;
			System.out.printf("%.2f°C\n = %.2f°F", temperatura, resultado);
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		entrada.close();
	}
}
