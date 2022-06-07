package ejercicio6;

import Servicios.TiendaServicios;
import java.util.Scanner;

public class Main {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        TiendaServicios ts = new TiendaServicios();
        String opc2 = "";
        
        do {
            System.out.println("MENU\n"
                    + "Indique una opcion");
            System.out.println("1.Cargar productos\n"
                    + "2.Mostrar la lista de productos\n"
                    + "3.Modificar el precio de un producto\n"
                    + "4.Elminar un producto de la lista\n"
                    + "5.SALIR\n");
            int opc = leer.nextInt();
            switch (opc) {
                case 1:

                    ts.cargarProductos();
                    break;
                case 2:
                    ts.mostrarTienda();
                    break;
                case 3:
                    ts.modificarPrecio();
                    break;
                case 4:
                    ts.elminarProducto();
                    break;
                case 5:
                    System.out.println("Desea salir? (SI/NO)");
                    opc2 = leer.next();
                    break;

            }

        } while (!opc2.equalsIgnoreCase("si"));

    }
}
