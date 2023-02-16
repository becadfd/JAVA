package arrayslist;

import java.util.Scanner;
import java.util.Stack;

public class Pilha1 {

	public static void main(String[] args) {
		Stack<String> livros = new Stack<String>();
		Scanner ler = new Scanner(System.in);

		int opcao;
		String livro;

		System.out.println("Bem vindo(a/e) a sua estante virtual!");

		while (true) {
			System.out.println("1- Adicionar um livro");
			System.out.println("2- Ver a sua lista de livros");
			System.out.println("3- Retirar um livro da sua lista");
			System.out.println("0- Finalizar sua operação");
			opcao = ler.nextInt();

			if (opcao == 0) {
				System.out.println("Operação finalizada.");
				ler.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println("Digite o título do novo livro: ");
				ler.skip("\\R?");
				livro = ler.nextLine();
				livros.add(livro);
				System.out.println("Livro adicionado com suscesso!");
				break;
			case 2:
				if (livros.isEmpty())
					System.out.println("Lista vazia!");
				else
					System.out.println("Lista de livros: ");
				livros.forEach(System.out::println);
				break;
			case 3:
				System.out.println("O livro " + livros.pop() + " foi removido.");
				break;
			}

		}

	}

}
