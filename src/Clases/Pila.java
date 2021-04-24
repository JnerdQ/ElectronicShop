package Clases;

import java.util.EmptyStackException;

import javax.management.RuntimeErrorException;

public class Pila<T> {
	private int top;
	private T[] arreglo;

	public Pila(int tamano) {
		this.top = -1;
		arreglo = (T[]) new Object[tamano];
	}

	public boolean vacia() {
		return (top == -1);
	}

	public boolean full() {
		return (top >= arreglo.length);
	}

	public T pop(){
		if (vacia()) {
			 throw new EmptyStackException();
		}
		return arreglo[top--];

	}

	public void push(T dato){
		if (full()) {
			 throw new StackOverflowError();
		} else {
			top++;
			arreglo[top] = dato;
		}

	}

	// retorna el top de la pila
	public T peek(){
		if (vacia()) {
			throw new EmptyStackException();
		}
		return arreglo[top];
	}

}
