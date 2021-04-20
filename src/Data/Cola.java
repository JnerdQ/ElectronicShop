package Data;

public class Cola<T> {
	private Nodo<T> cabezaCola;
	private Nodo<T> finalCola;

	public Cola(Nodo<T> cabeza, Nodo<T> cola) {
		this.cabezaCola = cabeza;
		this.finalCola = cola;
	}

	public Cola() {
	}

	public void encolar(T dato) {
		Nodo nodoEncolador = new Nodo<T>(dato);

		if (finalCola == null) {
			cabezaCola = finalCola = nodoEncolador;
			return;
		}

		finalCola.setSiguienteNodo(nodoEncolador);
		finalCola = nodoEncolador;

	}

	public void desencolar() {

		if (cabezaCola == null) {
			return;
		}

		Nodo nodoDesencolador = cabezaCola;
		cabezaCola = cabezaCola.getSiguienteNodo();

		if (cabezaCola == null) {
			finalCola = null;
		}
	}

	public void imprimirCola() {
		Nodo<T> nodoImpresor = cabezaCola;

		while (nodoImpresor != null) {
			System.out.print(nodoImpresor.getDato() + " ");
			nodoImpresor = nodoImpresor.getSiguienteNodo();
		}
		System.out.println();
	}

	public Nodo<T> getCabezaCola() {
		return cabezaCola;
	}

	public void setCabezaCola(Nodo<T> cabezaCola) {
		this.cabezaCola = cabezaCola;
	}

	public Nodo<T> getFinalCola() {
		return finalCola;
	}

	public void setFinalCola(Nodo<T> finalCola) {
		this.finalCola = finalCola;
	}

}
