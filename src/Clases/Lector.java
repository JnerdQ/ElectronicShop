package Clases;

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
		      br = new BufferedReader(new FileReader(nombreArchivo));
			// Leer la primera línea, guardando en un String
			String texto = br.readLine();
			// Repetir mientras no se llegue al final del fichero
			int indice = 0;
			while (texto != null) {

				String[] atributosProducto = texto.split(";");
				
				int id =  Integer.parseInt(atributosProducto[0]);
				String nombre = atributosProducto[1];
				int precio = Integer.parseInt(atributosProducto[2]);
				String categoria = atributosProducto[3];
				String marca = atributosProducto[4];
				String opinion = atributosProducto[5];

				// Hacer lo que sea con la línea leída

				arregloProductos[indice] = new Producto(id,precio, nombre, categoria, opinion, marca);
				indice++;

				// Leer la siguiente línea
				texto = br.readLine();
			}

		} catch (Exception e) {
			// System.out.println("Error de lectura del fichero");
			System.out.println("****************************");
			System.out.println(e.getMessage());
			System.out.println();
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
