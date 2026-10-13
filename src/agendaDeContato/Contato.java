package agendaDeContato;

public class Contato {
	private String nome;
	private String telefone;
	private String email;
	
	public Contato(String nome,String telefone,String email) {
		this.nome=nome;
		this.telefone=telefone;
		this.email=email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void exibirNome() {
		System.out.println(this.getNome());
	}
	
	public void exibirDados() {
		String msg= String.format("Nome: %s\nE-mail: %s\nTelefone: %s",this.nome,this.email,this.telefone);
		System.out.println(msg);
	
	}
	
	
}
