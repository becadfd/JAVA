package lacos;

import java.util.Scanner;

public class If1 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int a, b, c, calculoAB;

		System.out.println("Digite o número a: ");
		a = leia.nextInt();

		System.out.println("Digite o número b: ");
		b = leia.nextInt();

		System.out.println("Número c: ");
		c = leia.nextInt();

		calculoAB = a + b;

		if (calculoAB > c) {
			System.out.println(a + " + " + " = " + calculoAB + ">" + c);
			System.out.println("A soma de a+b é maior do que c");
		} else if (calculoAB < c) {
			System.out.println(a + " + " + " = " + calculoAB + " < " + c);
			System.out.println("A soma de a+b é menor do que c");
		} else {
			System.out.println(a + " - " + " = " + calculoAB + " = " + c);
			System.out.println("A soma de a+b é igual do que c");
		}

		leia.close();
	}

}
