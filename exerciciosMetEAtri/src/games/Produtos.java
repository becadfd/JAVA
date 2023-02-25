package games;

public abstract class Produtos {

	private int tipoP;
	private int forma;
	private String cliente;
	private int tipoM;
	private float preco;

	public Produtos(int tipoP, int forma, String cliente, int tipoM, float preco) {
		this.tipoP = tipoP;
		this.forma = forma;
		this.cliente = cliente;
		this.tipoM = tipoM;
		this.preco = preco;
	}

	public int getTipoP() {
		return tipoP;
	}

	public void setTipoP(int tipoP) {
		this.tipoP = tipoP;
	}

	public int getForma() {
		return forma;
	}

	public void setForma(int forma) {
		this.forma = forma;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getTipoM() {
		return tipoM;
	}

	public void setTipoM(int tipoM) {
		this.tipoM = tipoM;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {

		String tipoM = "";
		String tipoP = "";
		String forma = "";

		switch (this.tipoP) {
		case 1 -> tipoP = "Jogo";
		case 2 -> tipoP = "Console";
		default -> System.out.println("\nTipo de Produto não encontrado!");
		}

		switch (this.tipoM) {
		case 1 -> tipoM = "Físico";
		case 2 -> tipoM = "Digital";
		default -> System.out.println("\nTipo indefinido!");
		}

		switch (this.forma) {
		case 1 -> forma = "Débito";
		case 2 -> forma = "Crédito";
		case 3 -> forma = "Dinheiro";
		case 4 -> forma = "Pix";
		default -> System.out.println("\nForma de pagamento indisponível!");
		}

		System.out.println("****************************************************************");
		System.out.println("                                                                ");
		System.out.println("                          Dados do Jogo                         ");
		System.out.println("                                                                ");
		System.out.println("****************************************************************");
		System.out.println("                                                                ");
		System.out.println("                   1-Tipo de Produto: " + tipoP);
		System.out.println("                   2-Tipo de Mídia: " + tipoM);
		System.out.println("                   3-Nome Cliente: " + this.cliente);
		System.out.println("                   4-Preço: " + this.preco);
		System.out.println("                   5-Forma de Pagamento:" + forma);

	}

}
