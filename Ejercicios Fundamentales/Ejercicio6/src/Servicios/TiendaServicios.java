package Servicios;

import Entidades.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServicios {

    private HashMap<String, Double> productos = new HashMap<>();
    final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarProductos() {
        Tienda crear = new Tienda();
        String opc;
        do {
            System.out.println("Ingrese el nombre del producto");
            String llave = leer.next();
            System.out.println("Ingrese el precio");
            crear.setPrecio(leer.nextDouble());

            //Primero pongo la key, y luego el objeto
            productos.put(llave, crear.getPrecio());
            System.out.println("Desea cargar otro? (SI/NO)");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("no"));

    }

    public void mostrarTienda() {
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            System.out.println("Producto: " + aux.getKey() + ". " + aux.getValue());

        }
    }

    public void elminarProducto() {
        System.out.println("Que producto desea elminar?");
        String producto = leer.next();

        productos.remove(producto);
        System.out.println("Elimino el producto" + producto);
    }

    public void modificarPrecio() {
        System.out.println("Ingrese el nombre del producto que desea modificar");
        String producto = leer.next();
        System.out.println("Ingrese el nuevo precio");
        double nuevoPrecio = leer.nextDouble();

        productos.replace(producto, nuevoPrecio);
    }

}
