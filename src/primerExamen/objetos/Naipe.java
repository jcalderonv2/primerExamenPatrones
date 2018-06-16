package primerExamen.objetos;

import java.util.ArrayList;

import primerExamen.gestor.Cl;

public class Naipe {

	public ArrayList<Cl> crearDeck() throws Exception {
		ArrayList<Cl> naipe = new ArrayList<Cl>();

		Cl newCard = new Cl();

		Nombre nombres[] = Nombre.values();
		Palo palos[] = Palo.values();

		Nombre nombreTemporal;
		Palo paloTemporal;

		for (int i = 0; i < palos.length; i++) {
			for (int j = 0; j < nombres.length; j++) {

				nombreTemporal = nombres[j];
				paloTemporal = palos[i];

				newCard.nuevaCarta(nombreTemporal, paloTemporal);
				naipe.add(newCard);

			}
		}
		return naipe;
	}

}


