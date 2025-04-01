package modelo;

import java.util.ArrayList;

import excepciones.NoHayMasCartasException;

/**
 * @author rodriguez.pedan
 * @version 1
 */
public class Mano extends Mazo {

	/**
	 * Constructor de la clase Mano
	 */
	public Mano() {
		this.cartas = new ArrayList<Carta>();
	}

	/**
	 * Calcula el valor total de la Mano
	 * @return Devuelve el valor total de la Mano.
	 */
	public int valorMano() {
		int valor=0;
		for (Carta carta : this.cartas) {
			valor=valor+carta.getValor();
		}
		return valor;
	}

	/**
	 * Determina si es el fin del juego.
	 * @return valor verdadero o falso de si
	 * es el fin del juego para el jugador o no.
	 */
	public boolean finDeJuego() {
		if (this.valorMano()>=21) {
			return true;
		}
		return false;
	}

	/**
	 * Mostrar toda la información de la carta
	 * @return Devuelve en formato texto del conjunto de cartas y el valor de la mano.
	 */
	@Override
	public String toString() {
		String res="Valor de la Mano: "+this.valorMano()+"\n";
		res=res+super.toString();
		return res;
	}
	
	public void pedirCarta(Mazo m) throws NoHayMasCartasException {
		Carta c = m.solicitarCarta();
		this.cartas.add(c);
	}
	
	
	
}
