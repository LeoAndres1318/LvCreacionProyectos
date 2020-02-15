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
public class EmpleadoPorHoras extends Empleado {

   private double sueldo; //Sueldo por hora
   private double horas; //Horas trabajadas por semana

    public EmpleadoPorHoras( String primerNombre, String apellidoPaterno, String numeroSeguroSocial,double sueldo, double horas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        
        if(sueldo<0.0)
            throw new IllegalArgumentException("El sueldo por hora tiene que ser mayor a 0");
        if ((horas<0.0) || (horas>168.0)) //Valida Horas
            throw new IllegalArgumentException("Las horas deben ser entre 0 y 168");
        
        this.sueldo = sueldo;
        this.horas = horas;
    }
   // Establece el sueldo
   public void setSueldo(double sueldo){
       if (sueldo<0.0) 
       throw new IllegalArgumentException("El sueldo debe ser mayor a 0");    
       this.sueldo=sueldo;
       
       
   }
//devuelve el sueldo
   public double getSueldo(){
       return sueldo;
   }
   
   //Establece las horas trabajadas
   public void setHoras(double horas){
       if ((horas<0.0 || horas>168.0)) 
           throw new IllegalArgumentException("Las horas deben ser entre 0.0 y 168.0");
       
       this.horas=horas;
   }
   //Devuelve las horas
   public double getHoras(){
       return horas;
   }
   
  
   
    @Override
    public double ingresos() {
        if (getHoras()<=40) //No hay tiempo extra
       return getSueldo() * getHoras();
        else
            return 40 * getSueldo() + (getHoras() - 40)* getSueldo()*1.5; 
    }
    
    //Devuelve la representacion String de un objeto EmpleadoPor Horas
   @Override
    public String toString(){
        return String.format("Empleado por horas: %s%n%s:  $%,.2f; %s: %,.2f",super.toString(),"Sueldo por hora", getSueldo(),"Horas Trabajadas",getHoras());
    }

}
    
    
  
    

