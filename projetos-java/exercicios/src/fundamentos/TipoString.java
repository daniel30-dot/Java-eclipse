package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		// charAt pega qualquer indice da string
		System.out.println("Olá pessoal".charAt(4));

		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());

		// Verificar tamanho de string
		String nome = "Daniel";
		System.out.println("Tamanho: " + nome.length());

		// Verificar se contém uma palavra
		String frase = "Estou aprendendo Java";
		boolean temJava = frase.contains("Java");
		System.out.println("Contém 'Java'?" + temJava);

		// Pegar parte da string(substring)
		String palavra = "Programador";
		String parte = palavra.substring(0, 6);
		System.out.println(parte);

		// Substituir palavras na string
		String saudacao = "Bom dia, João!";
		String nova = saudacao.replace("João", "Carlos");
		System.out.println(nova);

		// Colocar tudo em maiúsculo ou minúsculo
		String texto = "Java é top!";
		System.out.println(texto.toUpperCase());
		System.out.println(texto.toLowerCase());
	}
}
