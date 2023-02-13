package vetoresematrizes;

import java.util.Scanner;

public class Vetor2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int vetorNum[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int soma = 0;

		System.out.println("Todos os elementos ímpares do vetor: ");
		for (int indice = 0; indice < vetorNum.length; indice++) {

			if (indice % 2 != 0) {
				System.out.print(vetorNum[indice] + " ");

			}
		}

		System.out.println("\nTodos os elementos pares do vetor: ");

		for (int indice = 0; indice < vetorNum.length; indice++) {
			if (indice % 2 == 0) {
				System.out.print(vetorNum[indice] + " ");

			}
		}
		System.out.println("\nTodos os elementos pares do vetor: ");
		for (int indice = 0; indice < vetorNum.length; indice++) {
			System.out.print(vetorNum[indice] + " ");
			soma += vetorNum[indice];
		}

		System.out.println("\nSoma: " + soma);
		float media = (float) soma / vetorNum.length;
		System.out.printf("Média: %.2f", media);
		ler.close();
	}

}
