package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
	Scanner input;

	public Menu() {
	}

	public void desplegarMenuPrincipal() {
		input = new Scanner(System.in);

		System.out.println("******* Bienvenido a ElectronicShop ********");
		System.out.println("¿Como es tu nombre?");
		String nombreUsuario = input.nextLine();
		System.out.println("Hola " + nombreUsuario + " ¿Eres comprador o vendedor?");
		System.out.println("1. Comprador");
		System.out.println("2. Vendedor");
		int opcion = input.nextInt();
		Menu menu = new Menu();

		switch (opcion) {
		case 1:
			menu.nombreProducto();
			break;
		case 2:
			menu.menuVendedor();
			break;

		default:
			break;
		}
	}

	public void desplegarMenuFiltrado(int numero) {
		input = new Scanner(System.in);

		System.out.println("¿Deseas Filtrar por? ");
		System.out.println("1. Precio");
		System.out.println("2. Categoria");
		System.out.println("3. Marca");
		System.out.println("4. Opinion");
		int opcion = input.nextInt();

		Menu menu = new Menu();

		switch (opcion) {
		case 1:
			menu.desplegarPrecios(numero);
			break;
		case 2:
			menu.desplegarCategorias(numero);
			break;
		case 3:
			menu.desplegarMarcas(numero);
			break;
		case 4:
			menu.desplegarOpiniones(numero);
			break;

		default:
			break;
		}

	}

	public void nombreProducto() {
		input = new Scanner(System.in);

		System.out.println("¿Que te gustaria ver?");
		System.out.println("1. Tarjeta Grafica");
		System.out.println("2. Tarjeta Madre");
		System.out.println("3. Memoria RAM");
		System.out.println("4. Procesador");

		int numero = input.nextInt();
		Menu menu = new Menu();
		menu.desplegarMenuFiltrado(numero);
	}

	public void desplegarMarcas(int numero) {
		input = new Scanner(System.in);

		System.out.println("¿Por cual marca te gustaria filtrar?");
		System.out.println("1. NER");
		System.out.println("2. SSI");
		System.out.println("3. XTS");
		System.out.println("4. AST");
		System.out.println("5. LVD");

		int opcion = input.nextInt();
		String nombreComponente = determinarComponente(numero);
		Producto[] productos = impresorFiltro();

		switch (opcion) {
		case 1:
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].getMarca().compareTo("NER") == 0
						&& productos[i].getNombre().compareTo(nombreComponente) == 0) {
					System.out.println(productos[i]);
				}
			}
			comprar();
			break;
		case 2:
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].getMarca().compareTo("SSI") == 0
						&& productos[i].getNombre().compareTo(nombreComponente) == 0) {
					System.out.println(productos[i]);
				}
			}
			comprar();
			break;
		case 3:
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].getMarca().compareTo("XTS") == 0
						&& productos[i].getNombre().compareTo(nombreComponente) == 0) {
					System.out.println(productos[i]);
				}
			}
			comprar();
			break;
		case 4:
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].getMarca().compareTo("AST") == 0
						&& productos[i].getNombre().compareTo(nombreComponente) == 0) {
					System.out.println(productos[i]);
				}
			}
			comprar();
			break;
		case 5:
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].getMarca().compareTo("LVD") == 0
						&& productos[i].getNombre().compareTo(nombreComponente) == 0) {
					System.out.println(productos[i]);
				}
			}
			comprar();
			break;

		default:
			break;
		}

	}

	public void desplegarCategorias(int numero) {
		input = new Scanner(System.in);

		System.out.println("¿Por cual categoria te gustaria filtrar?");
		System.out.println("1. Empresarial");
		System.out.println("2. Personal");
		System.out.println("3. Gaming");

		int opcion = input.nextInt();
		String nombreComponente = determinarComponente(numero);
		Producto[] productos = impresorFiltro();

		switch (opcion) {
		case 1:
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].getCategoria().compareTo("Empresarial") == 0
						&& productos[i].getNombre().compareTo(nombreComponente) == 0) {
					System.out.println(productos[i]);
				}

			}
			comprar();
			break;
		case 2:
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].getCategoria().compareTo("Personal") == 0
						&& productos[i].getNombre().compareTo(nombreComponente) == 0) {
					System.out.println(productos[i]);
				}
			}
			comprar();
			break;
		case 3:
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].getCategoria().compareTo("Gaming") == 0
						&& productos[i].getNombre().compareTo(nombreComponente) == 0) {
					System.out.println(productos[i]);
				}

			}
			comprar();
			break;

		}
	}

	public void desplegarOpiniones(int numero) {
		input = new Scanner(System.in);

		System.out.println("Opiniones");
		System.out.println("1. Bueno");
		System.out.println("2. Regular");
		System.out.println("3. Malo");

		int opcion = input.nextInt();
		String nombreComponente = determinarComponente(numero);
		Producto[] productos = impresorFiltro();

		switch (opcion) {
		case 1:
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].getOpinion().compareTo("Bueno") == 0
						&& productos[i].getNombre().compareTo(nombreComponente) == 0) {
					System.out.println(productos[i]);
				}
			}
			comprar();
			break;
		case 2:
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].getOpinion().compareTo("Regular") == 0
						&& productos[i].getNombre().compareTo(nombreComponente) == 0) {
					System.out.println(productos[i]);
				}
			}
			comprar();
			break;
		case 3:
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].getOpinion().compareTo("Malo") == 0
						&& productos[i].getNombre().compareTo(nombreComponente) == 0) {
					System.out.println(productos[i]);
				}
			}
			comprar();
			break;

		}
	}

	public void desplegarPrecios(int numero) {
		input = new Scanner(System.in);

		System.out.println("¿Por cual precio te gustaria filtrar?");
		System.out.println("1. $ 20000");
		System.out.println("2. $ 237290");
		System.out.println("3. $ 300000");
		System.out.println("4. $ 325000");
		System.out.println("5. $ 514200");
		System.out.println("6. $ 528000");
		System.out.println("7. $ 1299000");

		int opcion = input.nextInt();
		String nombreComponente = determinarComponente(numero);
		Producto[] productos = impresorFiltro();

		switch (opcion) {
		case 1:
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].getPrecio() == (20000) && productos[i].getNombre().compareTo(nombreComponente) == 0) {
					System.out.println(productos[i]);
				}
			}
			comprar();
			break;
		case 2:
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].getPrecio() == (237290) && productos[i].getNombre().compareTo(nombreComponente) == 0) {
					System.out.println(productos[i]);
				}
			}
			comprar();
			break;
		case 3:
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].getPrecio() == (300000) && productos[i].getNombre().compareTo(nombreComponente) == 0) {
					System.out.println(productos[i]);

				}
			}
			comprar();
		case 4:
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].getPrecio() == (325000) && productos[i].getNombre().compareTo(nombreComponente) == 0) {
					System.out.println(productos[i]);
				}
			}
			comprar();
		case 5:
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].getPrecio() == (514200) && productos[i].getNombre().compareTo(nombreComponente) == 0) {
					System.out.println(productos[i]);
				}
			}
			comprar();
		case 6:
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].getPrecio() == (528000) && productos[i].getNombre().compareTo(nombreComponente) == 0) {
					System.out.println(productos[i]);
				}
			}
			comprar();
		case 7:
			for (int i = 0; i < productos.length; i++) {
				if (productos[i].getPrecio() == (1299000)
						&& productos[i].getNombre().compareTo(nombreComponente) == 0) {
					System.out.println(productos[i]);
				}
			}
			comprar();
			break;

		}

	}

	private String determinarComponente(int numero) {
		String componente = "";

		switch (numero) {
		case 1:
			componente = "Tarjeta grafica";
			break;
		case 2:
			componente = "Tarjeta madre";
			break;
		case 3:
			componente = "Memoria RAM";
			break;
		case 4:
			componente = "Procesador";
			break;

		default:
			break;

		}
		return componente;
	}


	// Devuelve el array de Productos del TxT
	private Producto[] impresorFiltro() {
		Producto[] productos = new Producto[10000];
		Lector lector = new Lector();
		productos = lector.AgregarProductosArreglo("Datos.txt", productos);

		return productos;
	}

	private void comprar() {
		Producto[] productos = new Producto[10000];

		System.out.println("Elige el numero del producto que deseas comprar");
		int numeroProducto = input.nextInt();

		Lector lectorcito = new Lector();
		productos = lectorcito.AgregarProductosArreglo("Datos.txt", productos);
		Escritor escritor = new Escritor();

		int indice = 0;
		for (int i = 0; i < productos.length; i++) {
			if (productos[i].getId() == numeroProducto) {
				indice = i;
			}
		}
		escritor.eliminadorTxT("Datos.txt");
		productos = eliminarPorIndice(productos, indice);
		escritor.escritorTxT(productos);

		System.out.println("Haz comprado con exito el producto numero " + numeroProducto);

	}

	private Producto[] eliminarPorIndice(Producto[] productos, int indice) {

		if (productos == null || indice < 0 || indice >= productos.length) {

			return productos;
		}

		Producto[] productos2 = new Producto[productos.length - 1];

		for (int i = 0, k = 0; i < productos.length; i++) {

			if (i == indice) {
				continue;
			}

			productos2[k++] = productos[i];
		}

		return productos2;
	}
	public void menuVendedor() {
		
		BufferedWriter bw = null;
	    FileWriter fw = null;
	    try {
	    	Scanner input = new Scanner(System.in);
	    	input = new Scanner(System.in);
			
	    	
	    	System.out.println("-----INSERTE LOS DATOS DEL PRODUCTO A VENDER-----");
	    	System.out.println("ID del producto:");
	    	String id = input.nextLine();
			System.out.println("Nombre del producto:");
			String nombre = input.nextLine();
			System.out.println("Precio del producto:");
			String precio = input.nextLine();
			System.out.println("Categoria del producto:");
			String categoria = input.nextLine();
			System.out.println("Marca del producto:");
			String marca = input.nextLine();
			System.out.println("Opinion del producto:");
			String opinion = input.nextLine();
			
	    	//string que se va agregar al fichero
	        String data = id + ";" + nombre + ";"+ precio  + ";" + categoria + ";" + marca + ";" + opinion;
	        
	        
	        File file = new File("Datos.txt");
	        // Si el archivo no existe, se crea!
	        if (!file.exists()) {
	            file.createNewFile();
	        }
	        // flag true, indica adjuntar información al archivo.
	        fw = new FileWriter(file.getAbsoluteFile(), true);
	        bw = new BufferedWriter(fw);
	        bw.write("\n"+data);
	        System.out.println("información agregada!");
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	                        //Cierra instancias de FileWriter y BufferedWriter
	            if (bw != null)
	                bw.close();
	            if (fw != null)
	                fw.close();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }

	}
}
