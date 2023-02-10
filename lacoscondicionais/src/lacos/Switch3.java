package lacos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Switch3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("###.##");

		float num1, num2, num3;
		int operacao;

		System.out.println("Primeiro número: ");
		num1 = leia.nextFloat();

		System.out.println("Segundo número: ");
		num2 = leia.nextFloat();

		System.out.println("Operadores: ");
		System.out.println("1-\tSoma");
		System.out.println("2-\tSubtração");
		System.out.println("3-\tMultiplicação");
		System.out.println("4-\tDivisão");

		System.out.println("Código do operador: ");
		operacao = leia.nextInt();

		switch (operacao) {
		case 1:
			num3 = num1 + num2;
			System.out.println(df.format(num1) + " + " + df.format(num2) + " = " + df.format(num3));
			break;
		case 2:
			num3 = num1 - num2;
			System.out.println(df.format(num1) + " - " + df.format(num2) + " = " + df.format(num3));
			break;
		case 3:
			num3 = num1 * num2;
			System.out.println(df.format(num1) + " x " + df.format(num2) + " = " + df.format(num3));
			break;
		case 4:
			num3 = num1 / num2;
			System.out.println(df.format(num1) + " : " + df.format(num2) + " = " + df.format(num3));
			break;
		default:
			System.out.println("Código inválido!");
			break;

		}

		leia.close();
	}

}
