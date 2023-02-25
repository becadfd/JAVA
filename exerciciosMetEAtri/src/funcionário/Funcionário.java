package funcionário;

public class Funcionário {

	private String nome;
	private String tempo;
	private int funcao;
	private float salario;
	private float novoSalario;

	public Funcionário(String nome, String tempo, int funcao, float salario, float novoSalario) {
		this.nome = nome;
		this.tempo = tempo;
		this.funcao = funcao;
		this.salario = salario;
		this.novoSalario = novoSalario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public int getFuncao() {
		return funcao;
	}

	public void setFuncao(int funcao) {
		this.funcao = funcao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getNovoSalario() {
		return novoSalario;
	}

	public void setNovoSalario(float novoSalario) {
		this.novoSalario = novoSalario;
	}

	public void visualizar() {

		String funcao = "";

		switch (this.funcao) {
		case 1 -> funcao = "Vendedor";
		case 2 -> funcao = "Gerente";
		default -> System.out.println("\nFunção não encontrada!");
		}

		System.out.println("****************************************");
		System.out.println("                                        ");
		System.out.println("           Dados do Funcionário         ");
		System.out.println("                                        ");
		System.out.println("****************************************");
		System.out.println("                                        ");
		System.out.println("           1- Nome: " + this.nome);
		System.out.println("           2- Tempo de Empresa: " + this.tempo);
		System.out.println("           3- Função: " + funcao);
		System.out.println("           4- Salário: " + this.salario);
	}

}
