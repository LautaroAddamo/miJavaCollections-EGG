package Servicios;

import Entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CantanteFamosoServicios {

    private ArrayList<CantanteFamoso> listaCantante;
    final Scanner leer;

    public CantanteFamosoServicios() {
        this.listaCantante = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void mostrarLista() {
        for (CantanteFamoso aux : listaCantante) {
            System.out.println(aux);
        }
    }
    public void agregarCantante (){
        CantanteFamoso crear = new CantanteFamoso();
            System.out.println("Indique el nombre del cantante");
            crear.setNombre(leer.next());
            System.out.println("Indique el disco mas vendido");
            crear.setDiscoConMasVentas(leer.next());
            listaCantante.add(crear);
        }
    public void eliminarCantante(){
        Iterator<CantanteFamoso> it = listaCantante.iterator();
        System.out.println("Que cantante desea eliminar?");
        String cantante = leer.next();
        while (it.hasNext()) {
            CantanteFamoso next = it.next();
            if (next.getNombre().equalsIgnoreCase(cantante)) {
                it.remove();
                
            }
        }
    }
    public void menu(){
        System.out.println("MENU\n"
                + "Elija una opcion\n"
                + "1.CARGAR UN NUEVO CANTANTE\n"
                + "2.ELIMINAR UN CANTANTE\n"
                + "3.MOSTRAR LISTA DE CANTANTES\n"
                + "4.SALIR");
        
        
    }
}
