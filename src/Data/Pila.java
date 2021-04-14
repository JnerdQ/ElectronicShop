package Data;

public class Pila<T> {
	private int top;
	private T[] arreglo;


	public Pila(int tamano) {
		top = 0;
		arreglo = (T[]) new Object[tamano];
	}

	public boolean vacia() {
		return top <= 0;
	}

	private boolean full() {
		return top >= arreglo.length;
	}

	private T pop() {
		if (vacia()) {
			throw new RuntimeException("Pila esta vacia");
		}
		top--;
		return arreglo[top];
		
	}

	private void push(T dato) {
		if (full()) {
			throw new RuntimeException("La pila esta llena");
		}
		arreglo[top] = dato;
		top++;

	}
}
