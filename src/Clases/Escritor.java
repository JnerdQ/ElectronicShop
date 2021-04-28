
package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Escritor {

	public Escritor() {

	}

	public void escritorTxT(Producto[] productos) {
		FileWriter flwriter = null;

		try {
			File file = new File("C:\\Users\\usuario\\eclipse-workspace\\ElectronicShop");

			file.createNewFile();

			// crea el flujo para escribir en el archivo
			flwriter = new FileWriter("Datos.txt");
			// crea un buffer o flujo intermedio antes de escribir directamente en el
			// archivo
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			for (Producto producto : productos) {
				// escribe los datos en el archivo
				bfwriter.write(producto.getId() + ";" + producto.getNombre() + ";" + producto.getPrecio() + ";"
						+ producto.getCategoria() + ";" + producto.getMarca() + ";" + producto.getOpinion() + "\n");
			}
			// cierra el buffer intermedio
			bfwriter.close();
			System.out.println("Archivo creado satisfactoriamente..");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {// cierra el flujo principalSS
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void eliminadorTxT(String nombreTxT) {
		File fichero = new File(nombreTxT);
		if (fichero.delete())
			System.out.println("El fichero ha sido borrado satisfactoriamente");
		else
			System.out.println("El fichero no puede ser borrado");
	}
}
