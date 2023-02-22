package curso;

import java.util.ArrayList;

public class Curso {

	private String aluno;
	private int curso;
	private int turma;
	private int periodo;
	private int materia;
	private int professore;

	public Curso(String aluno, int curso, int turma, int periodo, int materia, int professore) {
		super();
		this.aluno = aluno;
		this.curso = curso;
		this.turma = turma;
		this.periodo = periodo;
		this.materia = materia;
		this.professore = professore;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getTurma() {
		return turma;
	}

	public void setTurma(int turma) {
		this.turma = turma;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public int getMateria() {
		return materia;
	}

	public void setMateria(int materia) {
		this.materia = materia;
	}

	public int getProfessore() {
		return professore;
	}

	public void setProfessore(int professore) {
		this.professore = professore;
	}

	public void visualizar() {

		ArrayList<Integer> periodos = new ArrayList<Integer>();

		String curso = "";
		int periodo = 0;

		System.out.println("Bem-vinde a nossa plataforma de cursos digitais!");
		System.out.println("                                                ");
		System.out.println("************************************************");
		System.out.println("                                                ");
        System.out.println("1- Alune: ");
        System.out.println("2 - Curso: ");
        System.out.println("3- Turma: ");
        System.out.println("4- Período: ");
        System.out.println("4- Matéria: ");
        System.out.println("Professore: ");
		
		
		switch (this.curso) {
		case 1 -> curso = "Design Gráfico";
		case 2 -> curso = "Desenvolvimento de Games";
		case 3 -> curso = "Desenvolvimento Mobile";
		case 4 -> curso = "Desenho Digital";
		default -> System.out.println("Curso inexistente!");
		}

		switch (this.turma) {
		case 1 -> System.out.println("Turma 1");
		case 2 -> System.out.println("Turma 2");
		default -> System.out.println("Turma não encontrada");
		}

		if (this.periodo > 4)
			System.out.println("Período não encontrado");
		else
			System.out.println(periodos.indexOf(periodo));

		switch (this.materia) {
		case 1 -> System.out.println("Geometria");
		case 2 -> System.out.println("Criação de Layout");
		case 3 -> System.out.println("Game Design");
		case 4 -> System.out.println("Animação e Modelagem 3D");
		case 5 -> System.out.println("Desenvolvimento De Aplicações Ios");
		case 6 -> System.out.println("Desenvolvimento De Aplicações Android");
		case 7 -> System.out.println("Representação Digital");
		case 8 -> System.out.println("Semiótica");
		default -> System.out.println("Matéria não encontrada!");
		}

		switch (this.professore) {
		case 1 -> System.out.println("Rogério");
		case 2 -> System.out.println("Manuela");
		case 3 -> System.out.println("Kim");
		case 4 -> System.out.println("Pedro");
		case 5 -> System.out.println("Marcelo");
		case 6 -> System.out.println("Paula");
		case 7 -> System.out.println("Camila");
		case 8 -> System.out.println("Amanda");
		default -> System.out.println("Professore não encontrado!");

		}
	}
}
