package lacos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Switch4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#####.##");

		int operacao;
		float saldo, saque, deposito;

		System.out.println(" Código de Operação: ");
		System.out.println("1-\tSaldo\n" + "2-\tSaque\n" + "3-\tDepósito");

		System.out.println("Digite a operação desejada: ");
		operacao = ler.nextInt();

		saldo = 1000.00f;

		switch (operacao) {
		case 1:
			saldo = 1000.00f;
			System.out.println("Saldo: R$ " + df.format(saldo));
			saldo = ler.nextFloat();
			break;
		case 2:
			saldo = 1000.00f;
			System.out.println("Valor do Saque: ");
			saque = ler.nextFloat();
			if (saque > saldo) {
				System.out.println("Saldo insuficiente!");
			} else {
				System.out.println("Novo Saldo: " + df.format(saldo - saque));
			}

			break;
		case 3:
			saldo = 1000.00f;
			System.out.println("Valor do Depósito: ");
			deposito = ler.nextFloat();
			System.out.println("Novo Saldo: " + df.format(deposito + saldo));
			break;

		}

		ler.close();

	}

}
