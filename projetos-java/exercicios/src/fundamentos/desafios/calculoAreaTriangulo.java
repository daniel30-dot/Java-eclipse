package fundamentos.desafios;

import java.util.Scanner;

public class calculoAreaTriangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("== Calculo Area do Triangulo==");
		
		System.out.println("Digite o valor da base");
		int base = entrada.nextInt();
		System.out.println("Digite o valor da altura");
		int altura = entrada.nextInt();
		
		double area = base * altura / 2;
		System.out.println("O valor da area é: " + area);
		
		entrada.close();
	}
}
