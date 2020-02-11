/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

/**
 *
 * @author Karol Ayestas
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;

    public EmpleadoBaseMasComision() {
        this.salarioBase=0.0;
    }

    public EmpleadoBaseMasComision(double salarioBase, String primerNombre, String apellidoPaterno, int numeroSeguroSocial, double ventasBrutas, double tarifaComision) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;}
    
    public void setSalarioBase(double salarioBase) {
        try{
            if(salarioBase > 0){
                salarioBase += salarioBase;
            }
        }catch(IllegalArgumentException e){
            System.out.println("Errror, El salario tiene que ser "
                    + "mayor a 0.");}
        /*Otra opcion en lugar de usar try catch.
        throw new IllegalArgumentException("");*/
    }

    @Override
    public String toString() {
        return super.toString()+"Salario Base: "+this.getSalarioBase();
    }

    @Override
    public double Ingresos() {
        return super.Ingresos()+this.getSalarioBase();
    }
    
    
}
