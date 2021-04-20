package Data;

public class Pila<T> {
	private int top;
	private T[] arreglo;

	public Pila(int tamano) {
		this.top = 0;
		arreglo = (T[]) new Object[tamano];
	}

	public boolean vacia() {
		return top <= 0;
	}

	public boolean full() {
		return top >= arreglo.length;
	}

	public T pop() {
		if (vacia()) {
			throw new RuntimeException("Pila esta vacia");
		}
		top--;
		return arreglo[top];

	}

	public void push(T dato) {
		if (full()) {
			throw new RuntimeException("La pila esta llena");
		}
		arreglo[top] = dato;
		top++;

	}

	// retorna el top de la pila
	public T peek() {
		if (vacia()) {
			throw new RuntimeException("Pila esta vacia");
		}
		return arreglo[top-1];
	}

}
