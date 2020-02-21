/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana5.Examenes;



/**
 *
 * @author HP
 */
public class ExamenLab {
  


    public  int NumeroAleatorio(int minimo,int maximo){
        
        int numero=(int)Math.floor(Math.random()*(minimo-maximo+1)+(maximo));
        return numero;
    }
  
   public void ImprimirArreglo(int arreglo[]){
        for (int valor: arreglo) {
            System.out.printf("[%d] ",valor);
        }
        System.out.println("");
    }
    
    
    public int busquedaBinaria(int buscar,int arreglo[], int inicio, int fin){
         try{
        if (fin<inicio) 
            return -1;
        
        int pivote=((inicio+fin)/2);
        if (arreglo[pivote] ==buscar) 
            return pivote;
        
        else if (buscar>arreglo[pivote]) 
            return busquedaBinaria(buscar,arreglo, pivote + 1,fin);
            
        else 
        return busquedaBinaria(buscar,arreglo,inicio, pivote -1);
        
       }catch(IndexOutOfBoundsException e){
           System.out.println("El numero no existe en el arreglo");
       }
         
         return 0;
         
                 
                 
     
    } 
    
}