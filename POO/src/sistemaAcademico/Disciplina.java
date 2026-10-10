package sistemaAcademico;

public class Disciplina {
	
	private String nome;
	private String sala;
	private Discente discente;
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
		this.discente=discente;
		discente.setDisciplina(this);
	}
	
	
	public void exibirNome() {
		System.out.println(this.getNome());
	}
	
	public void associarDocente(Docente docente) {
		this.docente=docente;
		docente.setDisciplina(this);
	}
	
	
			

}
