/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana5.Examenes;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MainBusquedaBinaria {
     public static void main(String[] args) {
     
     Scanner leer= new Scanner(System.in);
     int longitud=100;   
     int numeros[]=new int[longitud];
     int maximo=1000;
     int minimo=0;
     int opcion=0;
    do{
       
            
        if (maximo<minimo) {
            int aux=maximo;
            maximo=minimo;
            minimo=aux;
        }
        if ((maximo-minimo)>=(longitud-1)){
          int  numero_elementos=0;
        
          boolean encontrado;
          int aleatorio;  
          while(numero_elementos<longitud){
             ExamenLab lab = new ExamenLab();
              aleatorio=lab.NumeroAleatorio(maximo,minimo);
               encontrado=false;
              for (int i = 0; i < numeros.length; i++) {
                  if (aleatorio==numeros[i]) {
                      encontrado=true;
                  }
                  
              }
              if (encontrado==false) {
                  numeros[numero_elementos++]=aleatorio;
             
                  
              }
           
          }
        
              System.out.println("***MENU PRINCIPAL***");
              System.out.println("\n1. Ordenamiento Burbuja" +  
                                 "\n2. Busqueda Binaria" +
                                 "\n3. Salir del Sistema");
                                  opcion=leer.nextInt();
            
       switch(opcion){
              
           case 1:
                  {
           
        ExamenLab lab= new ExamenLab();
        System.out.println("Mostrar arreglo");
           for (int i = 0; i < numeros.length; i++) {
               for (int x = 0; x < (numeros.length-1); x++) {
                    for (int j = 0; j <(numeros.length-1); j++) {
                        if (numeros[j]>numeros[j+1]) {
                            int auxiliar=numeros[j];
                            numeros[j]=numeros[j+1];
                            numeros[j+1]=auxiliar;
                        }
                    }
                }
                  System.out.println(numeros[i]);
           }
           
           
        System.out.println("Ingrese valor a buscar: ");
        int buscar=leer.nextInt();
        
        int busqueda=lab.busquedaBinaria(buscar,numeros,0,numeros.length);
        
        if (busqueda==-1) {
            System.out.println("Valor no encontrado en arreglo");
        }else{
            System.out.printf("Valor encontrado en array[%d] %n", busqueda);
        }
                  
                  }
        break;
       
        case 2:
             ExamenLab lab = new ExamenLab();
            System.out.println("***Busqueda Binaria***");
            
   lab.ImprimirArreglo(numeros);
   
        System.out.println("Ingrese valor a buscar: ");
        int buscar=leer.nextInt();
        
        int busqueda=lab.busquedaBinaria(buscar,numeros,0,numeros.length);
        
            
        if (busqueda==-1){ 
            
         throw new ArrayIndexOutOfBoundsException("Valor no encontrado en el arreglo");
        
        }else{
            System.out.printf("Valor encontrado en array[%d] %n", busqueda);
        }
            break;
            
        
          
       }
        }
        }while(opcion!=3);
        
        
           
        
    
    }
}
