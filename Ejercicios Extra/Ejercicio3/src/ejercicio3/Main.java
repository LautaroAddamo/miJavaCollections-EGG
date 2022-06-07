package ejercicio3;

import Servicios.LibroServicios;
import java.util.Scanner;

public class Main {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        LibroServicios ls = new LibroServicios();
        String opc = "";
        int menu;
        do {
            System.out.println("MENU\n"
                    + "Elija una opcion\n"
                    + "1.Cargar libros\n"
                    + "2.Mostrar libreria\n"
                    + "3.Prestamo\n"
                    + "4.Devolucion\n"
                    + "5.Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    ls.cargarLibreria();
                    break;
                case 2:
                   ls.mostrarLibreria();
                    break;
                case 3:
                    if (ls.prestamo()) {
                        System.out.println("Prestamo realizado");
                    } else {
                        System.out.println("Prestamo no realizado");
                    }
                    break;
                case 4:
                    if (ls.devolucion()) {
                        System.out.println("Devolucion realizada");
                    } else {
                        System.out.println("Devolucion no realizada");
                    }
                    break;
                case 5:
                    System.out.println("Desea salir? SI/NO");
                    opc = leer.next();
            }

        } while (!opc.equalsIgnoreCase("si"));
    }

}
