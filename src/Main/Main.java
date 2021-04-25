package Main;

import Clases.Cola;
import Clases.Lector;
import Clases.ListaEnlazada;
import Clases.Pila;
import Clases.Producto;
import Clases.Producto;

public class Main {

	public static void main(String[] args) {

		Producto[] arrayPrueba = new Producto[1000];
		Producto[] arrayPrueba2 = new Producto[1000];
		Lector lector = new Lector();
		arrayPrueba2 = lector.AgregarProductosArreglo("Datos.txt", arrayPrueba);

		for (int i = 0; i < arrayPrueba2.length; i++) {
			System.out.println(arrayPrueba2[i]);
		}
		
		
		
		
		

	}
}