package lacosderepeticao;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idade = 0, menor21 = 0, maior50 = 0;

		System.out.println("Digite uma idade");
		idade = ler.nextInt();

		while (idade > 0) {
			if (idade < 21) {
				menor21++;
			} else if (idade > 50) {
				maior50++;
			}
			System.out.println("Digite uma idade");
			idade = ler.nextInt();
		}

		System.out.println("Número de pessoas com mais de 21 anos: " + menor21);
		System.out.println("Número de pessoas com menos de 50 anos: " + maior50);

		ler.close();
	}

}
