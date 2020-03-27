/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana10;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PruebaEmpleados {
    
    public static void main(String[] args) throws IOException {
        
        
        Scanner leer = new Scanner(System.in);
        
        int opcion=0;
        ListaEmpleados empleado= new ListaEmpleados();
        do{
           
            
           
            System.out.println("1)Agregar Empleado");
            System.out.println("2)Imprimir Lista");
            System.out.println("3)Desactivar Empleado");
            System.out.println("4)Guardar Empleados");
         
            System.out.println("5)Salir");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    
                {
                    System.out.println("Agregar Empleado");
                    System.out.println("");
                       System.out.println("Ingrese su codigo: ");
                    int codigo =leer.nextInt();
                    System.out.println("Ingrese su nombre: ");
                    String nombre =leer.nextLine();
                    leer.nextLine();
                    System.out.println("Ingrese su Salario: ");
                    float salario = leer.nextFloat();
                    
                   
                  empleado.agregarNodo(codigo, nombre, salario);
                  
                    
                  
                }
            
                
                    break;
                case 2:
                    System.out.println("Imprimir Lista: ");
            
                   
                  empleado.imprimirLista();
               
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Desactivar Empleado ");
                    System.out.println("Ingrese codigo de empleado: ");
                    int codigo= leer.nextInt();
                    empleado.desactivarEmpleado(codigo);
                    break;
                case 4:
                    System.out.println("Guardar Empleados");
                    empleado.guardarEmpleados();
                    break;
            }    
             
        }while(opcion!=5);
        
    
    }

        }