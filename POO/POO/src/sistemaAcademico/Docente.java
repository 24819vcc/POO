package sistemaAcademico;

import java.util.ArrayList;

public class Docente {
	
	private String nome;
	private String matricula;
	private ArrayList<Disciplina> disciplinas;
	
	
	
	public Docente(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setDisciplina(ArrayList<Disciplina > disciplina) {
		this.disciplinas=disciplina;
	}

	public void exibirNome() {
		System.out.println(this.getNome());
	}
	
	public void associarDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
		disciplina.associarDocente(this);
	}

}
