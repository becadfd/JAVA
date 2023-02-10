package lacosderepeticao;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero;
		boolean ok = false;
		String continua;

		do {
			do {
				System.out.println("Qual a Tabuada que você deseja calcular: ");
				numero = ler.nextInt();

				if (numero < 1 || numero > 10)
					System.out.println("Digite um número entre 1 e 10: ");
				else
					ok = true;
			} while (ok == false);

			for (int contador = 1; contador <= 10; contador++) {
				System.out.println("\n" + numero + " x " + contador + " = " + (numero * contador));
			}

			ok = false;

			System.out.println("Deseja continuar? (S/N)");
			ler.skip("\\R?");
			continua = ler.nextLine();

		} while (continua.equalsIgnoreCase("S"));
		ler.close();
	}
}
