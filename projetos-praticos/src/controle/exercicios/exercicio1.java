package controle.exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// -- verificação de numeral --
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número entre 0 à 10");
		
		int numero = entrada.nextInt();
		
		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("Número " + numero + " é par");
			} else {
				System.out.println("Número " + numero + " é impar");
			}

		} else {
			System.out.println("O número é inválido.");
		}
		
		entrada.close();
	}
}
