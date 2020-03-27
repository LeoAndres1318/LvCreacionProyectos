/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana10;

/**
 *
 * @author HP
 */
public class Empleado {

private int codigoEmpleado;
private String nombreEmpleado;
private float salario;
private boolean activo;
private Empleado siguiente;

    public Empleado(int codigoEmpleado, String nombreEmpleado, float salario, boolean activo, Empleado siguiente) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.salario = salario;
        this.activo = activo;
        this.siguiente = siguiente;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Empleado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Empleado siguiente) {
        this.siguiente = siguiente;
    }


   
    public String ImprimirEmpleado() {
        return "Empleado: { código: "+codigoEmpleado+", nombre: "+nombreEmpleado+", salario: "+salario+" }";
    }
   
}
