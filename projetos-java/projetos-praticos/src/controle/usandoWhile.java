package controle;

public class usandoWhile {

	public static void main(String[] args) {
		// Laço com número desconhecido de repetições

		int hpInimigo = 10;

		while (hpInimigo > 0) {
			System.out.println("Pikachu ataque rápido!");
			hpInimigo -= 10; // tira 10 de hp
			System.out.println("Hp do inimigo diminuiu para: " + hpInimigo + "\n");
		}
		System.out.println("Inimigo foi derrotado!");
		
		// Do While, entra pelo menos uma vez na condição antes de executar
		
		int hpInimigo2 = 0;
		
		do {
			System.out.println("Charmander ataque rápido!"); 
		} while (hpInimigo2 > 0);
		
		System.out.println("Fim da batalha!"); 
	}
}