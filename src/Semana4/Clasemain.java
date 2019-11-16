/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Clasemain {
    
    public static void main(String[] args) {
        ArrayList<Directory> items= new ArrayList<Directory>();
     FileEntry ob= new FileEntry();

     FileType tipo=FileType.directory;
        int opcion=0;
        Scanner leer=new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Entrada de directory dinamicos");
            System.out.println("2. Entrada de files dinamicos");
            System.out.println("Ingrese opcion: ");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                {
                    System.out.println("Ingrese nombre del directorio: ");
                    String nombre=leer.nextLine();
                     leer.nextLine();
                    System.out.println("Ingrese tamaño: ");
                    int tamaño=leer.nextInt();
                   
                    tipo=FileType.directory;
                    if (tipo==FileType.directory) {
                        for (int i = 0; i < items.size(); i++) {
                        for(Directory item: items) {
                       
                            
                        item.qwert(nombre, tamaño);
                       
                         System.out.println("Archivo creado");
                     }
                        }
                     }else
                     {
                             System.out.println("No se creo correctamente");
                             }
                    }
                 
                break;
                case 2: 
                    System.out.println("Ingrese nombre del file: ");
                    String nombre= leer.nextLine();
                    leer.nextLine();
                    System.out.println("Ingrese tipo: ");
                    String tip= leer.next();
                    System.out.println("Ingrese tamaño: ");
                    int tamaño=leer.nextInt();
                    
                    if (tip.equals(tipo.file)) {
                         for(Directory item: items) {
                      item.addFile(nombre, tip, tamaño);
                         }
                    }else
                         {
                         System.out.println("No se pudo ingresar la informacion");
                                 }
                    break;
                case 3:
                    System.out.println("Ver ");
                    for (int i = 0; i < items.size(); i++) {
                        System.out.println(items.indexOf(i));
                    }
            }
                     break;
            
        }while(opcion!=3);
        
        
    
}
}