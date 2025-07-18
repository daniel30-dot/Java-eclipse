package fundamentos.desafios;

import java.util.Scanner;

public class calculadoraExponencial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		double valor = entrada.nextDouble();
		
		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);
		
		System.out.println("O quadrado de " + valor + " é " + quadrado);
		System.out.println("O cubo de " + valor + " é " + cubo);
		
		entrada.close();
	}
}
