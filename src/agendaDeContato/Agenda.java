package agendaDeContato;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contato> contatos;

	public Agenda(ArrayList<Contato> contatos) {
//		this.contatos= new ArrayList<Contato>();
		this.contatos=contatos;
	}

	public ArrayList<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(ArrayList<Contato> contatos) {
		this.contatos=contatos;
	}
	
	public void adicionarContato(Contato contato) {
		this.contatos.add(contato);
	}

}
