package modelo;

import excepciones.NoHayMasCartasException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MazoTest {

    private Mazo mazo;

    @BeforeEach
    void setUp() {
        mazo = new Mazo();
    }

    @Test
    void testMazoInicializadoCorrectamente() {
        assertEquals(52, mazo.cartas.size());
    }

    @Test
    void testBarajar() {
        String antes = mazo.toString();
        mazo.barajar();
        String despues = mazo.toString();
        assertNotEquals(antes, despues);
    }

    @Test
    void testSolicitarCarta() throws NoHayMasCartasException {
        int tamanyoAntes = mazo.cartas.size();
        Carta carta = mazo.solicitarCarta();
        assertNotNull(carta);
        assertEquals(tamanyoAntes - 1, mazo.cartas.size());
    }

    @Test
    void testSolicitarCartaSinCartas() {
        mazo.cartas.clear();
        assertThrows(NoHayMasCartasException.class, () -> mazo.solicitarCarta());
    }
}