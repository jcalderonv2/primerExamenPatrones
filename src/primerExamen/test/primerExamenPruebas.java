package primerExamen.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import primerExamen.gestor.Cl;
import primerExamen.objetos.*;

public class primerExamenPruebas {

	Cl valor = new Cl();

	@Test
	public void testValores() throws Exception {

		assertEquals(1, valor.nuevaCarta(Nombre.As, Palo.Escudos).getValor());

	}

	@Test
	public void testCompararCartas() throws Exception {

		Carta crearCarta = new Carta(Nombre.As, Palo.Gotas, 1);

		assertEquals(crearCarta.getValor(), valor.nuevaCarta(Nombre.As, Palo.Gotas).getValor());
		assertEquals(crearCarta.getNombre(), valor.nuevaCarta(Nombre.As, Palo.Flores).getNombre());

	}

	@Test
	public void testNaipes() throws Exception {

		int tamanno = 52;
		Naipe deck = new Naipe();

		assertEquals(tamanno, deck.crearDeck().size());
	}

	@Test
	public void testShuffleDeck() throws Exception {

		Repartidor deck = new Repartidor();

		assertFalse(deck.isShuffled());
		deck.shuffleDeck();
		assertTrue(deck.isShuffled());

	}

}
