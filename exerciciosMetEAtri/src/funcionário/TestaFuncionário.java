package funcionário;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaFuncionário {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Funcionário> atributos = new ArrayList<Funcionário>();

		String opcao, nome, tempo, equipe;
		int funcao, vendas;
		float salario, novoSalario;

		do {
			System.out.println("Digite o Nome do Funcionário: ");
			ler.skip("\\R?");
			nome = ler.nextLine();

			System.out.println("Digite o Tempo de Empresa do Funcionário: ");
			ler.skip("\\R?");
			tempo = ler.nextLine();

			System.out.println("Digite a Função do Funcionário: ");
			funcao = ler.nextInt();

			System.out.println("Salário Atual: ");
			salario = ler.nextFloat();

			System.out.println("Digite o Novo Salário: ");
			novoSalario = ler.nextFloat();

			switch (funcao) {
			case 1 -> {
				System.out.println("Quantidade de vendas do mês: ");
				vendas = ler.nextInt();

				Vendedor v1 = new Vendedor(nome, tempo, funcao, salario, novoSalario, vendas);
				atributos.add(v1);
			}
			case 2 -> {
				System.out.println("Equipe que gerencia: ");
				ler.skip("\\R?");
				equipe = ler.nextLine();

				Gerente g1 = new Gerente(nome, tempo, funcao, salario, novoSalario, equipe);
				atributos.add(g1);
			}

			}
			System.out.println("\nDeseja continuar? (S/N)");
			ler.skip("\\R?");
			opcao = ler.nextLine();

		} while (opcao.equalsIgnoreCase("S"));

		for (var atributo : atributos)
			atributo.visualizar();

	}

}
