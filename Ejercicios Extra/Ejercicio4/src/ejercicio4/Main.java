package ejercicio4;

import Entidades.CiudadesServicios;
import java.util.Scanner;

public class Main {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        CiudadesServicios cs = new CiudadesServicios();

        for (int i = 0; i < 10; i++) {
            System.out.println("Ciudad "+ (i+1));
            cs.cargarCiudades();
        }
        cs.mostrarCiudades();
        cs.buscarCiudad();
        cs.agregarCiudad();
        cs.mostrarCiudades();
        for (int i = 0; i < 3; i++) {
            
        cs.eliminarCiudades();
        }
        cs.mostrarCiudades();
    }

}
