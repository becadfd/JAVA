package farmacia;

public class Farmacia {

	private String tipo;
	private String produto;
	private float valor;
	private float quantidade;
	private float valorTotal;

	public Farmacia(String tipo, String produto, float valor, float quantidade, float valorTotal) {
		super();
		this.tipo = tipo;
		this.produto = produto;
		this.valor = valor;
		this.quantidade = quantidade;
		this.valorTotal = valorTotal;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
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

		System.out.println("****************************************************************");
		System.out.println("                                                                ");
		System.out.println("                   🛍️ Dados da Sua Compra 🛍️                    ");
		System.out.println("                                                                ");
		System.out.println("****************************************************************");
		System.out.println("                                                                ");
		System.out.println("                   1- Produto: " + this.produto);
		System.out.println("                   2- Tipo: " + this.tipo);
		System.out.println("                   3- Valor unitário: " + valor);
		System.out.println("                   4- Quantidade: " + this.quantidade);
		System.out.println("                   5- Valor Total: " + this.valorTotal);


	}
}
