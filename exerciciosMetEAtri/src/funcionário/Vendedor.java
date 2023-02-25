package funcionário;

public class Vendedor extends Funcionário {

	private int vendas;

	public Vendedor(String nome, String tempo, int funcao, float salario, float novoSalario, int vendas) {
		super(nome, tempo, funcao, salario, novoSalario);
		this.vendas = vendas;
	}

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("           6- Vendas por mês: " + this.vendas);
	}
}
