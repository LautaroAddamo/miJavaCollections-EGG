package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;

import java.util.Comparator;

import java.util.Scanner;

public class PeliculaServicios implements Comparable<Pelicula> {

    private static ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula cargarPelicula() {
        Pelicula crear = new Pelicula();
        System.out.println("Ingrese el titulo de la pelicula");
        crear.setTitulo(leer.next());
        System.out.println("Ingrese el director de la pelicula");
        crear.setDirector(leer.next());
        System.out.println("Ingrese la duracion en horas de la pelicula");
        crear.setDuracion(leer.nextInt());
        listaPeliculas.add(crear);
        return crear;
    }

    public void mostrarPeliculas() {
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
    }

    public void pelisLargas() {
        for (Pelicula listaPelicula : listaPeliculas) {
            if (listaPelicula.getDuracion() >= 1) {
                System.out.println(listaPelicula);
            }
        }
    }
    public Comparator<Pelicula> ordenMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDuracion() - p2.getDuracion();
        }
    };

    public void ordenMayor() {
        listaPeliculas.sort(ordenMayor);
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
    }
    public Comparator<Pelicula> ordenMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDuracion() - p1.getDuracion();
        }
    };

    public void ordenMenor() {
        listaPeliculas.sort(ordenMenor);
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
    }

    public Comparator<Pelicula> ordenTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }

    };

    public void ordenTitulo() {
        listaPeliculas.sort(ordenTitulo);
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
    }
    public Comparator<Pelicula> ordenDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };

    public void ordenDirector() {
        listaPeliculas.sort(ordenDirector);
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
    }

    @Override
    public int compareTo(Pelicula t) {

        return 0;
    }

}
