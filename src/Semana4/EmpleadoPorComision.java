/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;

import java.util.Locale;

/**
 *
 * @author HP
 */
public class EmpleadoPorComision extends Empleado {
  private double ventasBrutas; //ventas totales por semana
  private double tarifaComision;// POrcentaje de comision 

    public EmpleadoPorComision( String primerNombre, String apellidoPaterno, String numeroSeguroSocial,double ventasBrutas, double tarifaComision) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        
        if (tarifaComision <=0.0 || tarifaComision>=1.0)// validar 
        throw new IllegalArgumentException("La tarifa de comision debe ser entre 0.0 y 1.0");
        
        if (ventasBrutas<0.0) 
            throw new IllegalArgumentException("Las ventas brutas deben ser mayor o iguales a 0 ");
         this.ventasBrutas = ventasBrutas;
          this.tarifaComision = tarifaComision;
       
    }
    
    public void setVentasBrutas(double ventasBrutas){
        if (ventasBrutas<0.0) 
            throw new IllegalArgumentException("Las ventas brutas deben ser mayor a 0");
        this.ventasBrutas=ventasBrutas;
                
    }
    
    //devuelve la tarifa de comision
    public double getVentasBrutas(){
        return ventasBrutas;
    }
    
    //Establece la tarifa de comision
    public void setTarifaComision( double tarifaComision){
        if (tarifaComision<=0.0 || tarifaComision>=1.0) //valida 
            throw new IllegalArgumentException("La tarifa debe ser entre 0.0 y 1.0");
            this.tarifaComision=tarifaComision;
            
        
    }
    //devuelve la tarifa de Comision
    public double getTarifaComision(){
        
        return tarifaComision;
    }

    //Calcula los ingresos
    @Override
    public double ingresos() {
        return getTarifaComision() * getVentasBrutas();
        
    }
        
    //Devuelve la representacion String  de un Objeto EmpleadoPor Comision

    @Override
    public String toString() {
       return String.format("%s: %s%n%s: $%,.2f; %s: %.2f","Empleado por Comision", super.toString(),"Ventas Brutas",getVentasBrutas(),"Tarifa de Comision",getTarifaComision());
    }
    
     
    
}
