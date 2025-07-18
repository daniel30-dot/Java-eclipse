package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		// Tudo em java é objeto menos os tipos primitivos(int, boolean, string, float)
		String s = new String("texto");
		System.out.println(s.toUpperCase());
		
		// Wrappers são a versão objeto dos tipos
		// primitivos!
		int a = 123;
		System.out.println(a);
	}
}
