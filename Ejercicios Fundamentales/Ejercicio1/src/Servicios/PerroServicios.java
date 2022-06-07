package Servicios;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PerroServicios {

    private ArrayList<Perro> razasPerro;//Creo la lista 
    private Scanner leer;//Creo el scanner pero no lo inicializo aun

    public PerroServicios() {
        this.razasPerro = new ArrayList<>();//Creo el espacio de memoria para la lista
        this.leer = new Scanner(System.in).useDelimiter("\n");//Habilito el scanner cuando invoco la clase

    }
    public void cargarPerro(){
        Perro crear = new Perro();
        System.out.println("Ingrese una raza de perro");
        crear.setRaza(leer.next());
        
        razasPerro.add(crear);
        razasPerro.remove(razasPerro.size()-1);
    }
    public void mostrarLista(){
        for (Perro perro : razasPerro) {
            System.out.println(perro);
        }
        System.out.println(razasPerro.size());
    }
    public void elminarDeLista(String eliminar){
        Iterator<Perro>it=razasPerro.iterator();//Creo que inicializo el iterator
        while(it.hasNext()){
            if(it.next().getRaza().equals(eliminar)){
                it.remove();
            }
        }
    }

}
