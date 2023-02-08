package variaveisEConstantes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Variaveis {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###.##");
		Scanner leia = new Scanner(System.in);
		
		int numero;
		String nome; 
		double area; 
		
		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();
		
		System.out.println("Digite um nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Digite um número real: ");
		area = leia.nextDouble();
		
		System.out.println("O nome da participante é: " + nome);
		System.out.println("O número é: " + numero);
		System.out.printf("A area é: " + area);
		System.out.println("A area é: %2f\n" + df.format(area));
	}

}
