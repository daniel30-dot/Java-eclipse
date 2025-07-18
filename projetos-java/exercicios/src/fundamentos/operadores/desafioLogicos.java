package fundamentos.operadores;

public class desafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		// Terça & Quinta = TV 50 polegadas
		// Terça ^ Quinta = TV 32 polegadas
		// Terça || Quinta = Tomar sorvete (Após comprar qualquer opção das TVs)
		// Nenhuma opção = Mais saudável, sem tomar sorvete
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		

		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		//Operador Binário
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		
		// Operador unário
		System.out.println("Mais saudável?" + maisSaudavel);
	}
}
