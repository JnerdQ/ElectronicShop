package Clases2;
import java.util.Arrays;

public class arregloCircular{//Cola implementada como arreglo circular
    
    Producto arregloCirc[];//Este es el arreglo circular como tal que almacena lo que quieran almacenar
    int front;
    int back;
    public int size;

    arregloCircular(int length){
        int potencia = 4;
        while(potencia<=length){
            potencia = potencia*2;
        }
        this.arregloCirc = new Producto [potencia];
        this.front = 0;
        this.back = 0;
    }

    public arregloCircular buscarPorNombre(String nombreABuscar){
        arregloCircular arrResultadoDeBusqueda = new arregloCircular(this.arregloCirc.length);
        Producto auxP;
        //System.out.println(this.arregloCirc.length);
        for(int i =0; i<size; i++){//En enl analisis asintotico, n es this.arregloCirc.length
                
                //System.out.println(this.size);
                //System.out.println(i);
                auxP = this.peek();//Esto se realiza n veces
                //System.out.println(this.peek());

            if(nombreABuscar.equals(auxP.getNombre())){//La accion ralizada aqui se realiza n veces
                arrResultadoDeBusqueda.encolar(this.desencolar());
            }   else{
                this.desencolar();
            }
            this.encolar(auxP);//Tambien se raliza n veces
        }
        return arrResultadoDeBusqueda;
    }



     public arregloCircular filtrarPorMarca(String marcaAFiltrar){
        arregloCircular arrResultadoDeBusqueda = new arregloCircular(this.arregloCirc.length);
        Producto auxP;
        System.out.println(this.arregloCirc.length);
        for(int i =0; i<this.arregloCirc.length; i++){
                
               // System.out.println(this.size);
               // System.out.println(i);
                auxP = this.peek();
                //System.out.println(this.peek());

            if(marcaAFiltrar.equals(auxP.getMarca())){
                arrResultadoDeBusqueda.encolar(this.desencolar());
            }   else{
                this.desencolar();
            }
            this.encolar(auxP);
        }
        return arrResultadoDeBusqueda;
    }

    public arregloCircular ordenarPorPrecio(Boolean menorAmayor){//ordena de menor a mayor (el menor queda al principio) si menorAmayor = 1, si no al reves
        Producto arrProductos[] = (Producto []) new Comparable[this.size];
        arregloCircular arrCircProductosOrdenado = new arregloCircular(this.arregloCirc.length);
        for(int i=0; i<size;i++){
            arrProductos[i] =  this.desencolar();
        }
        Arrays.sort(arrProductos);
        if(menorAmayor){
            for(int i = 0; i<size; i++){
                arrCircProductosOrdenado.encolar(arrProductos[i]);
            }
        }else{
            for(int i = 0; i<size; i++){
                arrCircProductosOrdenado.encolar(arrProductos[size-i]);
            }
        }

        return arrCircProductosOrdenado;
    }

    public arregloCircular filtrarPorCategoria(String categoriaAFiltrar){
        arregloCircular arrResultadoDeBusqueda = new arregloCircular(this.arregloCirc.length);
        Producto auxP;
        System.out.println(this.arregloCirc.length);
        for(int i =0; i<this.arregloCirc.length; i++){
                
               // System.out.println(this.size);
               // System.out.println(i);
                auxP = this.peek();
                //System.out.println(this.peek());

            if(categoriaAFiltrar.equals(auxP.getCategoria())){
                arrResultadoDeBusqueda.encolar(this.desencolar());
            }   else{
                this.desencolar();
            }
            this.encolar(auxP);
        }
        return arrResultadoDeBusqueda;
    }

    

    public void encolar(Producto objeto){
        arregloCirc[back] = objeto;
        this.back = this.next(back);
        //System.out.println(back);
        if(this.back==front){
            this.expandArray();
        }
        this.size++;
    }

    public void expandArray(){
        Producto[] arregloAuxiliar = new Producto[2*arregloCirc.length];
        int i = front;
        this.front = 0;
        this.back = this.arregloCirc.length;
        for(int u = 0; u<this.arregloCirc.length; u++){
            arregloAuxiliar[u] = this.arregloCirc[i];
            i=this.next(i);
        }
        this.arregloCirc = new Producto[arregloAuxiliar.length];
        this.arregloCirc = arregloAuxiliar;
    }

    public void shrinkArray(){
        Producto[] arregloAuxiliar = new Producto[arregloCirc.length/2];
        for(int u = 0; u<this.arregloCirc.length/2; u++){
            arregloAuxiliar[u] = this.arregloCirc[u];
        }
        this.arregloCirc = new Producto[arregloAuxiliar.length];
        this.arregloCirc = arregloAuxiliar;
    }

    public int next(int index){
        if(index==this.arregloCirc.length-1){
            //System.out.println(index);
            return 0;
        }else{
            return index+1;
        }
    }

    public int behind(int index){
        if(index==0){
            return arregloCirc.length-1;
        }else{
            return index-1;}
    }

    public Producto desencolar(){
        this.size--;
        int auxInt = this.front;
        this.front = this.next(front);

        return arregloCirc[auxInt];
    }

    public Producto peek(){
        //System.out.println(this.front);
        //System.out.println(this.arregloCirc[front]);

        return this.arregloCirc[front];
    }

    public void print(){
        Producto auxProd; 
        for(int i =0; i<size;i++){
            auxProd =  this.peek();
            //System.out.println(this.arregloCirc[9]);
            System.out.println(this.desencolar());
            //System.out.println(this.arregloCirc[9]);
            this.encolar(auxProd);  
            //System.out.println(this.arregloCirc[9]);

        }
    }  
}