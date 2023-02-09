package lacos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("###.##");

		Scanner leia = new Scanner(System.in);

		int produto, quantidade;
		float total;

		System.out.println("Código dos produtos: ");
		System.out.println("1-\tCachorro Quente");
		System.out.println("2-\tX Salada");
		System.out.println("3-\tX Bacon");
		System.out.println("4-\tBauru");
		System.out.println("5-\tRefrigerante");
		System.out.println("6-\tSuco de Laranja");

		System.out.println("Digite o código do produto: ");
		produto = leia.nextInt();

		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();

		switch (produto) {
		case 1:
			System.out.println("Produto: Cachorro Quente");
			total = 10f * quantidade;
			System.out.println("Total: " + df.format(total));
			break;
		case 2:
			System.out.println("Produto: X Salada");
			total = 15f * quantidade;
			System.out.println("Total: " + df.format(total));
			break;
		case 3:
			System.out.println("Produto: X Bacon");
			total = 18f * quantidade;
			System.out.println("Total: " + df.format(total));
			break;
		case 4:
			System.out.println("Produto: Bauru");
			total = 12f * quantidade;
			System.out.println("Total: " + df.format(total));
			break;
		case 5:
			System.out.println("Produto: Refrigerante");
			total = 8f * quantidade;
			System.out.println("Total: " + df.format(total));
			break;
		case 6:
			System.out.println("Produto: Suco de Laranja");
			total = 13f * quantidade;
			System.out.println("Total: " + df.format(total));
			break;

		}

		leia.close();
	}

}
