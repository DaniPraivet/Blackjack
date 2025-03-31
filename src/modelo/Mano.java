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
	 * Debes obtener el valor de toda la mano
	 * del jugador, para ello, se recorre la
	 * lista con un FOR para obtener el valor
	 * de cada carte y finalmente retornar el
	 * valor total.
	 * @return valor total de la baraja.
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
	 * Si el valor de la mano del jugador es
	 * superior o igual a 21, el juego termina
	 * si no, el juego aún no ha acabado.
	 * @return valor verdadero o falso de si
	 * es el fin del juego para el jugador o no
	 */
	public boolean finDeJuego() {
		if (this.valorMano()>=21) {
			return true;
		}
		return false;
	}

	/**
	 * Mostrar toda la información de la carta
	 * @return Devuelve en formato texto de como queremos
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
