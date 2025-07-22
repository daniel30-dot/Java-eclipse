package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();

		d1.data = 12;
		d1.mes = 8;
		d1.ano = 2003;

		var d2 = new Data();
		d2.data = 23;
		d2.mes = 9;
		d2.ano = 2001;

		System.out.printf("Eu nasci em %d/%d/%d\n", d1.data, d1.mes, d1.ano);
		System.out.printf("Eu nasci em %d/%d/%d\n", d2.data ,d2.mes ,d2.ano);
	}
}
