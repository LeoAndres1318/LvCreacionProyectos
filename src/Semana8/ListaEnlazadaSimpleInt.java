/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana8;

/**
 *
 * @author HP
 */
public class ListaEnlazadaSimpleInt {
    
    private nodoInt primer;

    public ListaEnlazadaSimpleInt() {
        this.primer = null;
    }
    
    
    
    private boolean estaVacia(){
         return (primer==null);
    }
    
   

     //Agregar
     public boolean insertarNumero(int numero){
         if (!buscarNumero(numero)) {
             nodoInt nuevo=new nodoInt();
             nuevo.setNumero(numero);
             if(getPrimer()==null){
                 setPrimer(nuevo);
                 return true;
             }else{
                 nodoInt aux= getPrimer();
                 if (aux.getNumero()>numero) {
                     nuevo.setSiguiente(aux);
                     setPrimer(nuevo);
                     return true;
                 }
                 while(aux.getSiguiente()!=null){
                     if(aux.getSiguiente().getNumero()>numero){
                        nuevo.setSiguiente(aux.getSiguiente());
                         aux.setSiguiente(nuevo);
                         return true;
                     }
                     aux=aux.getSiguiente();
                 }
                 aux.setSiguiente(nuevo);
                 return true;
             }
         }else{
             System.out.println("El dato ya existe");
             return false;
         }
     }
     //Buscar 
     public boolean buscarNumero(int numero){
         nodoInt temp= getPrimer();
         while(temp!=null){
             if (temp.getNumero()==numero) {
                 return true;
                 
             }
             temp= temp.getSiguiente();
         }
         return false;
     }
    
   //Imprimir
     public void imprimirLista(){
         nodoInt aux =getPrimer();
         while(aux!=null){
             System.out.println("Numero: " + aux.getNumero() + "\n");
             aux=aux.getSiguiente();
         }
     }
     
     //Eliminar
      public void eliminarNodo(int numero){
        if(estaVacia())
            return;
        else{
            nodoInt actual= primer;
            nodoInt anterior= null;
            while(actual!= null){
             if(actual.getNumero()==numero){
                 if(actual==primer)
                 primer=primer.getSiguiente();
                 else
                     
                 anterior.setSiguiente(actual.getSiguiente());
                  System.out.println("Nodo Eliminado");
                  return;
             }
               
                
               anterior=actual; 
               actual= actual.getSiguiente();
               
               
            }
}
      }
      //Eliminar menor
      public void eliminarMenor(int numero){    
        if(estaVacia()){
            return;
        }else{
            nodoInt actual = primer;
            nodoInt anterior = null;
            while(actual != null){
                if(actual.getNumero()<numero){
                    if(actual== primer)
                        primer=primer.getSiguiente();
                    else
                        anterior.setSiguiente(actual.getSiguiente());
                    System.out.println("Nodo Eliminado");         
                }
                anterior=actual;
                actual=actual.getSiguiente();
            }
        }
    }
    //Eliminar mayor
     public void eliminarMayor(int numero){    
        if(estaVacia()){
            return;
        }else{
            nodoInt actual = primer;
            nodoInt anterior = null;
            while(actual != null){
                if(actual.getNumero()>numero){
                    if(actual == primer)
                        primer=primer.getSiguiente();
                    else
                        anterior.setSiguiente(null);
                    System.out.println("Nodo Eliminado");    
                }
                anterior=actual;
                actual=actual.getSiguiente();
            }
        }
    }

    public nodoInt getPrimer() {
        return primer;
    }

    public void setPrimer(nodoInt primer) {
        this.primer = primer;
    }
      
}