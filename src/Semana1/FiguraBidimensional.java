/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana1;

/**
 *
 * @author HP
 */
public class FiguraBidimensional extends Figura {

protected double area;
    
    public FiguraBidimensional(double area){
        this.area=area;
        
        
    }
public double calcularArea(){
    
    return this.area;
}
}
