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
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
 private double salarioBase;

    public EmpleadoBaseMasComision( String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas, double tarifaComision,double salarioBase) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas,tarifaComision);
        
        if (salarioBase<0.0)
            throw new IllegalArgumentException("El salario base debe de ser mayor a 0");
        
            this.salarioBase = salarioBase;
        
    }
    
    public void setSalarioBase(double salarioBase){
        if (salarioBase<0.0) 
        throw new IllegalArgumentException("El salario base debe de ser mayor a 0");    
        this.salarioBase=salarioBase;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    //Calcula los ingresos, sobrescribe el metodo ingresos de Empleado por Comision
 @Override
    public double ingresos(){
        return getSalarioBase() + super.ingresos();
    }
    

    @Override
    public String toString() {
      return String.format("%s %s; %s: $%,.2f","Con salario Base", super.toString(),"Salario Base",getSalarioBase());
    }
 
    
}
