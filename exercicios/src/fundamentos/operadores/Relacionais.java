package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		
//		int a = 97;
//		int b = 'a';
//		
//		System.out.println(a == b);
//		System.out.println('\u0061'); // 97 em hexadecimal
//		
		System.out.println(3 > 4);
		System.out.println(3 >= 4);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		
		double nota = 7.8;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = passouPorMedia && bomComportamento;
		
		System.out.println("Tem desconto? " + temDesconto);
	}
}
