package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		//Print imprime sem quebra de linha
		
		System.out.print("Bom");
		System.out.print("dia!\n\n");
		
		//println imprime com quebra de linha ao final
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		//Permite formatar a saída com placeholders
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n",
				1 , 2, 3, 4 ,5 ,6);
		System.out.printf("Salário: %.1f%n", 1234.56789);
		System.out.printf("Nome: %s%n", "João");
		
		//Usado para entrada de dados
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade  = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n ",
				nome, sobrenome, idade);
		
		//Após usar o scanner feche ele
		
		entrada.close();
		
	}
}
 