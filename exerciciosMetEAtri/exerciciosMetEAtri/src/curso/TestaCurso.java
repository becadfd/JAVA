package curso;

import java.util.Scanner;

import farmacia.Farmacia;

public class TestaCurso {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Curso c1 = new Curso("Rafaella Martinez", 2, 2, 3, 4, 3);
		c1.visualizar();

		Curso c2 = new Curso("Lindomar Cardoso", 4, 1, 1, 7, 2);
		c2.visualizar();

		//int opcao;

	}

}
