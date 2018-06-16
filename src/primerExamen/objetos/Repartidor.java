package primerExamen.objetos;

import java.util.ArrayList;
import java.util.Collections;

import primerExamen.gestor.Cl;

public class Repartidor {

	private boolean isShuffled;
	Naipe naipe = new Naipe();
	
	public ArrayList<Cl> barajaNaipes() throws Exception {

		ArrayList<Cl> deck = naipe.crearDeck();
		isShuffled = false;
		return deck;
	}

	public void shuffleDeck() throws Exception {
		ArrayList<Cl> deck = naipe.crearDeck();
		Collections.shuffle(deck);
		isShuffled = true;
	}

	public boolean isShuffled() throws Exception {
		return isShuffled;
	}
}
