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
public class Cuadrado extends FiguraBidimensional{
    private double base,altura;
    public Cuadrado(double area,double base, double altura) {
        super(area);
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double calcularArea() {
        
       double areaCuadrado=(this.base*this.altura);
       
        return areaCuadrado; 
    }
    
    public double calcularPerimetro(){
        
        double perimetroCuadrado= (this.base*4);
        
        return perimetroCuadrado;
    }
    
    
    
}
