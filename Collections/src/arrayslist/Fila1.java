package arrayslist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila1 {
	public static void main(String[] args) {

		Queue<String> clientes = new LinkedList<String>();
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		String cliente;

		System.out.println("Bem vindo a fila de espera do nosso banco!");

		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Cliente na Fila            ");
			System.out.println("            2 - Listar todos os Clientes             ");
			System.out.println("            3 - Retirar Cliente da Fila              ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			opcao = ler.nextInt();

			if (opcao == 0) {
				System.out.println("Programa finalizado.");
				ler.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do cliente que deseja adicionar: ");
				ler.skip("\\R?");
				cliente = ler.nextLine();
				clientes.add(cliente);
				System.out.println("Cliente adicionado!");
				break;
			case 2:
				System.out.println("Clientes na fila: ");
				if (clientes.isEmpty())
					System.out.println("A fila está vazia!");
				else
					clientes.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Chamar Cliente:");
				if (clientes.isEmpty())
					System.out.println("A fila está vazia!");
				else
					System.out.println(clientes.poll() + " Compareça ao guichê");
				break;

			default:
				System.out.println("Opção indisponível.");
			}

		}

	}

}
