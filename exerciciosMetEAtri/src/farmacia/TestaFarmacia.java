package farmacia;

import java.util.Scanner;

public class TestaFarmacia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Farmacia c1 = new Farmacia(6, 6, 6, 1, 10);
		c1.visualizar();

		Farmacia c2 = new Farmacia(3, 3, 3, 2, 7 * 2);
		c2.visualizar();

		int opcao;

		while (true) {
			System.out.println("****************************************************************");
			System.out.println("                                                                ");
			System.out.println("            💊 Bem-vinde a Farmácia da Vila 💊                   ");
			System.out.println("                                                                ");
			System.out.println("****************************************************************");
			System.out.println("            1- Ver lista de medicações                          ");
			System.out.println("            2- Comprar                                          ");
			System.out.println("            3- Sair                                             ");
			System.out.println("                                                                ");
			System.out.println("****************************************************************");
			System.out.println("                                                                ");
			System.out.println("Digite uma opção para começar: ");

			opcao = ler.nextInt();

			if (opcao == 3) {
				System.out
						.println("Obrigade por visitar nossa farmácia!\nFarmácia da Vila - A fármacia da sua família!");
				ler.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1 -> System.out.println("Lista de medicações\n\n");
			case 2 -> System.out.println("Digite o código do produto\n\n");
			default -> System.out.println("Opção inválida!");
			}

		}
	}

}
