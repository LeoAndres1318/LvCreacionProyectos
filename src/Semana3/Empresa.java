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
 * @author Karol Ayestas
 */
public class Empresa {
    private String nombreEmpresa;
    String tipo;
    
    ArrayList<EmpleadoPorComision> empleados ;

    public Empresa(String nombreEmpresa,String tipo) {
        this.nombreEmpresa = nombreEmpresa;
       empleados = new ArrayList<>();
       this.tipo=tipo;
    }

    public Empresa() {
        this.nombreEmpresa=" ";
    }
    
    
    public void agregarEmpleado(int numeroSeguroSocial,String tipo){
     
       
            if (buscarEmpleado(numeroSeguroSocial)==null) {
                if (tipo.equals("Empleado por comision")) {
                    empleados.add(new EmpleadoPorComision());
                    System.out.println("Empleado por comision agregado");
                }else if (tipo.equals("Empleado base mas comision")) {
                    empleados.add(new EmpleadoBaseMasComision());
                    System.out.println("Empleado base mas comision agregado");
                }
                    
                
            }
           
                
            
            else
                System.out.println("Empleado Agregado Incorrectamente");
        
            
    }  
    
    
    public void obtenerTotalPlanillaxTipoEmpleado(){
       
         ArrayList<?> coll= new ArrayList<>();
                for (Object em:coll) {
                    
                
                if (em instanceof EmpleadoPorComision) {
                 ((Empresa) em).obtenerTotalPlanillaxTipoEmpleado();
                 ((EmpleadoPorComision) em).Ingresos();
                }
               
                }
    }
    
    public EmpleadoPorComision buscarEmpleado(int numeroSeguroSocial){
        
    
        for (EmpleadoPorComision id:empleados ) {
            if (id.getNumeroSeguroSocial()==numeroSeguroSocial ) {
                return id;
                
            }
           
        }
        
    return null;
    }
}
