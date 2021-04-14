package Data;

public class ListaEnlazada<T> {
	private Nodo<T> cabeza;

	public ListaEnlazada(Nodo<T> cabeza) {
		this.cabeza = cabeza;
	}

	public ListaEnlazada() {

	}

	// Insertar dato al inicio de la lista
	public void insertarInicio(T dato) {
		Nodo<T> nodo = new Nodo<T>(dato);
		nodo.setSiguienteNodo(cabeza);
		cabeza = nodo;
	}

	// Insertar dato al final de la lista
	public void insertarFinal(T dato) {
		Nodo<T> nodo = new Nodo<T>(dato);

		if (cabeza == null) {
			cabeza = nodo;
			return;
		}
		nodo.setSiguienteNodo(null);
		Nodo<T> ultimoNodo = cabeza;

		while (ultimoNodo.getSiguienteNodo() != null) {
			ultimoNodo = ultimoNodo.getSiguienteNodo();
		}

		ultimoNodo.setSiguienteNodo(nodo);
		return;
	}

	// Insertar un dato despues de un nodo
	public void insertarDespuesNodo(Nodo<T> nodoAnterior, T dato) {
		if (nodoAnterior == null) {
			System.out.println("No puede ser nulo el nodo anterior");
		}

		Nodo<T> nodo = new Nodo<T>(dato);
		nodo.setSiguienteNodo(nodoAnterior.getSiguienteNodo());
		nodoAnterior.setSiguienteNodo(nodo);

	}

	// Imprimir lista desde la cabeza hasta al final
	public void imprimirLista() {
		Nodo<T> nodoImpresor = cabeza;
		while (nodoImpresor != null) {
			System.out.print(nodoImpresor.getDato() + " ");
			nodoImpresor = nodoImpresor.getSiguienteNodo();
		}
		System.out.println();
	}

	// Elimina el dato que se encuentre en la lista
	public void eliminarDato(T dato) {
		Nodo<T> nodoEliminador = cabeza;
		Nodo<T> nodoAnterior = null;

		if (nodoEliminador != null && nodoEliminador.getDato() == dato) {
			cabeza = nodoEliminador.getSiguienteNodo();
			return;
		}

		while (nodoEliminador != null && nodoEliminador.getDato() != dato) {
			nodoAnterior = nodoEliminador;
			nodoEliminador = nodoEliminador.getSiguienteNodo();
		}

		if (nodoEliminador == null) {
			System.out.println("El dato no existe");
		}

		nodoAnterior.setSiguienteNodo(nodoEliminador.getSiguienteNodo());
	}

	// Eliminar el nodo por indice
	public void eliminarNodo(int indice) {
		if (cabeza == null) {
			return;
		}

		Nodo<T> nodoEliminador = cabeza;

		if (indice == 0) {
			cabeza = nodoEliminador.getSiguienteNodo();
			return;
		}

		int contadorIndice = 0;

		while (nodoEliminador != null && contadorIndice < indice - 1) {
			nodoEliminador = nodoEliminador.getSiguienteNodo();
			contadorIndice++;
		}

		if (nodoEliminador == null || nodoEliminador.getSiguienteNodo() == null) {
			return;
		}

		Nodo<T> nodo = nodoEliminador.getSiguienteNodo().getSiguienteNodo();
		nodoEliminador.setSiguienteNodo(nodo);

	}

	// Se obtiene del dato por indice
	public T obtenerDato(int indice) {
		Nodo<T> nodoImpresor = cabeza;
		int contadorNodo = 0;
		T dato = null;

		while (nodoImpresor != null) {
			if (contadorNodo == indice) {
				dato = nodoImpresor.getDato();
			}

			contadorNodo++;
			nodoImpresor = nodoImpresor.getSiguienteNodo();

		}
		return dato;
	}

	// Elimina toda la lista
	public void eliminarLista() {
		cabeza = null;
	}

	public Nodo<T> getCabeza() {
		return cabeza;
	}

	public void setCabeza(Nodo<T> cabeza) {
		this.cabeza = cabeza;
	}

}
