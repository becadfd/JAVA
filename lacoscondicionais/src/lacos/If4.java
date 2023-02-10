package lacos;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String animal1, animal2, animal3;

		System.out.println("Digite o primeiro atributo: ");
		leia.skip("\\R?");
		animal1 = leia.nextLine();

		System.out.println("Digite o segundo atributo: ");
		leia.skip("\\R?");
		animal2 = leia.nextLine();

		System.out.println("Digite o terceiro atributo: ");
		leia.skip("\\R?");
		animal3 = leia.nextLine();

		if (animal1.equals("vertebrado"))
			if (animal2.equals("ave")) {
				if (animal3.equals("carnívero"))
					System.out.println("águia");
				else
					System.out.println("pomba");
			} else {
				if (animal3.equals("onívoro"))
					System.out.println("homem");
				else
					System.out.println("vaca");
			}
		else {
			if (animal2.equals("inseto")) {
				if (animal3.equals("hematofago"))
					System.out.println("pulga");
				else
					System.out.println("lagarta");
			} else {
				if (animal3.equals("hematofago"))
					System.out.println("sanguessuga");
				else
					System.out.println("minhoca");
			}

		}

		leia.close();
	}

}
