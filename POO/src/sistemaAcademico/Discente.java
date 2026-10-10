package sistemaAcademico;

public class Discente {
	private String nome;
	private String matricula;
	private Disciplina disciplina;
	
	public Discente(String nome, String matricula) {
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
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina=disciplina;
	}
	
	public void exibirNome() {
		System.out.println(this.getNome());
	}
	
	public void matricularDisciplina(Disciplina disciplina) {
		this.disciplina= disciplina;
		disciplina.associarDiscente(this);
				
	}

}
