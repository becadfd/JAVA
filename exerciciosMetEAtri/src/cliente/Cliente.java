package cliente;

public class Cliente {

	private String nome;
	private int idade;
	private int genero;
	private long telefone;
	private int tipoP;

	public Cliente(String nome, int idade, int genero, long telefone, int tipoP) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.telefone = telefone;
		this.tipoP = tipoP;
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

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public int getTipoP() {
		return tipoP;
	}

	public void setTipoP(int tipoP) {
		this.tipoP = tipoP;
	}

	public void visualizar() {

		String genero = "";
		String tipoP = "";

		switch(this.genero) {
		case 1 -> genero = "Feminino";
		case 2 -> genero = "Masculino";
		case 3 -> genero = "Neutro";
		default -> System.out.println("\nGênero não encontrado!");
		}
		
		switch(this.tipoP) {
		case 1 -> tipoP = "Pessoa Física";
		case 2 -> tipoP = "Pessoa Jurídica";
		default -> System.out.println("\nOpção Inválida!");
		}

		System.out.println("**************************************");
		System.out.println("                                      ");
		System.out.println("           Dados do Cliente           ");
		System.out.println("                                      ");
		System.out.println("**************************************");
		System.out.println("1- Nome: " + this.nome);
		System.out.println("2- Idade: " + this.idade);
		System.out.println("3- Gênero: " + genero);
		System.out.println("4- Telefone: " + this.telefone);
		System.out.println("5- Tipo de Pessoa: " + tipoP);
	}

}
