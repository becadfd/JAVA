package games;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaProdutos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Produtos> games = new ArrayList<Produtos>();

		String opcao, cliente;
		int tipoP, forma, classificacaoI, tipoM, jogo, console;
		float preco;

		do {
			System.out.println("Digite o tipo de Produto que deseja: ");
			tipoP = ler.nextInt();

			System.out.println("Digite o nome do Cliente: ");
			ler.skip("\\R?");
			cliente = ler.nextLine();

			System.out.println("Digite o Tipo de Mídia: ");
			tipoM = ler.nextInt();

			System.out.println("Digite o Preço: ");
			preco = ler.nextFloat();

			System.out.println("Digite a forma de pagamento: ");
			forma = ler.nextInt();

			switch (tipoP) {
			case 1 -> {
				System.out.println("Digite o código do Jogo: ");
				jogo = ler.nextInt();

				System.out.println("Digite a Classificação Indicativa: ");
				classificacaoI = ler.nextInt();

				Jogo j1 = new Jogo(tipoP, forma, cliente, tipoM, preco, jogo, classificacaoI);
				games.add(j1);
			}
			case 2 -> {
				System.out.println("Digite o código do Console: ");
				console = ler.nextInt();

				Console c1 = new Console(tipoP, forma, cliente, tipoM, preco, console);
				games.add(c1);
			}
			}
			System.out.println("Deseja continuar? (S/N): ");
			ler.skip("\\R?");
			opcao = ler.nextLine();

		} while (opcao.equalsIgnoreCase("S"));

		for (var game : games)
			game.visualizar();
	}

}
