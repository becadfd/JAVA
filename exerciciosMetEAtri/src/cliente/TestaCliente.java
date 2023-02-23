package cliente;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String opcao, nome, genero; 
		int idade, assinatura; 
		float telefone;
		
		do {
			System.out.println("Nome: ");
			ler.skip("\\R?");
			nome = ler.nextLine();
			
			System.out.println("Idade: ");
			idade = ler.nextInt();
			
			System.out.println("Gênero: ");
			ler.skip("\\R?");
			genero = ler.nextLine();
			
			System.out.println("Telefone: ");
			telefone = ler.nextFloat();
			
			System.out.println("Tipo de Assinatura: ");
			assinatura = ler.nextInt();
			
			System.out.println("Deseja continuar? (S/N): ");
			ler.skip("\\R?");
			opcao = ler.nextLine();
			
		}while(opcao.equalsIgnoreCase("S"));

	}

}
