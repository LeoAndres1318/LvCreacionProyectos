/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

/**
 *
 * @author HP
 */
public class EmpleadoPorComision extends Object {
    
    private String primerNombre;
    private String apellidoPaterno;
    private int numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision() {
        this.primerNombre=" ";
        this.apellidoPaterno=" ";
        this.numeroSeguroSocial=0;
        this.tarifaComision=0.0;
        this.ventasBrutas=0.0;
    }

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, int numeroSeguroSocial, double ventasBrutas, double tarifaComision) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

  
    

    public int getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(int numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

   

    public double getTarifaComision() {
        return tarifaComision;
    }

   
    
    public void establecerVentasBrutas(double _ventasBrutas ){
        try{
        if (_ventasBrutas>0){
            this.ventasBrutas=_ventasBrutas;
        }
            
        }catch(IllegalArgumentException e){
            System.out.println("Las ventas deben ser mayor a cero" + e);
        }
        
        
    } public void establecerTarifaComision(double _tarifaComision){
        
            try{
        if (_tarifaComision>0 && _tarifaComision<1){
            this.ventasBrutas=_tarifaComision;
        }
            
        }catch(IllegalArgumentException e){
            System.out.println("La tarifa de comision debe ser entre 0 y 1" + e);
        }
        }
    
    public double Ingresos(){
      return  this.getTarifaComision()*this.getVentasBrutas();
        
            
   
        
    }
    
     @Override
      public String toString(){
         
          return "Empleado por comision: "+ this.getPrimerNombre() + " " + this.getApellidoPaterno()  +  "\nNumero de Seguro Social: "+ this.getNumeroSeguroSocial()+ "\nVentasBrutas: " + this.getVentasBrutas() + "\nTarifa de Comision: " + this.getTarifaComision()+ "\n";
      }
}

