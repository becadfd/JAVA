package farmacia;

public class Farmacia {

	private int tipo;
	private int produto;
	private int valor;
	private float quantidade;
	private float valorTotal;

	public Farmacia(int tipo, int produto, int valor, float quantidade, float valorTotal) {
		super();
		this.tipo = tipo;
		this.produto = produto;
		this.valor = valor;
		this.quantidade = quantidade;
		this.valorTotal = valorTotal;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getProduto() {
		return produto;
	}

	public void setProduto(int produto) {
		this.produto = produto;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void visualizar() {

		String produto = "";
		String tipo = "";
		float valor = 0.0f;
		float valorTotal = 0.0f;
		float quantidade = 0.0f;

		switch (this.produto) {
		case 1 -> produto = "Paracetamol";
		case 2 -> produto = "Dipirona Monoidratada";
		case 3 -> produto = "Amoxilina";
		case 4 -> produto = "Azitromicina Di-Hidratada";
		case 5 -> produto = "Ibuprofeno";
		case 6 -> produto = "Ácido Mefenâmico";
		}

		switch (this.tipo) {
		case 1 -> tipo = "Analgésico";
		case 2 -> tipo = "Analgésico";
		case 3 -> tipo = "Antibiótico";
		case 4 -> tipo = "Antibiótico";
		case 5 -> tipo = "Anti-inflamatório";
		case 6 -> tipo = "Anti-inflamatório";

		}

		switch (this.valor) {
		case 1 -> valor = 2.99f;
		case 2 -> valor = 3.0f;
		case 3 -> valor = 7.0f;
		case 4 -> valor = 5.0f;
		case 5 -> valor = 3.9f;
		case 6 -> valor = 10.0f;
		}

		System.out.println("****************************************************************");
		System.out.println("                                                                ");
		System.out.println("                   🛍️ Dados da Sua Compra 🛍️                    ");
		System.out.println("                                                                ");
		System.out.println("****************************************************************");
		System.out.println("                                                                ");
		System.out.println("                   1- Produto: " + produto);
		System.out.println("                   2- Tipo: " + tipo);
		System.out.println("                   3- Valor unitário: " + valor);
		System.out.println("                   4- Quantidade: " + this.quantidade);
		System.out.println("                   5- Valor Total: " + this.valorTotal);

		// System.out.println("Lista de Medicamentos: ");
		// System.out.println("1- Paracetamol");
		// System.out.println("2- Dipirona Monoidratada");
		// System.out.println("3- Amoxilina");
		// System.out.println("4- Azitromicina Di-Hidratada");
		// System.out.println("5- Ibuprofeno");
		// System.out.println("6- Ácido Mefenâmico");

	}
}
