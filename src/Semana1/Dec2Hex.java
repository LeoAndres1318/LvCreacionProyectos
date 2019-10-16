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
public class Dec2Hex {
    
     
         
       public PrintStream Conversor3(int numero){
           
        
      int cociente=0;
      int residuo=0;
      String numeroBinario=" ";
      int letra=0;
   
     
      
      cociente = numero/16;
      residuo=(numero-(cociente* 16));
      letra=residuo;
      while(cociente>16){
          numeroBinario=residuo+numeroBinario;
          
          residuo= cociente % 16;
          cociente = cociente/16;
                  
      }
        
        
         if (letra==10) {
             numeroBinario="A";
              numeroBinario=(cociente)+ "" + residuo +numeroBinario;
     
       
         }else if (letra==11) {
             numeroBinario="B";
               numeroBinario=(cociente)+ "" + residuo +numeroBinario;
      
         }else if (letra==12) {
             numeroBinario="C";
              numeroBinario=(cociente)+ "" + residuo +numeroBinario;
        
         }else if (letra==13) {
             numeroBinario="D";
              numeroBinario=(cociente)+ "" + residuo +numeroBinario;
        
         }else if (letra==14) {
             numeroBinario="E";
              numeroBinario=(cociente)+ "" + residuo +numeroBinario;
      
         }else if (letra==15) {
             numeroBinario="F";
              numeroBinario=(cociente)+ "" + residuo +numeroBinario;
        
         }
    
       
    return System.out.printf("El numero %d su valor el %s\n",numero,numeroBinario) ;
    }
       
       
    
}


