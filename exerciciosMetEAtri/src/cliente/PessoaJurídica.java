package cliente;

public class PessoaJurídica extends Cliente {
	
	private long cnpj;

	public PessoaJurídica(String nome, int idade, int genero, long telefone, int tipoP, long cnpj) {
		super(nome, idade, genero, telefone, tipoP);
		this.cnpj = cnpj;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("6-CNPJ: " + this.cnpj);
	}

}
