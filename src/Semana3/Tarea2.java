/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Tarea2 {
    public static void main(String[] args) {
     
     Scanner leer= new Scanner(System.in);
     int longitud=1000;   
     int numeros[]=new int[longitud];
     int maximo=1000;
     int minimo=0;
     int ingresar=0;
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
             
              aleatorio=generaNumeroAleatorio(maximo,minimo);
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
              System.out.println("\n1. Mostrar arreglo con 1000 elementos"+"\n2. Ordenamiento Burbuja en forma ascendente" + "\n2. Ordenamiento Busqueda Lineal" +
                                 "\n4. Busqueda Binaria" + "\n5. Tiempo de Ejecucion de ambos algoritmos"  +
                                 "\n6. Salir del Sistema");
                                  ingresar=leer.nextInt();
            
       switch(ingresar){
              
           case 1:
                  {
            System.out.println("Mostrar arreglo");
           for (int i = 0; i < numeros.length; i++) {
                  System.out.println(numeros[i]);
           }
        
        
        
        for (int i = 0; i < (numeros.length-1); i++) {
            for (int j = 0; j <(numeros.length-1); j++) {
                if (numeros[j]>numeros[j+1]) {
                    int auxiliar=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=auxiliar;
                }
            }
        }
                  }
        break;
        case 2:
        System.out.println("Mostrar el arreglo  el forma Burbuja ascendente: ");
        for (int i = 0; i <numeros.length-1; i++) {
            System.out.println(numeros[i] + "  -  ");
        }
          
          break;
          
        case 3: 
           
        System.out.println("***Busqueda Lineal***");
            System.out.println("Ingrese numero: ");
        int lineal= leer.nextInt();
        
         int Buscar=busquedaLineal(lineal,numeros);
            
         
        break;
        case 4:
            System.out.println("***Busqueda Binaria***");
            
        
        int[] arreglo=new int[10];
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("Ingrese valor en array[%d] ",i);
            arreglo[i]=leer.nextInt();
        }
        
   imprimirarreglo(arreglo);
   
        System.out.println("Ingrese valor a buscar: ");
        int buscar=leer.nextInt();
        
        int busqueda=busquedaBinaria(buscar,arreglo,0,arreglo.length);
        
        if (busqueda==-1) {
            System.out.println("Valor no encontrado en arreglo");
        }else{
            System.out.printf("Valor encontrado en array[%d] %n", busqueda);
        }
            break;
            
        case 5:
            System.out.println("Medir el tiempo de ejecucion de un programa");
            long inicio= System.nanoTime();
            
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros.length; j++) {
                new Random().nextDouble();    
                }
                
            }
            long fin= System.nanoTime();
            double diferencia=(double)(fin-inicio) * 1.0e-9;
            System.out.println("El programa dura: " + diferencia + "  segundos");
          }
        }
        }while(ingresar!=6);
        
        
           
    }
    
    


    public static int generaNumeroAleatorio(int minimo,int maximo){
        
        int num=(int)Math.floor(Math.random()*(minimo-maximo+1)+(maximo));
        return num;
    }
    
    public static int busquedaLineal(int Ebuscar, int numeros[]){
        
        for (int buscar: numeros) {
            for (int i = 0; i < numeros.length ; i++) {
               
                
                    if (numeros[i]==Ebuscar) {
                        System.out.println("Numero encontrado!: "+ Ebuscar +" En la posicion: " + i);
                    }
                
            }
             
                
             return buscar;
        }
       
    return 0;
      }
    static void imprimirarreglo(int arreglo[]){
        for (int valor: arreglo) {
            System.out.printf("[%d] ",valor);
        }
        System.out.println("");
    }
    
    
    static int busquedaBinaria(int buscar,int arreglo[], int inicio, int fin){
        
        if (fin<inicio) 
            return -1;
            
            
        int pivote=((inicio+fin)/2);
        if (arreglo[pivote] ==buscar) 
            return pivote;
        
        else if (buscar>arreglo[pivote]) 
            return busquedaBinaria(buscar,arreglo, pivote + 1,fin);
            
        else
        return busquedaBinaria(buscar,arreglo,inicio, pivote -1);
        
    }
}