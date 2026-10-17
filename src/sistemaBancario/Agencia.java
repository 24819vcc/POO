package sistemaBancario;

import java.security.PrivateKey;
import java.util.ArrayList;




public class Agencia {
	private ArrayList<Conta >conta;
	private ArrayList<Empregado>empregado;
	private ArrayList<Cliente> cliente;
	
	private int codigo;
	private String nome;
	
	public void listarClientes() {
		for(int i = 0; i<this.cliente.size();i++) {
			System.out.println(this.cliente.get(i));
		}
	}

	
}
