package primerExamen.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import primerExamen.gestor.Cl;
import primerExamen.objetos.*;

public class primerExamenPruebas {

	Cl valor = new Cl();

	@Test
	public void testValores() throws Exception {

		assertEquals(3, valor.crearCarta(Nombre.As, Palo.Escudos, 3).getValor());

	}

}
