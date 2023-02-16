package arrayslist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ListaSet1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Set<Integer> inNum = new HashSet<Integer>();

		int num = 0;

		System.out.println("Digitar 10 números inteiros não repetidos...");

		for (int contador = 0; contador < 10; contador++) {
			System.out.println("Digite: ");
			num = ler.nextInt();
			inNum.add(num);
		}
		Iterator<Integer> iNum = inNum.iterator();

		while (iNum.hasNext())
			System.out.println(iNum.next());

		ler.close();
	}
}
