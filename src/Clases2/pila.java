
package Clases2;
public class pila{//Cola implementada como arreglo circular
    
    Producto arregloDinamico[];//Este es el arreglo circular como tal que almacena lo que quieran almacenar
     int top;
    // int back;
    public int size;

    pila(int length){
        this.arregloDinamico = new Producto [length];
        // this.front = 0;
        // this.back = 0;
        this.size = 0;
        this.top=-1;
    }

    public pila buscarPorNombre(String nombreABuscar){
        pila arrResultadoDeBusqueda = new pila(this.arregloDinamico.length);
        pila pilaAux  = new pila(this.arregloDinamico.length);

        Producto auxP;
        int auxtop = top;
        //System.out.println(this.arregloCirc.length);
        for(int i =0; i<auxtop+1; i++){//En enl analisis asintotico, n es this.arregloCirc.length
                
                //System.out.println(this.size);
                //System.out.println(i);
                auxP = this.peek();//Esto se realiza n veces
                //System.out.println(this.peek());

            if(nombreABuscar.equals(auxP.getNombre())){//La accion ralizada aqui se realiza n veces
                arrResultadoDeBusqueda.push(this.pop());
            }   else{
                this.pop();
            }
            pilaAux.push(auxP);//Tambien se raliza n veces
            //System.out.println(top);
        }

        for(int i =0; i<auxtop+1;i++){
            this.push(pilaAux.pop());  
        }


        return arrResultadoDeBusqueda;
    }



    //  public arregloCircular filtrarPorMarca(String marcaAFiltrar){
    //     arregloCircular arrResultadoDeBusqueda = new arregloCircular(this.arregloCirc.length);
    //     Producto auxP;
    //     System.out.println(this.arregloCirc.length);
    //     for(int i =0; i<this.arregloCirc.length; i++){
                
    //            // System.out.println(this.size);
    //            // System.out.println(i);
    //             auxP = this.peek();
    //             //System.out.println(this.peek());

    //         if(marcaAFiltrar.equals(auxP.getMarca())){
    //             arrResultadoDeBusqueda.encolar(this.desencolar());
    //         }   else{
    //             this.desencolar();
    //         }
    //         this.encolar(auxP);
    //     }
    //     return arrResultadoDeBusqueda;
    // }

    

    // public arregloCircular filtrarPorCategoria(String categoriaAFiltrar){
    //     arregloCircular arrResultadoDeBusqueda = new arregloCircular(this.arregloCirc.length);
    //     Producto auxP;
    //     System.out.println(this.arregloCirc.length);
    //     for(int i =0; i<this.arregloCirc.length; i++){
                
    //            // System.out.println(this.size);
    //            // System.out.println(i);
    //             auxP = this.peek();
    //             //System.out.println(this.peek());

    //         if(categoriaAFiltrar.equals(auxP.getCategoria())){
    //             arrResultadoDeBusqueda.encolar(this.desencolar());
    //         }   else{
    //             this.desencolar();
    //         }
    //         this.encolar(auxP);
    //     }
    //     return arrResultadoDeBusqueda;
    // }

    

    public void push(Producto objeto){
        this.top++;
        arregloDinamico[top] = objeto;
        if(this.top==this.arregloDinamico.length){
            this.expandArray();
        }
    }

    public void expandArray(){
        Producto[] arregloAuxiliar = new Producto[2*arregloDinamico.length];
        for(int u = 0; u<this.arregloDinamico.length; u++){
            arregloAuxiliar[u] = this.arregloDinamico[u];
        }
        this.arregloDinamico = new Producto[arregloAuxiliar.length];
        this.arregloDinamico = arregloAuxiliar;
    }

    public void shrinkArray(){
        Producto[] arregloAuxiliar = new Producto[arregloDinamico.length/2];
        for(int u = 0; u<this.arregloDinamico.length/2; u++){
            arregloAuxiliar[u] = this.arregloDinamico[u];
        }
        this.arregloDinamico = new Producto[arregloDinamico.length];
        this.arregloDinamico = arregloAuxiliar;
    }

    // public int next(int index){
    //     if(index==this.arregloCirc.length-1){
    //         //System.out.println(index);
    //         return 0;
    //     }else{
    //         return index+1;
    //     }
    // }

    // public int behind(int index){
    //     if(index==0){
    //         return arregloCirc.length-1;
    //     }else{
    //         return index-1;}
    // }

    public Producto pop(){
        return this.arregloDinamico[top--];
    }

    public Producto peek(){
        //System.out.println(this.front);
        //System.out.println(this.arregloCirc[front]);
        return this.arregloDinamico[top];
    }

    public void print(){
        Producto auxProd; 
        pila pilaAux  = new pila(this.arregloDinamico.length);
        int auxtop = this.top;
        for(int i =0; i<auxtop+1;i++){
            auxProd =  this.peek();
            //System.out.println(this.arregloCirc[9]);
            System.out.println(this.pop());
            //System.out.println(this.arregloCirc[9]);
            pilaAux.push(auxProd);  
            //System.out.println(this.arregloCirc[9]);
        }
        for(int i =0; i<auxtop+1;i++){
            this.push(pilaAux.pop());  
        }
        

    }  
}