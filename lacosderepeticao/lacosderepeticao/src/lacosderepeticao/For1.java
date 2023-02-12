package lacosderepeticao;

import java.util.Scanner;

public class For1 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num1, num2;

		System.out.println("Primeiro número:");
		num1 = ler.nextInt();

		System.out.println("Segundo número: ");
		num2 = ler.nextInt();

		if (num1 > num2) {
			System.out.println("Intervalo inválido!");
		} else {
			System.out.println("No intervalo entre " + num1 + "e" + num2 + ":");
		}

		for (int i = num1; i <= num2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " é multiplo de 3 e 5");
			}

		}

		ler.close();

	}

}
