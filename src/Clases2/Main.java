package Clases2;


import java.util.concurrent.TimeUnit;
import javax.print.event.PrintEvent;


public class Main{
 public static void main(String[] args) {//Comparcion de tiempos de ejecucion en buscar por nombre

    Lector lector = new Lector();

    // pila pila1 = lector.AgregarProductosPila("Datos.txt", 10);
    // pila pilaaux = pila1.buscarPorNombre("Memoria RAM");
    // pilaaux.print();
    // System.out.println(" ");
    // arregloCircular arr = lector.AgregarProductosColaArrCirc("Datos.txt", 10);
    // arregloCircular arraux = arr.buscarPorNombre("Memoria RAM");
    // arraux.print();
    
    //System.out.println(System.getProperty("sun.arch.data.model"));


    System.out.println("------------------ Programa para medir el tiempo que toma cada estructura en hacer una busqueda (filtrar una serie de productos) \n dentro de un conjunto de articulos por nombre------------------- \n");
    
    System.out.println("***** Cola ******\n\n");
    System.out.println("1000 datos");

    arregloCircular arregloProductos = lector.AgregarProductosColaArrCirc("Datos10k.txt", 10001);

    long startTime = System.nanoTime();
    arregloCircular busquedaPorNombre = arregloProductos.buscarPorNombre("Memoria RAM");
    long endTime = System.nanoTime();
		long tiempoDeEjecucion = endTime - startTime;
 
    System.out.println("Tiempo de ejecucion en nanosegundos: " + tiempoDeEjecucion);
    System.out.println("Tiempo de ejecucion en milisegundos: " + tiempoDeEjecucion/1000000 + "\n");

    System.out.println("10.000 datos");

    arregloCircular arregloProductos1 = lector.AgregarProductosColaArrCirc("Datos10k.txt", 10001);

    startTime = System.nanoTime();
    busquedaPorNombre = arregloProductos1.buscarPorNombre("Memoria RAM");
    endTime = System.nanoTime();
		tiempoDeEjecucion = endTime - startTime;
 
    System.out.println("Tiempo de ejecucion en nanosegundos: " + tiempoDeEjecucion);
    System.out.println("Tiempo de ejecucion en milisegundos: " + tiempoDeEjecucion/1000000 + "\n");

    System.out.println("100.000 datos");

    arregloProductos1 = lector.AgregarProductosColaArrCirc("Datos100k.txt", 100001);

     startTime = System.nanoTime();
     busquedaPorNombre = arregloProductos1.buscarPorNombre("Memoria RAM");
     endTime = System.nanoTime();
		 tiempoDeEjecucion = endTime - startTime;
 
    System.out.println("Tiempo de ejecucion en nanosegundos: " + tiempoDeEjecucion);
    System.out.println("Tiempo de ejecucion en milisegundos: " + tiempoDeEjecucion/1000000 + "\n");

    System.out.println("1M datos");

    arregloProductos1 = lector.AgregarProductosColaArrCirc("Datos1M.txt", 1000001);

     startTime = System.nanoTime();
     busquedaPorNombre = arregloProductos1.buscarPorNombre("Memoria RAM");
     endTime = System.nanoTime();
	tiempoDeEjecucion = endTime - startTime;
 
    System.out.println("Tiempo de ejecucion en nanosegundos: " + tiempoDeEjecucion);
    System.out.println("Tiempo de ejecucion en milisegundos: " + tiempoDeEjecucion/1000000 + "\n");

    // System.out.println("10M datos");

    // arregloProductos = lector.AgregarProductosColaArrCirc("Datos10M.txt", 10000001);

    // startTime = System.nanoTime();
    // busquedaPorNombre = arregloProductos.buscarPorNombre("Memoria RAM");
    // endTime = System.nanoTime();
	// tiempoDeEjecucion = endTime - startTime;
 
    // System.out.println("Tiempo de ejecucion en nanosegundos: " + tiempoDeEjecucion);
    // System.out.println("Tiempo de ejecucion en milisegundos: " + tiempoDeEjecucion/1000000 + "\n");

    // System.out.println("100M datos");

    // arregloProductos = lector.AgregarProductosColaArrCirc("Datos100M.txt", 100000001);

    // startTime = System.nanoTime();
    // busquedaPorNombre = arregloProductos.buscarPorNombre("Memoria RAM");
    // endTime = System.nanoTime();
	// tiempoDeEjecucion = endTime - startTime;
 
    // System.out.println("Tiempo de ejecucion en nanosegundos: " + tiempoDeEjecucion);
    // System.out.println("Tiempo de ejecucion en milisegundos: " + tiempoDeEjecucion/1000000 + "\n");

     busquedaPorNombre = null;
     arregloProductos1 = null;



     System.out.println("***** Pila ******");

     System.out.println("10.000 datos");

     pila productosPila = lector.AgregarProductosPila("Datos10k.txt", 10001);
 
     startTime = System.nanoTime();
     pila busquedaPorNombrePila = productosPila.buscarPorNombre("Memoria RAM");
     endTime = System.nanoTime();
    tiempoDeEjecucion = endTime - startTime;
  
     System.out.println("Tiempo de ejecucion en nanosegundos: " + tiempoDeEjecucion);
     System.out.println("Tiempo de ejecucion en milisegundos: " + tiempoDeEjecucion/1000000 + "\n");
 
     System.out.println("100.000 datos");
 
     productosPila = lector.AgregarProductosPila("Datos100k.txt", 100001);
 
      startTime = System.nanoTime();
      busquedaPorNombrePila = productosPila.buscarPorNombre("Memoria RAM");
      endTime = System.nanoTime();
          tiempoDeEjecucion = endTime - startTime;
  
     System.out.println("Tiempo de ejecucion en nanosegundos: " + tiempoDeEjecucion);
     System.out.println("Tiempo de ejecucion en milisegundos: " + tiempoDeEjecucion/1000000 + "\n");
 
     System.out.println("1M datos");
 
     productosPila = lector.AgregarProductosPila("Datos1M.txt", 1000001);
 
      startTime = System.nanoTime();
      busquedaPorNombrePila = productosPila.buscarPorNombre("Memoria RAM");
      endTime = System.nanoTime();
     tiempoDeEjecucion = endTime - startTime;
  
     System.out.println("Tiempo de ejecucion en nanosegundos: " + tiempoDeEjecucion);
     System.out.println("Tiempo de ejecucion en milisegundos: " + tiempoDeEjecucion/1000000 + "\n");
 
    //  System.out.println("10M datos");
 
    //  productosPila = lector.AgregarProductosPila("Datos10M.txt", 10000001);
 
    //  startTime = System.nanoTime();
    //  busquedaPorNombrePila = productosPila.buscarPorNombre("Memoria RAM");
    //  endTime = System.nanoTime();
    //  tiempoDeEjecucion = endTime - startTime;
  
    //  System.out.println("Tiempo de ejecucion en nanosegundos: " + tiempoDeEjecucion);
    //  System.out.println("Tiempo de ejecucion en milisegundos: " + tiempoDeEjecucion/1000000 + "\n");
 
    //  System.out.println("100M datos");
 
    //  productosPila = lector.AgregarProductosPila("Datos100M.txt", 100000001);
 
    //  startTime = System.nanoTime();
    //  busquedaPorNombrePila = productosPila.buscarPorNombre("Memoria RAM");
    //  endTime = System.nanoTime();
    //  tiempoDeEjecucion = endTime - startTime;
  
    //  System.out.println("Tiempo de ejecucion en nanosegundos: " + tiempoDeEjecucion);
    //  System.out.println("Tiempo de ejecucion en milisegundos: " + tiempoDeEjecucion/1000000 + "\n");
 


     
 }
}