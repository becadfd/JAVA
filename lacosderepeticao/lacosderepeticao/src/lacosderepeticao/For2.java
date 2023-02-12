package lacosderepeticao;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num = 0, pares = 0, impares = 0;

		for (int contador = 1; contador <= 10; contador++) {
			System.out.println("Digite o " + contador + "º número: ");
			num = ler.nextInt();
			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		System.out.println("Pares: " + pares);
		System.out.println("Ímpares: " + impares);

		ler.close();

	}
}
