package games;

public class Jogo extends Produtos {

	private int jogo;
	private int classificacaoI;

	public Jogo(int tipoP, int forma, String cliente, int tipoM, float preco, int jogo, int classificacaoI) {
		super(tipoP, forma, cliente, tipoM, preco);
		this.jogo = jogo;
		this.classificacaoI = classificacaoI;
	}

	public int getJogo() {
		return jogo;
	}

	public void setJogo(int jogo) {
		this.jogo = jogo;
	}

	public int getClassificacaoI() {
		return classificacaoI;
	}

	public void setClassificacaoI(int classificacaoI) {
		this.classificacaoI = classificacaoI;
	}

	public void visualizar() {
		super.visualizar();

		String jogo = "";
		String classificacaoI = "";

		switch (this.jogo) {
		case 1 -> jogo = "Final Fantasy";
		case 2 -> jogo = "Infinity Nikki";
		case 3 -> jogo = "Animal Crossing";
		case 4 -> jogo = "Batman: Arkham City";
		default -> System.out.println("\nJogo indisponível!");
		}

		switch (this.classificacaoI) {
		case 1 -> classificacaoI = "Livre";
		case 2 -> classificacaoI = "+16";
		case 3 -> classificacaoI = "+18";
		default -> System.out.println("\nClassificação indicativa não encontrada!");
		}

		System.out.println("                   6-Código do jogo: " + jogo);
		System.out.println("                   7-Classificação Indicativa: " + classificacaoI);
	}
}
