package baralho;

public class Carta {
	
	private String valor;
	private boolean viradaParaCima;
	
	public Carta(String valor, boolean viradaParaCima) {
		this.valor = valor;
		this.viradaParaCima = viradaParaCima;
	}
	
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public boolean isViradaParaCima() {
		return viradaParaCima;
	}

	public void setViradaParaCima(boolean viradaParaCima) {
		this.viradaParaCima = viradaParaCima;
	}

	public void exibirCarta() {
		if(!this.viradaParaCima) {
			this.viradaParaCima=true;
		}
	}

	public void esconderCarta() {
		if(this.viradaParaCima) {
			this.viradaParaCima=false;
		}
	}
}
