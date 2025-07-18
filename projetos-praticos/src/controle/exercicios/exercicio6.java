package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class exercicio6 {

	/*
	 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um
	 * numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar
	 * o número gerado. Ao final de cada tentativa, imprima a quantidade de
	 * tentativas restantes, e imprima se o número inserido é maior ou menor do que
	 * o número armazenado.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		
		int numeroSecreto = random.nextInt(101); // número aleatório de 0 à 100
		int tentativas = 10;
		
		System.out.println("===Jogo de Adivinhação===");
		System.out.println("Tente adivinhar o número de 0 à 100. \nVocê tem 10 tentativas!");
		
		while (tentativas > 0) {
			System.out.println("Digite sua tentativa: ");
			int palpite = entrada.nextInt();
			
			if (palpite == numeroSecreto) {
				System.out.println("Parabéns, você acertou! O número secreto é " + numeroSecreto + "!");
				break;
			} else if (palpite < numeroSecreto) {
				System.out.println("Errou! O número secreto é maior que " + palpite + ".");
			} else {
				System.out.println("Errou! O número secreto é menor que " + palpite + ".");
			}
			
			tentativas--;
			System.out.println("Tentativas restantes: " + tentativas);
			
			if (tentativas == 0) {
				System.out.println("Suas tentativas acabaram. O número secreto era " + numeroSecreto);
			} 
			
		}
		
		entrada.close();
	}
}
