package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoServicios {

    private ArrayList<Alumno> listaAlumnos;
    private final Scanner leer;

    public AlumnoServicios() {
        this.listaAlumnos = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Alumno cargarAlumno() {
        Alumno crear = new Alumno();

        System.out.println("Ingrese el nombre del alumno");
        crear.setNombre(leer.next());
        ArrayList<Integer> notas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese su nota " + (i + 1));
            notas.add(leer.nextInt());
        }
        crear.setNotas(notas);
        return crear;

    }

    public double notaFinal(ArrayList<Integer> notas) {
        double promedio = 0;
        for (Integer nota : notas) {
            promedio += nota;

        }
        return promedio / 3;

    }

    public void alumnos() {
        String opc = "";
        while (!opc.equalsIgnoreCase("NO")) {
            listaAlumnos.add(cargarAlumno());
            System.out.println("Desea cargar otro alumno? (SI/NO)");
            opc = leer.next();
        }
    }

    public void calcularNota() {
        System.out.println("Indique el nombre del alumno que quiere analizar");
        String buscarAlumno = leer.next();
        boolean bandera = false;
        Iterator<Alumno> it = listaAlumnos.iterator();
        while (it.hasNext()) {
            Alumno next = it.next();
            if (next.getNombre().equals(buscarAlumno)) {
                System.out.println("El alumno tiene un promedio de: "+ notaFinal(next.getNotas()));
                bandera = true;
            }
        }
        if(bandera = false){
            System.out.println("El alumno no existe");
        }
    }
}
