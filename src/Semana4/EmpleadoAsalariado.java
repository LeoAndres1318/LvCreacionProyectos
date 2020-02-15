/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;

/**
 *
 * @author HP
 */
public class EmpleadoAsalariado extends Empleado {
private double salarioSemanal;

    
    
     public EmpleadoAsalariado( String primerNombre, String apellidoPaterno, String numeroSeguroSocial,double salarioSemanal) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
       
        
         if(salarioSemanal<0.0)
             throw new IllegalArgumentException(
             "El salario semanala debe de ser mayor a cero"  );
                     
           
         this.salarioSemanal=salarioSemanal;
                     
    }
     
     //establece el salario
     public void setsalarioSemanal(double salarioSemanal){
         if (salarioSemanal<0.0) 
             throw new IllegalArgumentException("El salario semanal debe ser mayor a 0");
             this.salarioSemanal=salarioSemanal;
         
     }
     
     //Devuelve el salario
     public double getSalarioSemanal(){
         return salarioSemanal;
         
     }
     
     //Calcula los ingresos; sobrescribe el metodo abtracto ingresos de la clase Empleado
     
     
    @Override
    public double ingresos() {
        return getSalarioSemanal();
        
    }
    
    //devuelve la representacion String de un objeto EmpleadoAsalariado

    @Override
    public String toString() {
      return String.format("Empleado asalariado: %s%n%s: $%,.2f",super.toString(),"Salario Semanal",getSalarioSemanal());
      
    }
    //fin de la clase EmpleadoSalario
    

   


    
}
