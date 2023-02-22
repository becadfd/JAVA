package farmacia;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaFarmacia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Farmacia> medicamentos = new ArrayList<Farmacia>();

		String opcao, tipo, produto;

		float valor, quantidade, valorTotal;

		do {

			System.out.println("Tipo: ");
			tipo = ler.next();

			System.out.println("Produto: ");
			produto = ler.next();

			System.out.println("Valor unitário: ");
			valor = ler.nextFloat();

			System.out.println("Quantidade: ");
			quantidade = ler.nextFloat();

			System.out.println("Valor total: ");
			valorTotal = ler.nextFloat();

			Farmacia f1 = new Farmacia(tipo, produto, valor, quantidade, valorTotal);

			medicamentos.add(f1);

			System.out.println("\nDeseja continuar? ");
			ler.skip("\\R?");
			opcao = ler.nextLine();

		} while (opcao.equalsIgnoreCase("S"));

		for (var medicamento : medicamentos)
			medicamento.visualizar();

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

		}
	
	}

}
