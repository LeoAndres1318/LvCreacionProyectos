/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana7;

import java.io.File;
import java.io.RandomAccessFile;
/**
 *
 * @author HP
 */
public class Alumno {
    
    private File alumnosArchivo;
    private RandomAccessFile alumnosBinario;

    public Alumno() {
        try {
             alumnosArchivo= new File("alumnos.dat");
             alumnosBinario= new RandomAccessFile(alumnosArchivo,"rw");
        } catch (Exception e) {
            System.out.println("Error de lectura");
        }
       
        
        
        
    }
    
    public void agregarAlumno(int _cuenta,String _nombre,int _edad){
        try{
            alumnosBinario= new RandomAccessFile(alumnosArchivo,"rw");
            //Ubicar al final del archivo
            alumnosBinario.seek(alumnosBinario.length());
            alumnosBinario.writeInt(_cuenta);
            alumnosBinario.writeUTF(_nombre);
            alumnosBinario.writeInt(_edad);
            
            alumnosBinario.close();
            
            System.out.println("Alumno ingresado correctamente");
            
            
        } catch (Exception e) {
            System.out.println("Error de LECTURA/ESCRITURA en archivo");
        }
        
    }
    
    public void imprimirAlumnos(){
        try {
            
            alumnosBinario= new RandomAccessFile("alumnos.dat","r");
            alumnosBinario.seek(0);
            while(alumnosBinario.getFilePointer()<alumnosBinario.length()){
                int _codigo= alumnosBinario.readInt();
                String _nombre= alumnosBinario.readUTF();
                int _edad= alumnosBinario.readInt();
                System.out.printf("Alumno[cuenta: %d, nombre: %s, edad: %d]%n",_codigo,_nombre,_edad);
                
                
            }
            alumnosBinario.close();
            
        } catch (Exception e) {
            System.out.println("Error de LECTURA/ESCRITURA en archivo");
        }
        
    }
    
    public void modificarAlumno(int _cuenta,int _edad){
        
        try {
            alumnosBinario= new RandomAccessFile(alumnosArchivo,"rw");
            alumnosBinario.seek(0);
            while(alumnosBinario.getFilePointer()<alumnosBinario.length() ){
                
                 int _cuentaTmp= alumnosBinario.readInt();    
                 String _nombreTmp= alumnosBinario.readUTF();
                 long posicion=alumnosBinario.getFilePointer();
                 int _edadTmp=alumnosBinario.readInt();
                 
                if (_cuentaTmp==_cuenta) {
                   // alumnosBinario.seek(alumnosBinario.getFilePointer() -2 -4);
                   alumnosBinario.seek(posicion);
                    alumnosBinario.writeInt(_edad);
                    alumnosBinario.close();
                    
                    System.out.println("Registro modificado correctamente"); 
                    return;
                }
  
            }
            System.out.println("Alumnos a modificar no existe");
            
               
                
            
        } catch (Exception e) {
            System.out.println("Error de lectura y escritura en archivo");
        }
    }
    
    
    
}
