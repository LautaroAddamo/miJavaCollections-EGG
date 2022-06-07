package Servicios;

import Entidades.Libro;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class LibroServicios {

    private static HashSet<Libro> Tienda;
    private static Scanner leer;

    public LibroServicios() {
        this.Tienda = new HashSet<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void cargarLibreria() {
        String opc;
        do {
            Libro crear = new Libro();
            System.out.println("Ingrese el titulo del libro");
            crear.setTitulo(leer.next());
            System.out.println("Ingrese el autor del libro");
            crear.setAutor(leer.next());
            System.out.println("Cuantos ejemplares hay en la libreria?");
            crear.setEjemplares(leer.nextInt());
            do {
                System.out.println("Cuantos ejemplares se han prestado?");
                crear.setEjemplaresPrestados(leer.nextInt());
                if (crear.getEjemplaresPrestados() > crear.getEjemplares()) {
                    System.out.println("Error");
                }
            } while (crear.getEjemplaresPrestados() > crear.getEjemplares());
            Tienda.add(crear);
            System.out.println("Desea cargar otro? SI/NO");
            opc = leer.next();

        } while (!opc.equalsIgnoreCase("no"));
    }

    public void mostrarLibreria() {
        if (Tienda.size() == 0) {
            System.out.println("La libreria esta vacia");
        } else {
            for (Libro aux : Tienda) {
                System.out.println(aux);
            }
        }
    }

    public boolean prestamo() {
        boolean prestamo = true;
        Iterator<Libro> it = Tienda.iterator();
        System.out.println("Ingrese el titulo del libro que desea");
        String aPrestar = leer.next();
        while (it.hasNext()) {
            Libro next = it.next();
            if ((next.getTitulo().equalsIgnoreCase(aPrestar))) {
                System.out.println("Libro a prestar: " + next.getTitulo());
                if (next.getEjemplaresPrestados() < next.getEjemplares()) {
                    System.out.println("Hay ejemplares disponibles");
                    next.setEjemplaresPrestados(next.getEjemplaresPrestados() + 1);
                } else {
                    System.out.println("No hay ejemplares disponibles");
                    prestamo = false;
                }
            } else {
                System.out.println("Libro no encontrado");
                prestamo = false;
            }
        }
        return prestamo;
    }

    public boolean devolucion() {
        boolean devolucion = true;
        Iterator<Libro> it = Tienda.iterator();
        System.out.println("Ingrese el titulo que va a devolver");
        String aDevoler = leer.next();
        while (it.hasNext()) {
            Libro next = it.next();
            if (next.getTitulo().equalsIgnoreCase(aDevoler)) {
                
                System.out.println("El libro a devolver: " + next.getTitulo());
                if (next.getEjemplaresPrestados() > 0) {
                    next.setEjemplaresPrestados(next.getEjemplaresPrestados() - 1);
                } else {
                    System.out.println("No hay ejemplares para devolver");
                    devolucion = false;
                }
            } else {
                System.out.println("Libro no encontrado");
                devolucion = false;
            }
        }
        return devolucion;
    }
}
