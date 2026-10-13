package sistemaAcademico;

import java.util.ArrayList;

public class Disciplina {
	
	private String nome;
	private String sala;
	private ArrayList<Discente> discentes;
	private Docente docente;
	
	public Disciplina(String nome, String sala) {
		this.nome = nome;
		this.sala = sala;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}
	
	public void associarDiscente(Discente discente) {
		this.discentes.add(discente);
	}
	
	
	public void exibirNome() {
		System.out.println(this.getNome());
	}
	
	public void associarDocente(Docente docente) {
		this.docente=docente;

	}
	
	
			

}
