package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
	
		double a = 4.5; //declaração e inicialização
		System.out.println(a);
		
		a = 12; //a variavel double aceita int porém só é possível pois adiciona o "0."
		System.out.println(a);
		
//		a = "..."
		
		var b = 4.5; // O java vai inferir o tipo de variável pelo valor, no caso " 4.5.
		System.out.println(b);
		
		var c = "Texto"; // o interpretador vê como "string"
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
//		c = 4.5; //A variavel sempre vai estar amarrada a um tipo então string, não pode mudar pra int ou double ou vice-versa.
		
		double d; // variável foi declarada
		d = 123.65; //variável foi  inicializada
		System.out.println(d); //usada!
		
//		var e; //incorreto,pois var tem que ser declarado e inicializado em linha única.
//		e = 123.45;
				
		var e = 123.45;
		System.out.println(e);
		
		var f = 12; //inteiro
		// f = 12.01; // valor inteiro do java não armazena casas decimais
		System.out.println(f);
	}
}
