

package Semana2;
import java.util.Scanner;
public class BusquedaBinaria {
    static void imprimirarreglo(int arreglo[]){
        for (int valor: arreglo) {
            System.out.printf("[%d] ",valor);
        }
        System.out.println("");
    }
    
    
    static int busquedaBinaria(int buscar,int arreglo[], int inicio, int fin){
        
        if (fin<inicio) 
            return -1;
            
            
        int pivote=((inicio+fin)/2);
        if (arreglo[pivote] ==buscar) 
            return pivote;
        
        else if (buscar>arreglo[pivote]) 
            return busquedaBinaria(buscar,arreglo, pivote + 1,fin);
            
        else
        return busquedaBinaria(buscar,arreglo,inicio, pivote -1);
        
    }
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("***BUSQUEDA BINARIA***");
        
        int[] arreglo=new int[10];
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("Ingrese valor en array[%d] ",i);
            arreglo[i]=leer.nextInt();
        }
        
   imprimirarreglo(arreglo);
   
        System.out.println("Ingrese valor a buscar: ");
        int buscar=leer.nextInt();
        
        int busqueda=busquedaBinaria(buscar,arreglo,0,arreglo.length);
        
        if (busqueda==-1) {
            System.out.println("Valor no encontrado en arreglo");
        }else{
            System.out.printf("Valor encontrado en array[%d] %n", busqueda);
        }
   
}
}