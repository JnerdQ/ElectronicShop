package Clases2;

import java.io.BufferedReader;
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.FileReader;
import java.util.Scanner;

public class Lector {
	public Lector() {
	}

	public Producto[] AgregarProductosArreglo(String nombreArchivo, Producto[] arregloProductos) {
		String nombreFichero = nombreArchivo;
		// Declarar una variable BufferedReader
		BufferedReader br = null;
		try {
			// Crear un objeto BufferedReader al que se le pasa
			// un objeto FileReader con el nombre del fichero
		      br = new BufferedReader(new FileReader(nombreFichero));
			// Leer la primera l�nea, guardando en un String
			String texto = br.readLine();
			// Repetir mientras no se llegue al final del fichero
			int indice = 0;
			while (texto != null) {

				String[] atributosProducto = texto.split(";");

				String nombre = atributosProducto[0];
				int precio = Integer.parseInt(atributosProducto[1]);
				String categoria = atributosProducto[2];
				String marca = atributosProducto[3];
				String opinion = atributosProducto[4];

				// Hacer lo que sea con la l�nea le�da
				arregloProductos[indice] = new Producto(precio, nombre, categoria, opinion, marca);
				indice++;

				// Leer la siguiente l�nea
				texto = br.readLine();
			}

		} catch (Exception e) {
			System.out.println("Error de lectura del fichero");
			System.out.println("****************************");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				System.out.println("Error al cerrar el fichero");
				System.out.println("****************************");
				System.out.println(e.getMessage());
			}
		}
		return arregloProductos;
	}

	public pila AgregarProductosPila(String nombreArchivo, int length) {

		pila arregloProductos = new pila(length);

		String nombreFichero = nombreArchivo;
		// Declarar una variable BufferedReader
		BufferedReader br = null;
		try {
			// Crear un objeto BufferedReader al que se le pasa
			// un objeto FileReader con el nombre del fichero
		      br = new BufferedReader(new FileReader(nombreFichero));
			// Leer la primera l�nea, guardando en un String
			String texto = br.readLine();
			// Repetir mientras no se llegue al final del fichero
			while (texto != null) {

				String[] atributosProducto = texto.split(";");

				String nombre = atributosProducto[0];
				int precio = Integer.parseInt(atributosProducto[1]);
				String categoria = atributosProducto[2];
				String marca = atributosProducto[3];
				String opinion = atributosProducto[4];

				// Hacer lo que sea con la l�nea le�da
				Producto auxP = new Producto(precio, nombre, categoria, opinion, marca);
				arregloProductos.push(auxP);

				// Leer la siguiente l�nea
				texto = br.readLine();
			}

		} catch (Exception e) {
			System.out.println("Error de lectura del fichero");
			System.out.println("****************************");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				System.out.println("Error al cerrar el fichero");
				System.out.println("****************************");
				System.out.println(e.getMessage());
			}
		}
		return arregloProductos;
	}

	public arregloCircular AgregarProductosColaArrCirc(String nombreArchivo, int length) {

		arregloCircular arregloProductos = new arregloCircular(length);

		String nombreFichero = nombreArchivo;
		// Declarar una variable BufferedReader
		BufferedReader br = null;
		try {
			// Crear un objeto BufferedReader al que se le pasa
			// un objeto FileReader con el nombre del fichero
		      br = new BufferedReader(new FileReader(nombreFichero));
			// Leer la primera l�nea, guardando en un String
			String texto = br.readLine();
			// Repetir mientras no se llegue al final del fichero
			while (texto != null) {

				String[] atributosProducto = texto.split(";");

				String nombre = atributosProducto[0];
				int precio = Integer.parseInt(atributosProducto[1]);
				String categoria = atributosProducto[2];
				String marca = atributosProducto[3];
				String opinion = atributosProducto[4];

				// Hacer lo que sea con la l�nea le�da
				Producto auxP = new Producto(precio, nombre, categoria, opinion, marca);
				arregloProductos.encolar(auxP);

				// Leer la siguiente l�nea
				texto = br.readLine();
			}

		} catch (Exception e) {
			System.out.println("Error de lectura del fichero");
			System.out.println("****************************");
			System.out.println(e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				System.out.println("Error al cerrar el fichero");
				System.out.println("****************************");
				System.out.println(e.getMessage());
			}
		}
		return arregloProductos;
	}


}


