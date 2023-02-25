package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Cliente> numeros = new ArrayList<Cliente>();

		String opcao, nome;
		int idade, tipoP, genero;
		long telefone, cpf, cnpj;

		do {
			System.out.println("Nome: ");
			ler.skip("\\R?");
			nome = ler.nextLine();

			System.out.println("Idade: ");
			idade = ler.nextInt();

			System.out.println("Gênero: ");
			ler.skip("\\R?");
			genero = ler.nextInt();

			System.out.println("Telefone: ");
			telefone = ler.nextLong();

			System.out.println("Tipo de Pessoa: ");
			tipoP = ler.nextInt();

			switch (tipoP) {
			case 1 -> {
				System.out.println("Digite o seu CPF: ");
				cpf = ler.nextLong();

				PessoaFísica pf = new PessoaFísica(nome, idade, genero, telefone, tipoP, cpf);
				numeros.add(pf);
			}
			case 2 -> {
				System.out.println("Digite o seu CNPJ: ");
				cnpj = ler.nextLong();

				PessoaJurídica pj = new PessoaJurídica(nome, idade, genero, telefone, tipoP, cnpj);
				numeros.add(pj);
			}

			}

			System.out.println("Deseja continuar? (S/N): ");
			ler.skip("\\R?");
			opcao = ler.nextLine();

		} while (opcao.equalsIgnoreCase("S"));

		for (var numero : numeros)
			numero.visualizar();
	}

}
