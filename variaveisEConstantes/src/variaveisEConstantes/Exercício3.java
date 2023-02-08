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

<<<<<<< HEAD:variaveisEConstantes/src/variaveisEConstantes/Exercício3.java
		System.out.println("Salário Líquido: " +  df.format(salarioLiquido));
=======
		System.out.println("Salário Líquido: " + df.format(salarioLiquido));
>>>>>>> e9c34e8b8ac073b608e9611f54eea0eb0daffa55:Váriaveis/variaveisEConstantes/src/variaveisEConstantes/Exercício3.java

		leia.close();
	}
}

