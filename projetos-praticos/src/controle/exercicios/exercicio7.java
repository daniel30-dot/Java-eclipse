package controle.exercicios;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		/*
		 * 7. Criar um programa que enquanto estiver recebendo números positivos,
		 * imprime no console a soma dos números inseridos, caso receba um número
		 * negativo, encerre o programa. Tente utilizar a estrutura do while.
		 */
		
		Scanner entrada = new Scanner(System.in);

		int somadorDeNumeros = 0; //valor inicial da variável
		int numero = 0;
		
		while (numero >= 0) {
			System.out.println("Digite o número inteiro (ou negativo para sair)");
			numero = entrada.nextInt();
			if (numero >= 0) {
				somadorDeNumeros += numero;
				System.out.printf("\nSoma até o momento: %d\n", somadorDeNumeros);
			} else {
				System.out.println("Programa encerrado.");
		}
		
		
	}
		entrada.close();
	}
}
