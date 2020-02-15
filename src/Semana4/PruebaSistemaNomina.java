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
public class PruebaSistemaNomina {

    public static void main(String[] args) {
        
        
        EmpleadoAsalariado empleadoAsalariado= new EmpleadoAsalariado("Jonh","Smith","1111-1111-111",800.00);
        EmpleadoPorHoras empleadoporhoras= new EmpleadoPorHoras("Karen", "Price","2222-2222-222",16.75,40);
        EmpleadoPorComision empleadoporcomision= new EmpleadoPorComision("Sue", "Jones","333-3333-3333",10000,.06);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Bob","Lewis","444-4444-444",5000,.04,300);
        
        System.out.println(" Empleados ´procesados por separada: ");
        System.out.printf("%n%s%n%s: $%,.2f%n%n",empleadoAsalariado,"ingresos",empleadoAsalariado.ingresos());
        System.out.printf("%s%n%s: $%,.2f%n%n",empleadoporhoras,"ingresos",empleadoporhoras.ingresos());
        System.out.printf("%s%n%s: $%,.2f%n%n",empleadoporcomision,"ingresos",empleadoporcomision.ingresos());
        System.out.printf("s%n%%s: $%.2f%n%n",empleadoBaseMasComision,"ingresos",empleadoBaseMasComision.ingresos());
        
        //crea in arreglo Empleado para cuatro elementos
        Empleado[] empleados= new Empleado[4];
        
        //inicializa el arreglo con objetos Empleado
        empleados[0]= empleadoAsalariado;
        empleados[1]= empleadoporhoras;
        empleados[2]=empleadoporcomision;
        empleados[3]=empleadoBaseMasComision;
        
        System.out.println("Empleados procesados en forma polimorfica:%n%n");
        //Procesa en forma generica a cada elemento en el arreglo de empleados
        for (Empleado empleadoActual: empleados) {
            System.out.println(empleadoActual); //Invoca a toString
            
            //Determina si el elemento es un EmpleadoBaseMasComision
            if (empleadoActual instanceof EmpleadoBaseMasComision) {
                
                //Conversion descendeente de la referencia de Empleado
                //a una referencia de EmpleadoBaseMasComision
                EmpleadoBaseMasComision empleado=(EmpleadoBaseMasComision) empleadoActual;
                empleado.setSalarioBase(1.10*empleado.getSalarioBase());
                
                System.out.printf("El numero salario base con 10%% de un aumento es: $%,.2f%n",empleado.getSalarioBase());
                
            }//fin del if
            System.out.printf("ingresos $%,.2f%n%n",empleadoActual.ingresos());
            
            
        }//fin del for
        
        //Obtiene el nombre del tipo de cada objeto en el arreglo de empleados
        for (int i = 0;i <  empleados.length; i++) {
            System.out.printf("El empleado %d es un %s%n",i,empleados[i].getClass().getName());
            
        }
    }
    
     
             
}