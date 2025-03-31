package modelo;

/**
 * @author rodriguez.pedan
 * @version 1
 */
public class Carta {

	public enum Palo {
			TREBOl, DIAMANTE ,CORAZONES, PICAS
	}
	
	private int numero;
	private Palo palo;

	/**
	 * Constructor de la clase Carta
	 * @param numero El número de la carta, deben ser del 1 al 13
	 * @param palo Saber a qué palo está asignado esa carta, los valores
	 *             los puedes comprobar en el enum Palo.
     */
	public Carta(int numero, Palo palo) {
		if (numero>=1 && numero<=13) {
			this.numero = numero;
			this.palo = palo;
		}
	}

	public int getNumero() {
		return numero;
	}

	public Palo getPalo() {
		return palo;
	}

	/**
	 * El valor de la carta se define de la siguiente manera:
	 * Entre 2 y 10. El valor es igual al número
	 * Si es 1. El valor es igual a 11.
	 * Cualquier otro número. El valor es igual a 10
	 * @return Retorna el valor de la carta.
	 */
	public int getValor() {
		int valor;
		
		if (this.numero>=2 && this.numero<=10) {
			valor=this.numero;
		} else if (this.numero==1){
			valor=11;
		} else {
			valor=10;
		}

		return valor;
	}

	/**
	 * Devuelve el valor en formato texto de la carta.
	 * Si el numero es 1. Devuelve AS.
	 * Si el numero es 11. Devuelve J.
	 * Si el numero es 12. Devuelve Q.
	 * Si el numero es 13. Devuelve K.
	 * @return devuelve el texto.
	 */
	public String mostrarNumero() {
        if (this.numero == 1) {
            return "AS";
        } else if (this.numero == 11) {
            return "J";
        } else if (this.numero == 12) {
            return "Q";
        } else if (this.numero == 13) {
            return "K";
        }
        return "" + this.numero;
    }

	/**
	 * Mostrar toda la información de la carta
	 * @return Devuelve en formato texto de como queremos
	 * mostrar de la carta al usuario.
	 */
	@Override
	public String toString() {
		return "["+ mostrarNumero() + " - " + palo + "]";
	}

}
