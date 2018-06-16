package primerExamen.objetos;

import java.util.ArrayList;
import java.util.Collections;

import primerExamen.gestor.Cl;

public class Mesa {

	private Repartidor repartidor = new Repartidor();
	private ArrayList<Jugador> jugador = new ArrayList<Jugador>();
	boolean noCampo = true;
	boolean iniciarJuego = true;

	public void sinCampo() throws Exception {

		int campoMesa = 4;

		if (campoMesa >= 4) {

			noCampo = true;

		}
	}

	public boolean mesaLlena() {

		return noCampo;

	}

	public void InicioJuego() throws Exception {

		int iniciar = 0;

		if (iniciar == 0) {

			iniciarJuego = true;

		}
	}

	public boolean inicio() {

		return iniciarJuego;

	}

}
