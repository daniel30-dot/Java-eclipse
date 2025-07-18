package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		// °F e °C  = variaveis e os numeros constantes
		// diferenca = - 32 multiplicador =  5/9
		
		/*constantes que armazenam valores númericos em float */
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		
		/* variaveis que poderão ser utilizadas futuramente*/
		double fahrenheit = 86;
		double celcius = (fahrenheit - AJUSTE) * FATOR; //cálculo 
		System.out.println("O resultado é " + celcius + "°C."); //saída
		
		/*Variáveis sendo utilizadas novamente*/
		fahrenheit = 10;
		celcius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celcius + "°C.");
	}
}
