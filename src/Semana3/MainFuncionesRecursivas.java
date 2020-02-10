/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MainFuncionesRecursivas {
  
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
      FuncionesRecursivas fr= new FuncionesRecursivas();
        int opcion=0;
         char letra_;
        do {
        System.out.println("MENU");
        System.out.println("Ingrese numero de funcion: ");
        opcion=leer.nextInt();
        leer.nextLine();
        switch(opcion){
            case 1: {
        System.out.println("Imprimir 10 veces un mensaje: ");
        String mensaje=leer.nextLine();
        
        int contador=1;
       
     fr.print10Times(mensaje,contador);
        break;
            }
            case 2:
        System.out.println("Imprimir letras de una palabra: ");
        String palabra=leer.nextLine();
       
        int contador=0;
        String letra="";
      
        fr.printCharacters(palabra, contador);
        break;
            case 3:
                
        
                    
                    int[] numbers=new int[5];
                for (int i = 0; i <numbers.length; i++) {
                   
                    System.out.println("Ingresar "+ i +" numeros: ");
                   numbers[i]=leer.nextInt();  
                    fr.printOdd(numbers,0); 
                }
                
               
        break;
        
        
            case 4:
                int[]a= new int[5];
                int[]b= new int[5];
                for (int i = 0; i <a.length; i++) {
                   
                    System.out.println("Ingresar "+ i +" numeros primer arreglo: ");
                   a[i]=leer.nextInt();
                  
                }
                for (int i = 0; i < b.length; i++) {
                    System.out.println("Ingresar " + i +" numeros segundo arreglo: ");
                    b[i]=leer.nextInt();
                }
                 fr.compareArrays(a, b,0);
                
             break;
            case 5:
                int []number=new int[10];
               
                 
                for (int i = 0; i < number.length; i++) {
                   
                    System.out.println("Ingresar  " + i + " numeros en el arreglo");
                    number[i]=leer.nextInt();
                   int suma=+number[i];
                        fr.suma(number, 0, suma);
                }
            case 6:
                int []numero=new int[5];
               
                 
                for (int i = 0; i < numero.length; i++) {
                   
                    System.out.println("Ingresar  " + i + " numeros en el arreglo");
                    numero[i]=leer.nextInt();
                  
                    fr.min(numero,1,0);
                }
               
               
    
        
       break;
                 case 7:
                int []numeros=new int[5];
               
                 
                for (int i = 0; i < numeros.length; i++) {
                   
                    System.out.println("Ingresar  " + i + " numeros en el arreglo");
                    numeros[i]=leer.nextInt();
                
                   
                } fr.max(numeros,1,0);
               
               break;
               
                 case 8:
                     System.out.println("Ingrese palabra: ");
                     String word= leer.nextLine();
                    
                      for (int i = 0; i<word.length() ; i++) {
                         
                          System.out.println("Ingrese letra: ");
                       
                     char charAt=leer.next().charAt(i);
                          if (charAt==word.charAt(i)) {
                               fr.frecuency(word,charAt, 0, 0);
                          }
                     
                     }
                      
                      break;
                      
                      
                 case 10:       
                      
                     System.out.println("Ingrese palabra: ");
                      String palabras= leer.nextLine();
                      fr.isPalindrome(palabras, 0, palabras.length()-1);
                      
                     
                 
                     
                     
        
       break;
                 case 11:
             int[][]matrix= new int[3][3];
             int [][]totalS=new int[3][3];
             
                    
                for (int i = 0; i <matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
            System.out.println("Ingresar numeros fila "+ i +" Columna: " + j +" numeros arreglo: ");
                   matrix[i][j]=leer.nextInt();
                  
                   fr.matrixSum(matrix, 0, 0,totalS);
                  
                    }
   
                    
                }
                
                }
                
       
       
       
                
        
                
        
        
        } while(opcion!=13);
        

        
        }
       
        
        
    }


