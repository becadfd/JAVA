package variaveisEConstantes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#####.##");

		float salario;
		float abono;
		float novoSalario;

		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();

		System.out.println("Digite abono: ");
		abono = leia.nextFloat();

		novoSalario = salario + abono;
		System.out.println("Novo Salário: " + df.format(novoSalario));

	}
}
