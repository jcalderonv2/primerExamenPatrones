package primerExamen.objetos;

import java.util.ArrayList;

import primerExamen.gestor.Cl;

public class Jugador {

	private String nombre;
	private ArrayList<Cl> mano = new ArrayList<Cl>();

	public Jugador(String nombre, ArrayList<Cl> mano) {
		this.nombre = nombre;
		this.mano = mano;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Cl> getMano() {
		return mano;
	}

	public void setMano(ArrayList<Cl> mano) {
		this.mano = mano;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", mano=" + mano + "]";
	}
	
	

}
