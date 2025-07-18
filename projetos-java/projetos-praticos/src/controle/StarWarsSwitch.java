package controle;

import java.util.Scanner;

public class StarWarsSwitch {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escolha um personagem:");
		String personagem = entrada.next();

		switch (personagem.toLowerCase()) {
		case "anakin":
			System.out.println("Anakin is gone!");
			break;
		case "obi-wan":
			System.out.println("You were my brother Anakin! I loved to You");
			break;
		case "padme":
			System.out.println("Anakin, you're broke my heart, " + "you going path a can't follow!");
			break;
		case "palpatine":
			System.out.println("The dark side of the force is a pathway to many"
					+ " abilities some considerer to be... unnatural");
		case "yoda":
			System.out.println("The force is joing with you");
			break;
		default:
			System.out.println("The person doesn't exit");
		}

		System.out.println("Fim.");
		entrada.close();
	}
}
