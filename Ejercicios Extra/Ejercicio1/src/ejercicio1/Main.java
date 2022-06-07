
package ejercicio1;

import Servicios.NumeroServicios;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        NumeroServicios ls = new NumeroServicios();
        
        ls.cargarLista();
        
        ls.mostrarLista();
        
        System.out.println("La suma de los numeros ingresados es "+ls.sumaLista());
        System.out.println("El promedio de la lista es "+ls.promedioLista(ls.sumaLista()));
    }
    
}
