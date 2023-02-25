package cliente;

public class PessoaFísica extends Cliente {

	private long cpf;

	public PessoaFísica(String nome, int idade, int genero, long telefone, int tipoP, long cpf) {
		super(nome, idade, genero, telefone, tipoP);
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("6- CPF: " + this.cpf);
	}

}
