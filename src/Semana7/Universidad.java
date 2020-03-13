/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana7;

/**
 *
 * @author HP
 */
public class Universidad {
    
    public static void main(String[] args) {
        
        Alumno universidad= new Alumno();
        
        universidad.agregarAlumno(2101, "Mario", 19);
        //universidad.agregarAlumno(2102, "Julia", 21);
        //universidad.agregarAlumno(2103, "Victor", 16);
        
       universidad.modificarAlumno(2123, 25);
        universidad.imprimirAlumnos();
    }
}
