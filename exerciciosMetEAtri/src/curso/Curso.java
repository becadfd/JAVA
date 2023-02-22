package curso;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
		String turma = "";
		String materia = "";
		String professore = "";

		switch (this.curso) {
		case 1 -> curso = "Design Gráfico";
		case 2 -> curso = "Desenvolvimento de Games";
		case 3 -> curso = "Desenvolvimento Mobile";
		case 4 -> curso = "Desenho Digital";

		}

		switch (this.turma) {
		case 1 -> turma = "1";
		case 2 -> turma = "2";
		default -> System.out.println("Turma não encontrada");
		}

		if (this.periodo > 4)
			System.out.println("Período não encontrado");
		else
			System.out.println(periodos.indexOf(periodo));

		switch (this.materia) {
		case 1 -> materia = "Geometria";
		case 2 -> materia = "Criação de Layout";
		case 3 -> materia = "Game Design";
		case 4 -> materia = "Animação e Modelagem 3D";
		case 5 -> materia = "Desenvolvimento De Aplicações Ios";
		case 6 -> materia = "Desenvolvimento De Aplicações Android";
		case 7 -> materia = "Representação Digital";
		case 8 -> materia = "Semiótica";
		default -> System.out.println("Matéria não encontrada!");
		}

		switch (this.professore) {
		case 1 -> professore = "Rogério";
		case 2 -> professore = "Manuela";
		case 3 -> professore = "Kim";
		case 4 -> professore = "Pedro";
		case 5 -> professore = "Marcelo";
		case 6 -> professore = "Paula";
		case 7 -> professore = "Camila";
		case 8 -> professore = "Amanda";
		default -> professore = "Professore não encontrado!";
		}

		System.out.println("Bem-vinde a nossa plataforma de cursos digitais!");
		System.out.println("                                                ");
		System.out.println("************************************************");
		System.out.println("                                                ");
		System.out.println("1- Alune: " + this.aluno);
		System.out.println("2 - Curso: " + curso);
		System.out.println("3- Turma: " + turma);
		System.out.println("4- Período: " + this.periodo);
		System.out.println("4- Matéria: " + materia);
		System.out.println("Professore: " + professore);

	}
}