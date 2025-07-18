package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		
		System.out.println(3 + 4);
		
		var x = 34.5;
		double y = 2.5;
		
		System.out.println(x - y);
		System.out.println(x + y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		System.out.println(a - b);
		System.out.println(a + b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b); //mostra o resultado em casas decimais
		System.out.println(a / (float) b); // casas decimais menores
		
		System.out.println(a % b); //resto da divisão 
		System.out.println(8 % 3);
		
		System.out.println( x + y - a * b); // ordem de precedência 
	}
	
}
