package cliente;

public class Cliente {

	private String nome;
	private int idade;
	private String genero;
	private float telefone;
	private int assinatura;

	public Cliente(String nome, int idade, String genero, float telefone, int assinatura) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.telefone = telefone;
		this.assinatura = assinatura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public float getTelefone() {
		return telefone;
	}

	public void setTelefone(float telefone) {
		this.telefone = telefone;
	}

	public int getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(int assinatura) {
		this.assinatura = assinatura;
	}

	public void visualizar() {

		String genero;
		String assinatura;

		System.out.println("**************************************");
		System.out.println("                                      ");
		System.out.println("           Dados do Cliente           ");
		System.out.println("                                      ");
		System.out.println("**************************************");
		System.out.println("1- Nome: " + this.nome);
		System.out.println("2- Idade: " + this.idade);
		System.out.println("3- Gênero: " + this.genero);
		System.out.println("4- Telefone: " + this.telefone);
		System.out.println("5- Assinatura: " + this.assinatura);
	}

}
