package Servicios;

import Entidades.Numero;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class NumeroServicios {

    private ArrayList<Numero> listaNumeros;
    final Scanner leer;

    public NumeroServicios() {
        this.listaNumeros = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void cargarLista() {
        int x = 0;
        while (x != -99) {
            Numero crear = new Numero();
            System.out.println("Ingrese un numero entero");

            crear.setNumeros(leer.nextInt());
            if (crear.getNumeros() != -99) {
                listaNumeros.add(crear);
            }
            x = crear.getNumeros();

        }

    }

    public void mostrarLista() {
        for (Numero aux : listaNumeros) {
            System.out.println(aux);
        }

    }
    public int sumaLista(){
        int suma = 0;
        
        Iterator<Numero> it = listaNumeros.iterator();
        while (it.hasNext()) {
            //Numero next = it.next();
            suma = suma + it.next().getNumeros();
        }
        return suma;
    }
    public double promedioLista(int promedio){
        
        return promedio / listaNumeros.size();
    }

}
