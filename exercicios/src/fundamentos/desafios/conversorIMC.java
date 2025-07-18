package fundamentos.desafios;

import java.util.Scanner;

public class conversorIMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("== Calculadora de IMC ==");
		
		System.out.println("Digite a sua altura(metros):");
		double altura = entrada.nextDouble();
		
		System.out.println("Digite o seu peso(kg):");
		double peso = entrada.nextDouble();
		
		double resultado = peso / (altura * altura);
		System.out.printf("Seu IMC é de: %.2f", resultado);
		
		entrada.close();
	}
}
