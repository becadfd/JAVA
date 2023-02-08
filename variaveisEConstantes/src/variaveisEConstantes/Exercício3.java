package variaveisEConstantes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício3 {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("####.##");
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o Salário Bruto: ");
		salarioBruto = leia.nextFloat();

		System.out.println("Digite o Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();

		System.out.println("Digite as Horas Extras: ");
		horasExtras = leia.nextFloat();

		System.out.println("Digite os Descontos: ");
		descontos = leia.nextFloat();

		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

		System.out.println("Salário Líquido: " +  df.format(salarioLiquido));

		leia.close();
	}
}
