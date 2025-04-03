package modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CartaTest {

    private Carta carta1, carta2, carta3, carta4;

    @BeforeEach
    void setUp() {
        carta1 = new Carta(1, Carta.Palo.CORAZONES);
        carta2 = new Carta(5, Carta.Palo.TREBOl);
        carta3 = new Carta(11, Carta.Palo.DIAMANTE);
        carta4 = new Carta(13, Carta.Palo.PICAS);
    }

    @Test
    void testGetNumero() {
        assertEquals(1, carta1.getNumero());
        assertEquals(5, carta2.getNumero());
    }

    @Test
    void testGetPalo() {
        assertEquals(Carta.Palo.CORAZONES, carta1.getPalo());
        assertEquals(Carta.Palo.TREBOl, carta2.getPalo());
    }

    @Test
    void testGetValor() {
        assertEquals(11, carta1.getValor());
        assertEquals(5, carta2.getValor());
        assertEquals(10, carta3.getValor());
        assertEquals(10, carta4.getValor());
    }

    @Test
    void testMostrarNumero() {
        assertEquals("AS", carta1.mostrarNumero());
        assertEquals("5", carta2.mostrarNumero());
        assertEquals("J", carta3.mostrarNumero());
        assertEquals("K", carta4.mostrarNumero());
    }
}