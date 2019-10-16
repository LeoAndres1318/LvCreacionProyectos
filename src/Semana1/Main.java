/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
        int abrir=0;
       do{
            System.out.println("*** MENU PRINCIPAL***" + "\n1. Conversor Decimal a Binario" + "\n2. Conversor Decimal a Octal" + "\n3. Conversor Decimal a Hexadecimal"  +
                           "\n4. Salir del Sistema"+"\nIngrese opcion: ");
                               abrir=leer.nextInt();
                               
                               
                               
               switch(abrir){
                   case 1:
                {
                       System.out.println("***CONVERSOR DECIMAL A BINARIO***");
                       System.out.println("Ingrese numero: ");
                       int numero=leer.nextInt();
                       Dec2Bin conversor1=new Dec2Bin();
                       
                       System.out.println(conversor1.Conversor1(numero));
                       break;
               }
                        case  2:
               {
                       System.out.println("***CONVERSOR DECIMAL A OCTAL***");
                       System.out.println("Ingrese numero: ");
                       int numero=leer.nextInt();
                       Dec2Oct conversor2=new Dec2Oct();
                       
                       System.out.println(conversor2.Coversor2(numero));
                       break;
               }
                       case 3:
                {
                        System.out.println("***CONVERSOR DECIMAL A HEXADECIMAL***");
                       System.out.println("Ingrese numero: ");
                       int numero=leer.nextInt();
                       Dec2Hex conversor3=new Dec2Hex();
                       
                       System.out.println(conversor3.Conversor3(numero));
                       break;
               } 
                       
               
                            
                
             
               
               }     
        }while(abrir!=4);
    }
}

