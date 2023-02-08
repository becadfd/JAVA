package variaveisEConstantes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício2 {
	public static void main(String[] args) {
<<<<<<< HEAD:variaveisEConstantes/src/variaveisEConstantes/Exercício2.java
=======
		
>>>>>>> e9c34e8b8ac073b608e9611f54eea0eb0daffa55:Váriaveis/variaveisEConstantes/src/variaveisEConstantes/Exercício2.java
		DecimalFormat df = new DecimalFormat("#.#");

		float nota1, nota2, nota3, nota4, mediaFinal;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite nota 1: ");
		nota1 = leia.nextFloat();

		System.out.println("Digite nota 2: ");
		nota2 = leia.nextFloat();

		System.out.println("Digite nota 3: ");
		nota3 = leia.nextFloat();

		System.out.println("Digite nota 4: ");
		nota4 = leia.nextFloat();

		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Média Final: " + df.format(mediaFinal));

	}
}
