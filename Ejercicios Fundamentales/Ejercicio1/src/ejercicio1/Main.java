
package ejercicio1;// Y EJERCICIO 2

import Servicios.PerroServicios;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PerroServicios ps = new PerroServicios();//Creo un objeto para acceder a los servicios
        String opcion;
        
        do{
            ps.cargarPerro();//Llamo al metodo para cargar la lista que se va a repetir hasta salir del dowhile
            System.out.println("Desea guardar otra raza?\n"
                    + "Escriba s para guardar otra\n"
                    + "Escriba n para salir");
            opcion = leer.next();
            
        }while(!opcion.equals("n"));
        
        ps.mostrarLista();//Muestro la lista
        
        System.out.println("Ingrese la RAZA que desea eliminar de la lista");
        String eliminar = leer.next();
        ps.elminarDeLista(eliminar);//Elimino un objeto de la lista
        ps.mostrarLista();//Muestro la lista
        
    }
    
}
