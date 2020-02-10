/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

/**
 *
 * @author HP
 */
public class FuncionesRecursivas {
    
    public String print1Times(String mensaje){
        return print1Times(mensaje,1);
    }
    private String print1Times(String mensaje,int d){
       
        if (d<10) 
               
        return "Recursividad: " + mensaje ;
           print10Times(mensaje,++d);
           return null;
    }
    
   public void print10Times(String mensaje,int d){
       
        if (d<10) 
             print10Times(mensaje,d+1);
      
            System.out.println("El mensaje es: " + mensaje);
             
           
     
    }
   public void printCharacters(String palabra, int d){
       if (d<palabra.length()) {
      
          
           System.out.println("Las letras de la palabra son: " + "\n" +palabra.charAt(d));
                printCharacters(palabra,d+1);
                
       }
   }
   
   public void printOdd(int[] numbers, int d){
      int par=2;
       if (d<numbers.length) {
           
                if(numbers[d]%par==0) {
                      
           }else {
                  
           
                    
                   System.out.println("Los numeros impares son: : " +  numbers[d] + " ");
                    
                    printOdd(numbers,d+2);
                    
                    
           }
           
       }
   }
       
   public boolean compareArrays(int[] a, int[] b,int d){
       if (d<=a.length &&d<=b.length) {
           System.out.println("Primer arreglo :" + a.length + " igual con segundo arreglo: " + b.length);
           compareArrays(a,b,d+1);
           return true;
       }
       return false;
   }
   
   public int suma(int[] numbers,int d ,int sum){
       if (d<=numbers.length) {
           return suma(numbers,d+1,sum+d);
       }
       return sum;
   }
   
   public int min(int[] numbers,int d,int a){
      
       if (d<numbers.length) {
           if(a<numbers.length) {
               
           
           if (numbers[d]>=numbers[a]) {
               System.out.println("El numero minimo es : "+ numbers[a]);
                 return min(numbers,d+1,a);
         
           }
            
         
           }   
           
           }
          return 0;
       
   }
    public int max(int[] numbers,int d,int a){
      
       if (d<numbers.length) {
           if(a<numbers.length) {
               
           
           if (numbers[d]>=numbers[a]) {
               System.out.println("El numero maximo es : "+ numbers[d]);
                 return max(numbers,d+1,a);
         
           }
            
         
           }   
           
           }
          return 0;
       
   }
    
    public int frecuency(String word,char charAt,int a,int contador){
        if (a<word.length()) {
  
             
               if (word.charAt(a)==word.charAt(a+1)) {
       
                contador++;
            System.out.println("La letra: " + word.charAt(a) +" Tuvo: " + contador+  " ocurrencias" );
            
             return frecuency(word,word.charAt(a),a+1,contador);
            }
            
            
            
        }
        return 0;
    }
    
    public boolean isPalindrome(String word, int a, int b){
        if (word.charAt(a)==word.charAt(b)) {     
            System.out.println("Es palindromo la palabra: " + word);
            isPalindrome(word,a+1,b);
                
            return true;
        }else{
            System.out.println("NO es palindromo");
             return false;
        }
        
       
    }
    
    public int matrixSum(int [][] matrix, int a, int b, int[][] suma){
        if (a<matrix.length) {
            if (b<matrix.length) {
                suma[a][b]=suma[a][b]+matrix[a][b];
                
                System.out.println("La suma de la matriz es: " + suma[a][b]);
                
                
                 return  matrixSum(matrix,a+1,b+1,suma);
            }
            
          
            
        }
         return 0; 
    }
    
    public void printDiference(int[][] matrix){
        
       
        
    }
            
            
    
    
}

