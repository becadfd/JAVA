package variaveisEConstantes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício4 {
	public static void main(String[] args) {

<<<<<<< HEAD:variaveisEConstantes/src/variaveisEConstantes/Exercício4.java
		DecimalFormat df = new DecimalFormat("###");

=======
>>>>>>> e9c34e8b8ac073b608e9611f54eea0eb0daffa55:Váriaveis/variaveisEConstantes/src/variaveisEConstantes/Exercício4.java
		float n1, n2, n3, n4, diferença;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextFloat();

		System.out.println("Digite o segundo número: ");
		n2 = leia.nextFloat();

		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextFloat();

		System.out.println("Digite o quarto número: ");
		n4 = leia.nextFloat();

		diferença = (n1 * n2) - (n3 * n4);

		System.out.println("Diferença: " + df.format(diferença));
		
		leia.close();
	}

}