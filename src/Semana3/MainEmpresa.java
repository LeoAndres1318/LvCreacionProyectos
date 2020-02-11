/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MainEmpresa {
   
         
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
   
          int opcion=0;
          do{
          System.out.println("MENU");
          System.out.println("1. Agregar empleado");
          System.out.println("2. Pbtener Planilla");
          System.out.println("3. Buscar Empleado");
              System.out.println("4. Salir");
          System.out.println("Ingrese opcion: ");
           opcion=leer.nextInt();
          
          
        switch(opcion){
            
            
            case 1:
            {
            Empresa em= new Empresa();
            System.out.println("Agregar Empleado: ");
            int numeroSocial=leer.nextInt();
            System.out.println("Tipo de empleado: ");
            String tipo=leer.nextLine();
          
            em.agregarEmpleado(numeroSocial,tipo);
            
                
                
            }
            break;
            case 2:
                System.out.println("Obtener total planilla");
               Empresa em= new Empresa();
               em.obtenerTotalPlanillaxTipoEmpleado();
                break;
            case 3:
                Empresa emp= new Empresa();
                System.out.println("Buscar empleado: ");
                int empleado= leer.nextInt();
                emp.buscarEmpleado(empleado);
                System.out.println("");
                emp.empleados.toString();
                
                break;
                
          
                
        }
    }while(opcion!=4);    
       
               
       
    
    }
}
