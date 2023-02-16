package arrayslist;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		String cor;

		for (int lista = 0; lista <= 4; lista++) {
			System.out.println("Digite uma cor: ");
			cor = ler.next();
			cores.add(cor);
		}
		System.out.println("\nLista de cores: ");
		cores.forEach(System.out::println);

		System.out.println("Cores em ordem: ");
		cores.sort(null);
		cores.forEach(System.out::println);

		ler.close();
	}

}
