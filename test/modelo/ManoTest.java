package modelo;

import excepciones.NoHayMasCartasException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManoTest {

    private Mano mano;
    private Mazo mazo;

    @BeforeEach
    void setUp() {
        mano = new Mano();
        mazo = new Mazo();
    }

    @Test
    void testValorMano() {
        assertEquals(0, mano.valorMano());

        mano.cartas.add(new Carta(10, Carta.Palo.CORAZONES));
        assertEquals(10, mano.valorMano());

        mano.cartas.add(new Carta(1, Carta.Palo.PICAS));
        assertEquals(21, mano.valorMano());
    }

    @Test
    void testFinDeJuego() {
        assertFalse(mano.finDeJuego());

        mano.cartas.add(new Carta(10, Carta.Palo.CORAZONES));
        mano.cartas.add(new Carta(11, Carta.Palo.PICAS));
        assertTrue(mano.finDeJuego());
    }

    @Test
    void testPedirCarta() throws NoHayMasCartasException {
        int tamanyoAntes = mano.cartas.size();

        mano.pedirCarta(mazo);
        assertEquals(tamanyoAntes + 1, mano.cartas.size());
    }
}