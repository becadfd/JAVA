package lacosderepeticao;

import java.util.Scanner;

public class Do2 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num;
		float soma = 0, quantidade = 0, media = 0;

		do {

			System.out.println("Digite um número: ");
			num = ler.nextInt();

			if (num != 0 && num % 3 == 0) {
				soma += num;
				quantidade++;

			}

		} while (num != 0);

		media = soma / quantidade;

		System.out.printf("Média da soma dos números divisíveis por 3: %.1f", media);
		media = ler.nextFloat();

		ler.close();
	}

}
