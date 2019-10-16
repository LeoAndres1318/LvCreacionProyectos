/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1;

import java.io.PrintStream;


/**
 *
 * @author HP
 */
public class Dec2Oct {
    
         
         public PrintStream Coversor2(int numero){
          
       
      int cociente=0;
      int residuo=0;
      String numeroBinario=" ";
      
      cociente = numero/8;
      residuo=(numero-(cociente* 8));
      
      while(cociente>8){
          numeroBinario=residuo+numeroBinario;
          
          residuo= cociente % 8;
          cociente = cociente/8;
          
          
       
          
      }
      numeroBinario=(cociente)+ "" + residuo +numeroBinario;
        return System.out.printf("El numero %d su valor el %s\n",numero,numeroBinario);
       
       
        
        
         }
}
    
    

