package Servicios;

import Entidades.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisesServicios {

    private static HashSet<Paises> setPaises = new HashSet<>();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPaises() {
        Paises crear = new Paises();

        System.out.println("Ingrese un pais");
        crear.setPaises(leer.next());
        setPaises.add(new Paises(crear.getPaises()));

    }

    public void mostrarPaises() {
        for (Paises setPaise : setPaises) {
            System.out.println(setPaise);
        }
    }
    public Comparator<Paises> ordenPaises = new Comparator<Paises>() {
        @Override
        public int compare(Paises p1, Paises p2) {
            return p1.getPaises().compareTo(p2.getPaises());
        }

    };

    public void ordenarPaises() {
        ArrayList<Paises> listaPaises = new ArrayList(setPaises);
        listaPaises.sort(ordenPaises);
        for (Paises listaPaise : listaPaises) {
            System.out.println(listaPaise);
        }

    }

    public void eliminarPais() {
        System.out.println("Ingrese el pais que desea buscar");
        String pais = leer.next();
        Iterator<Paises> it = setPaises.iterator();
int cont = 0;
        while (it.hasNext()) {
            Paises aux = it.next();
            if (aux.getPaises().equals(pais)) {
                it.remove();
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("El pais buscado no se encuentra en su conjunto");
        }
        for (Paises var : setPaises) {
            System.out.println(var);
        }
    }
}
