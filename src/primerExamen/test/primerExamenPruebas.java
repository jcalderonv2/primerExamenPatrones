package primerExamen.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import primerExamen.gestor.Cl;
import primerExamen.objetos.*;

public class primerExamenPruebas {

	Cl valor = new Cl();

	@Test
	public void testValores() throws Exception {

		assertEquals(1, valor.crearCarta(Nombre.As, Palo.Escudos, 1).getValor());

	}

	@Test
	public void testCompararCartas() throws Exception {

		Carta crearCarta = new Carta(Nombre.As, Palo.Gotas, 1);

		assertEquals(crearCarta.getValor(), valor.crearCarta(Nombre.As, Palo.Escudos, 1).getValor());
		assertEquals(crearCarta.getNombre(), valor.crearCarta(Nombre.As, Palo.Flores, 1).getNombre());

	}

}
