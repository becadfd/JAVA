package lacosderepeticao;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int idade = 0, fFront = 0, fMenor30 = 0, allBack = 0, mMaior40 = 0, sexo, categoria = 0;
		char resp = 's';

		while (resp == 's') {
			System.out.println("Digite a idade do(a/e) colaborador(a/e): ");
			idade = ler.nextInt();
			if (idade < 18) {
				System.out.println("Idade inválida!");
				break;
			}
			System.out.println("Sexo: ");
			System.out.println("1-\tFeminino\n" + "2-\tMasculino\n" + "3-\tOutros\n");

			System.out.println("Digite o sexo do(a/e) colaborador(a/e): ");
			sexo = ler.nextInt();

			System.out.println("Categoria: ");
			System.out.println("1-\tBackend\n" + "2-\tFrontend\n" + "3-\tMobile\n" + "4-\tFullstack\n");

			System.out.println("Digite a categoria do(a/e) colaborador(a/e): ");
			categoria = ler.nextInt();

			if (categoria == 1 && sexo == 1 || sexo == 2 || sexo == 3) {
				allBack++;
			} else if (sexo == 1 && categoria == 2) {
				fFront++;
			}

			else if (sexo == 2 && idade > 40) {
				mMaior40++;

			}

			else if (idade < 30 || idade > 18 && sexo == 1 && categoria == 4) {
				fMenor30++;
			} else if (idade < 0) {
				System.out.println("Idade inválida!");
			}
			System.out.println("Deseja adicionar mais algum(a/e) colaborador(a/e)? (S/N): ");
			resp = ler.next().charAt(0);
		}

		System.out.println("Número de pessoas desenvolvedoras Backend: " + allBack);
		System.out.println("Número de mulheres desenvolvedoras Frontend: " + fFront);
		System.out.println("Número de homens desenvolvedores mobile com mais de 40 anos: " + mMaior40);
		System.out.println("Número de mulheres desenvolvedoras Fullstack menores de 30 anos: " + fMenor30);

		ler.close();
	}
}