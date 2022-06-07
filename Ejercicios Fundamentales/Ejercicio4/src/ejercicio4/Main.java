package ejercicio4;

import Servicios.PeliculaServicios;
import java.util.Scanner;

/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:
 */
public class Main {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        PeliculaServicios ps = new PeliculaServicios();
        String opc;

        do {
            ps.cargarPelicula();
            System.out.println("Desea cargar otra pelicula? (SI/NO");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("no"));

        System.out.println("------");
        System.out.println("PELICULAS GUARDADAS");
        ps.mostrarPeliculas();
        System.out.println("------");
        System.out.println("PELICULAS DE MAS DE UNA HORA DE DURACION");
        ps.pelisLargas();
        System.out.println("------");
        System.out.println("PELICULAS ORDENADAS POR DURACION ASCENDENTE");
        ps.ordenMayor();
        System.out.println("------");
        System.out.println("PELICULAS ORDENADAS POR DURACION DESCENDENTE");
        ps.ordenMenor();
        System.out.println("------");
        System.out.println("PELICULAS ORDENADAS ALFABETICAMENTE POR TITULO");
        ps.ordenTitulo();
        System.out.println("------");
        System.out.println("PELICULAS ORDENADAS ALFABETICAMENTE POR DIRECTOR");
        ps.ordenDirector();
        System.out.println("------");

    }

}
