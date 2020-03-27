/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana10;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Calendar;

/**
 *
 * @author HP
 */
public class ListaEmpleados {

Empleado primero;
 private File Archivo;
  private RandomAccessFile ArchivoBinario;
RandomAccessFile activos;

ListaEmpleados(){
    this.primero= null;
   Archivo=new File("Empleados.bin");
}

    public Empleado getPrimero() {
        return primero;
    }
  private boolean estaVacia(){
        return primero==null;
    }
    
    public void agregarNodo(int codigo, String nombre, float salario){
     
        Empleado nuevo = new Empleado(codigo,nombre,salario,true,null);
       
        
       
        if(estaVacia()){
            primero = nuevo;
        }else{
           
            Empleado actual = primero;
            
            while(actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        System.out.println("Nodo agregado a la Lista");
    }
    
    public void imprimirLista(){
          if(estaVacia())
            return;
        else{
            Empleado actual = primero;
            Empleado anterior = null;
            
            while(actual!=null){
                if(actual.isActivo() == true){
                    Empleado empleado = new Empleado(actual.getCodigoEmpleado(), actual.getNombreEmpleado(),
                    actual.getSalario(), true,  actual.getSiguiente());
                    System.out.println(empleado.ImprimirEmpleado());
                }
                actual = actual.getSiguiente();
            }
        }
    }
      
        
    
      
      public void desactivarEmpleado(int codigo){
          if(estaVacia()){
              return;
          }
          else{
              Empleado actual= primero;
              Empleado anterior= null;
              while(actual!=null){
                  if(actual.getCodigoEmpleado()==codigo){
                    actual.setActivo(false);
                      System.out.println("Empleado : "+ actual.getNombreEmpleado()+ " desactivado");
                      return;
                  }
                  anterior=actual;
                    actual=actual.getSiguiente();
                  }
              }
          }
    
      
     
   
    
   public void guardarEmpleados(){
   if(estaVacia()){
            return;
        }else{
           Empleado actual = primero;
           Empleado anterior = null;
            while(actual != null){
                if(actual.isActivo()==true){
          try{
            ArchivoBinario= new RandomAccessFile(Archivo,"rw");
            ArchivoBinario.seek(ArchivoBinario.length());   
            ArchivoBinario.writeInt(actual.getCodigoEmpleado());
            ArchivoBinario.writeUTF(actual.getNombreEmpleado());
            ArchivoBinario.writeFloat(actual.getSalario());
           
         
            
            
            ArchivoBinario.close();
            
            System.out.println("Se ingreso correctamente");
        }catch(IOException e){
            System.out.println("Error al ingresar los datos");
        }
                }
                anterior=actual;
                
                actual=actual.getSiguiente();
            }
        }
      }
      
   
      
}
