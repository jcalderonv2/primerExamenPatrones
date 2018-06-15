package primerExamen.objetos;

public class Carta {

	private Nombre nombre;
	private int valor;
	private Palo palo;

	public Carta() {

	}

	public Carta(Nombre nombre, Palo palo, int valor) {
		this.nombre = nombre;
		this.valor = valor;
		this.palo = palo;
	}

	public Nombre getNombre() {
		return nombre;
	}

	public void setNombre(Nombre nombre) {
		this.nombre = nombre;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	@Override
	public String toString() {
		return "Carta [nombre=" + nombre + ", valor=" + valor + ", palo=" + palo + "]";
	}

}
