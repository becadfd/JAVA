package vetoresematrizes;

import java.util.Scanner;

public class Matriz1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int matrizNum[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int somaP, somaS;

		for (int indiceI = 0; indiceI < matrizNum.length; indiceI++) {
			for (int indiceJ = 0; indiceJ < matrizNum.length; indiceJ++) {
			}
		}
		System.out.println(
				"Elementos da Diagonal Principal: " + matrizNum[0][0] + " " + matrizNum[1][1] + " " + matrizNum[2][2]);
		System.out.println(
				"Elementos da Diagonal Secundária: " + matrizNum[0][2] + " " + matrizNum[1][1] + " " + matrizNum[2][0]);

		somaP = matrizNum[0][0] + matrizNum[1][1] + matrizNum[2][2];
		somaS = matrizNum[0][2] + matrizNum[1][1] + matrizNum[2][0];

		System.out.println("Soma dos elementos da Diagonal Principal: " + somaP);
		System.out.println("Soma dos elementos da Diagonal Secundária: " + somaS);

		ler.close();
	}
}
