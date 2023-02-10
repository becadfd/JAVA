package lacosderepeticao;

import java.util.Scanner;

public class Do1 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero = 0, soma = 0;

		do {
			System.out.println("Digite um número: ");
			numero = ler.nextInt();

			if (numero > 0) {
				soma += numero;
			}

		} while (numero != 0);

		System.out.println("Soma dos números: " + soma);

		ler.close();
	}
}
