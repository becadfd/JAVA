package funcionário;

public class Gerente extends Funcionário {

	public String equipe;

	public Gerente(String nome, String tempo, int funcao, float salario, float novoSalario, String equipe) {
		super(nome, tempo, funcao, salario, novoSalario);
		this.equipe = equipe;
	}

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("           6- Equipe que lidera: " + this.equipe);

	}

}
