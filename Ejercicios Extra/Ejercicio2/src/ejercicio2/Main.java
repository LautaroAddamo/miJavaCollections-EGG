package ejercicio2;

import Servicios.CantanteFamosoServicios;
import java.util.Scanner;

public class Main {

    final static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        CantanteFamosoServicios cds = new CantanteFamosoServicios();
        for (int i = 0; i < 5; i++) {
            cds.agregarCantante();
        }
        String opc2 = "";
        do {
            cds.menu();
            int opc = leer.nextInt();

            switch (opc) {
                case 1:
                    cds.agregarCantante();
                    break;
                case 2:
                    cds.eliminarCantante();
                    break;
                case 3:
                    cds.mostrarLista();
                    break;
                case 4:
                    System.out.println("Desea salir?(SI/NO)");
                    opc2 = leer.next();
                    break;
            }
        } while (!opc2.equalsIgnoreCase("si"));

    }

}
