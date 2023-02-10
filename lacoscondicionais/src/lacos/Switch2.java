package lacos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("###.##");

		float salario, salariol;
		String colaborador;
		int cargo;

		System.out.println("Código do cargo");
		System.out.println("1-\tGerente");
		System.out.println("2-\tVendedor");
		System.out.println("3-\tSupervisor");
		System.out.println("4-\tMotorista");
		System.out.println("5-\tEstoquista");
		System.out.println("6-\tTécnico de TI");

		System.out.println("Digite seu nome: ");
		leia.skip("\\R?");
		colaborador = leia.nextLine();

		System.out.println("Digite o código do cargo: ");
		leia.skip("\\R?");
		cargo = leia.nextInt();

		System.out.println("Digite o seu salário: ");
		leia.skip("\\R?");
		salario = leia.nextFloat();

		switch (cargo) {
		case 1:
			System.out.println("Nome do colaborador: " + colaborador);
			System.out.println("Cargo: Gerente");
			salariol = salario + (00.10f * salario);
			System.out.println("Salário Líquido: " + df.format(salariol));
			break;
		case 2:
			System.out.println("Nome do colaborador: " + colaborador);
			System.out.println("Cargo: Vendedor");
			salariol = salario + (00.07f * salario);
			System.out.println("Salário Líquido: " + df.format(salariol));
			break;
		case 3:
			System.out.println("Nome do colaborador: " + colaborador);
			System.out.println("Cargo: Supervisor");
			salariol = salario + (00.09f * salario);
			System.out.println("Salário Líquido: " + df.format(salariol));
			break;
		case 4:
			System.out.println("Nome do colaborador: " + colaborador);
			System.out.println("Cargo: Motorista");
			salariol = salario + (00.06f * salario);
			System.out.println("Salário Líquido: " + df.format(salariol));
			break;
		case 5:
			System.out.println("Nome do colaborador: " + colaborador);
			System.out.println("Cargo: Estoquista");
			salariol = salario + (00.05f * salario);
			System.out.println("Salário Líquido: " + df.format(salariol));
			break;
		case 6:
			System.out.println("Nome do colaborador: " + colaborador);
			System.out.println("Cargo: Técnico de TI ");
			salariol = salario + (00.08f * salario);
			System.out.println("Salário Líquido: " + df.format(salariol));
			break;

		}

		leia.close();
	}

}
