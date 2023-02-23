package curso;

public class Especialização extends Curso {

	private String cursoE;

	public Especialização(String aluno, int tipoC, int idade, String periodo, long idAluno, String cursoE) {
		super(aluno, tipoC, idade, periodo, idAluno);
		this.cursoE = cursoE;
	}

	public String getCursoE() {
		return cursoE;
	}

	public void setCursoE(String cursoE) {
		this.cursoE = cursoE;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("                   6- Especialização: " + this.cursoE);
	}

}
