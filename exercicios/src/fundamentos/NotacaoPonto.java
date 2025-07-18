package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		
		// Da pra concatenar valores desde que sejam do mesmo tipo
		String x = "Leo"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(x);
		
		// Tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
	}
}
