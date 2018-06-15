package primerExamen.gestor;

import primerExamen.objetos.Carta;
import primerExamen.objetos.Nombre;
import primerExamen.objetos.Palo;

public class Cl {

	Carta carta;

	public Cl(Nombre nombre, Palo palo, int valor) {
	}

	public Cl() {
	}

	public int asignarValorCarta(Nombre carta) {

		int valor = 0;

		switch (carta) {

		case As:

			valor = 1;

			break;

		case Dos:

			valor = 2;

			break;

		case Tres:

			valor = 2;

			break;

		case Cuatro:

			valor = 4;

			break;

		case Cinco:

			valor = 5;

			break;

		case Seis:

			valor = 6;

			break;

		case Siete:

			valor = 7;

			break;

		case Ocho:

			valor = 8;

			break;

		case Nueve:

			valor = 9;

			break;

		case Diez:

			valor = 10;

			break;

		case Jota:

			valor = 10;

			break;

		case Quina:

			valor = 10;

			break;

		case Ka:

			valor = 10;

			break;

		}
		return valor;
	}

	public Carta nuevaCarta(Nombre nombre, Palo palo) throws Exception {
		

		int valor = asignarValorCarta(nombre);

		return crearCarta(nombre, palo, valor);

	}

	public Carta crearCarta(Nombre nombre, Palo palo, int valor) throws Exception {

		if (valor > 0 && valor <= 10) {

			Carta crearCarta = new Carta(nombre, palo, valor);

			return crearCarta;

		}

		return carta;

	}

}
