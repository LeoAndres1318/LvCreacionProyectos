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
public class Notas {
    
     
    private File notasArchivo;
    private RandomAccessFile notasBinario;

    public Notas() {
        try {
             notasArchivo= new File("notas.dat");
             notasBinario= new RandomAccessFile(notasArchivo,"rw");
        } catch (Exception e) {
            System.out.println("Error de lectura");
        }
       
        
        
        
    }
    
    public void agregarNota(int _cuenta,String _nombre,double nota){
        try{
            notasBinario= new RandomAccessFile(notasArchivo,"rw");
            //Ubicar al final del archivo
            notasBinario.seek(notasBinario.length());
            notasBinario.writeInt(_cuenta);
            notasBinario.writeUTF(_nombre);
            notasBinario.writeDouble(nota);
            
            notasBinario.close();
            
            System.out.println("Alumno ingresado correctamente");
            
            
        } catch (Exception e) {
            System.out.println("Error de LECTURA/ESCRITURA en archivo");
        }
        
    }
    
    public void imprimirNotas(){
        try {
            
            notasBinario= new RandomAccessFile("notas.dat","r");
            notasBinario.seek(0);
            while(notasBinario.getFilePointer()<notasBinario.length()){
                int _cuenta= notasBinario.readInt();
                String _nombre= notasBinario.readUTF();
                double valor= notasBinario.readDouble();
                System.out.printf("Nota[cuenta: %d, nombre: %s, edad: %f]%n",_cuenta,_nombre,valor);
                
                
            }
            notasBinario.close();
            
        } catch (Exception e) {
            System.out.println("Error de LECTURA/ESCRITURA en archivo");
        }
        
    }
    
    public void modificarNota(int _cuenta,double nota){
        
        try {
            notasBinario= new RandomAccessFile(notasArchivo,"rw");
            notasBinario.seek(0);
            while(notasBinario.getFilePointer()<notasBinario.length() ){
                
                 int _cuentaTmp= notasBinario.readInt();    
                 String _nombreTmp= notasBinario.readUTF();
                 long posicion=notasBinario.getFilePointer();
                 double nota1= notasBinario.readDouble();
                 
                if (_cuentaTmp==_cuenta) {
                   // alumnosBinario.seek(alumnosBinario.getFilePointer() -2 -4);
                   notasBinario.seek(posicion);
                    notasBinario.writeDouble(nota);
                    notasBinario.close();
                    
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
