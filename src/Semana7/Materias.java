/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana7;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author HP
 */
public class Materias {
    private File materiaArchivo;
    private RandomAccessFile materiaBinario;

    public Materias() {
        materiaArchivo = new File("materia.dat");
        //alumnosBinario= new RandomAccessFile(alumnosArchivo,"rw");
    }
    
     public void agregarMateria(String _codigo, String _nombre, int _uv){
        try{
            materiaBinario= new RandomAccessFile(materiaArchivo,"rw");
            
            //ubicarse al final del archivo
            materiaBinario.seek(materiaBinario.length());
            
            materiaBinario.writeUTF(_codigo);
            materiaBinario.writeUTF(_nombre);
            materiaBinario.writeInt(_uv);
            
            materiaBinario.close();
            
            System.out.println("¡Materia Ingresada Correctamente!");
        }catch(IOException e){
            System.out.println("Error de Lectura/Escritura en archivo");
        }
    }
     
     public void ImprimirAlumnos(){
        try{
            materiaBinario = new RandomAccessFile("materia.dat","r");
            materiaBinario.seek(0);
            while(materiaBinario.getFilePointer()<materiaBinario.length()){
                int cuenta=materiaBinario.readInt();
                String nombre=materiaBinario.readUTF();
                int edad = materiaBinario.readInt();
                
                System.out.printf("Materia { codigo de la clase: %d,clase: %s, uv: %d}%n",cuenta,nombre,edad);
                
                
            }
            materiaBinario.close();
        }catch(IOException e){
            System.out.println("Error de Lectura/Escritura en Archivo");
        }
    }
}
