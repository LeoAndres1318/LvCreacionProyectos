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
public abstract class Empleado {
    
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }
    
    //Devuelve la representacion de un String de un objeto Empleado 
    @Override
    public String toString(){
        
        return String.format("%s %s%numero de seguro social: %s",getPrimerNombre(),getApellidoPaterno(),getNumeroSeguroSocial());
        
    }
    
    //Metodo abstracto sobrescrito por las subclases concretas 
    public abstract double ingresos();
        //Aqui no hay ninguna implementacion indicada 
        
    

//fin de la clase Empleado
}