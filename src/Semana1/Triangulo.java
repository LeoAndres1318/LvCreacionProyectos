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
public class Triangulo extends FiguraBidimensional{
    private double base,altura;
    public Triangulo(double area,double base, double altura) {
        super(area);
        this.base=base;
        this.altura=altura;
        
    }

    @Override
    public double calcularArea() {
        double areaTriangulo=((this.base*this.altura)/2);
        return areaTriangulo; 
    }
    
    public double calcularPerimetro(){
        
        double perimetro=(this.base*3);
        
        return perimetro;
    }
    
    
}
