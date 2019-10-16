/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Dec2Bin {
    
    
    
          Scanner leer=new Scanner(System.in);
        
         
          
        public PrintStream Conversor1(int numero){
        
      int cociente=0;
      int residuo=0;
      String numeroBinario="";
      
      cociente = numero/2;
      residuo=numero % 2;
      
      while(cociente!=1){
          numeroBinario=residuo+numeroBinario;
          
          residuo= cociente % 2;
          cociente = cociente/2;
          
          
       
          
      }
      numeroBinario= "1" +residuo +numeroBinario;
      
      return  System.out.printf("El numero %d su valor el %s\n",numero,numeroBinario);
       
       
        
        
        }

}