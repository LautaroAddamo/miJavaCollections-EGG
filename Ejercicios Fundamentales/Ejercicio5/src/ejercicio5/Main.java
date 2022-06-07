package ejercicio5;

import Servicios.PaisesServicios;
import java.util.Scanner;

public class Main {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        PaisesServicios ps = new PaisesServicios();
        String opc;

        do {
            ps.crearPaises();
            System.out.println("Desea ingresar otro pais? (SI/NO");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("no"));
        System.out.println("LOS PAISES INGRESADOS SON");
        ps.mostrarPaises();
        System.out.println("-----");
        System.out.println("ORDENADOS ALFABETICAMENTE");
        ps.ordenarPaises();
        System.out.println("-----");
        
        ps.eliminarPais();
        System.out.println("-----");
        
        

    }
}


