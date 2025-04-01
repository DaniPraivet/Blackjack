package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.Carta.Palo;
import excepciones.NoHayMasCartasException;

public class Mazo {

	protected List<Carta> cartas;

	/**
	 * Constructor del Mazo.
	 */
	public Mazo() {
		this.cartas = new ArrayList<Carta>();	
		for(Palo palo: Palo.values()) {
			for (int i = 1; i <= 13; i++) {
				Carta carta = new Carta(i,palo);
				this.cartas.add(carta);
			}
		}
	}

	/**
	 * Baraja el mazo de cartas
	 */
	public void barajar() {
		Collections.shuffle(cartas);
	}


	@Override
	public String toString() {
		String res="";
		for (Carta carta : cartas) {
			res=res+carta.toString()+ "\n";
		}
		return res;
	}

	/**
	 * Le otorga una carta a la mano del jugador.
	 * @return Devuelve una carta.
	 * @throws NoHayMasCartasException Excepción avisando que no hay más cartas en el mazo.
	 */
	public Carta solicitarCarta() throws NoHayMasCartasException {
		if (this.cartas.isEmpty()) {
			throw new NoHayMasCartasException();
		}
		Carta carta = this.cartas.getFirst();
		this.cartas.removeFirst();
		return carta;
	}
	
	
}
