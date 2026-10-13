package baralho;

import java.util.ArrayList;

public class Monte {
	private ArrayList<Carta> cartas;

	public Monte(ArrayList<Carta> cartas) {
//		this.cartas= new ArrayList<Carta>();
		this.cartas= cartas;		
	}

	public ArrayList<Carta> getCarta() {
		return cartas;
	}

	public void setCarta(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	
	
}
