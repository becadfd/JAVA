package vetoresematrizes;

import java.util.Scanner;

public class Vetor1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int vetorNum[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int num, localizador = 0;
		float[] vetorFloat = new float[10];

		System.out.println("Digite o valor que deseja encontrar: ");
		num = ler.nextInt();

		for (int indice = 0; indice < vetorFloat.length; indice++) {
			if (num == vetorNum[indice]) {
				System.out.println("O número " + num + " está na posição: " + indice);
				localizador = 1;
			}

		}
		if (localizador == 0) {
			System.out.println("O número " + num + " não foi encontrado!");
			localizador = 0;

		}

		ler.close();

	}
}
