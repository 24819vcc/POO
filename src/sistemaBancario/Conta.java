package sistemaBancario;

import java.sql.Date;
import java.util.ArrayList;

public class Conta {
	private Agencia agencia;
	private Cliente cliente;
	private ArrayList<Historico >historico;
	private String codigo;
	private float saldo;
	private Date data;
	
	public boolean saque(float valor) {
		if(this.saldo-valor<0 || valor<0) {
			return false;
		}return true;
	}

	public boolean deposito(float valor) {
		if(valor<0) {
			return false;
		}return true;
	}
	
	public float saldo(Date data) {
		return this.saldo;
	}
	
	public void atualizar() {
		
	}
}
