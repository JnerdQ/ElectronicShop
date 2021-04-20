package Main;

import Data.Cola;
import Data.ListaEnlazada;
import Data.Pila;

public class Main {

	public static void main(String[] args) {

		// prueba listaEnlazadaSimple
		System.out.println("Prueba listaEnlazadaSimple");
		System.out.println();

		ListaEnlazada<Integer> listaEnlazada = new ListaEnlazada<Integer>();

		int[] enteros = { 1, 4, 6, 8, 4, 23, 4 };

		for (int i = 0; i < enteros.length; i++) {
			listaEnlazada.insertarFinal(enteros[i]);
		}
		// listaEnlazada.imprimirLista();

		int dato = listaEnlazada.obtenerDato(0);
		System.out.println("Dato en el indice 0: "+ dato);

		listaEnlazada.eliminarDato(1);
		System.out.println("Lista despues de eliminar el dato 1");
		listaEnlazada.imprimirLista();

		System.out.println("----------------------------");
		System.out.println("Prueba Pila");
		
		// prueba pilas
		Pila<Integer> pila = new Pila<Integer>(enteros.length);
		
		// push a los elementos del array
		for (int i = 0; i < enteros.length; i++) {
			pila.push(enteros[i]);
		}
		
		int peek = pila.peek();
		System.out.println("Top de la pila: "+ peek);
		
		// Imprimir pila 
		for (int i = 0; i < enteros.length; i++) {
			System.out.print(pila.pop()+" ");
		}
		
		System.out.println();
		System.out.println("---------------------");
		System.out.println("Prueba Cola");
		
		Cola<Integer> cola =  new Cola<Integer>();
		cola.encolar(3);
		cola.encolar(2);
		cola.encolar(1);
		
		cola.desencolar();
		
		cola.imprimirCola();
		


	}

}
