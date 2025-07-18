package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; //Literal long
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_102.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; ///ativo
		
		// Java dá advertência para cada variável não utilizada
		// Portanto, iremos utiliza-las:
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		// Salário funcionário
		System.out.println(id + ": ganha -> " + salario);
		
		// Férias? true ou false
		System.out.println("Férias? " + estaDeFerias);
		
		//Status
		System.out.println("Status: " + status);
	}
}
