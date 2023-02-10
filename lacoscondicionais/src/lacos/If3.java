package lacos;

import java.util.Scanner;

public class If3 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome;
		int idade;
		char primDoacao;
		boolean verificacao = false;

		System.out.println("Nome do(a/e) paciente: ");
		leia.skip("\\R?");
		nome = leia.nextLine();

		System.out.println("Idade do paciente(a/e): ");
		idade = leia.nextInt();

		System.out.println("É sua primeira vez doando sangue? ");
		primDoacao = leia.next().charAt(0);

		if (primDoacao == 's' || primDoacao == 'S')
			verificacao = true;
		else if (primDoacao == 'n' || primDoacao == 'N')
			verificacao = false;
		else {
			System.out.println("Caractere Inválido!");
			System.exit(0); // interrompe o programa caso tenha inserido um caractere inválido
		}

		if (idade < 18 || idade > 69 || ((idade >= 60 || idade <= 69) && verificacao == true))
			System.out.println(nome + " está adpto(a/e) para a doação de sangue.");
		else
			System.out.println(nome + " não está apto(a/e) para a doação de sangue.");

		leia.close();
	}

}
