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
public class Circulo extends FiguraBidimensional {
    
    private double radio;

    public Circulo(double area, double radio) {
        super(area);
        this.radio=radio;
    }
    
public double calcularPerimetro(){
  double perimetro=(2*this.radio);
  double perimetro_=(perimetro*3.14);
  return perimetro_;
}

    @Override
    public double calcularArea(){
    
       double areaCirculo=(this.radio*2);
       double areaCirculo_=(areaCirculo*3.14);
       
       return areaCirculo_;
}
}
