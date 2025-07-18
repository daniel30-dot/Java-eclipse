package fundamentos.operadores;

public class desafioAritmeticos {

	public static void main(String[] args) {
		
//		int a = 3 - 5 * 10;
//		int b = (int) Math.pow(a, 4);
//		double c = Math.pow(a, 4);
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
		// Desafio matematico
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é: " + resultado);
	}
}
