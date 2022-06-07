package Entidades;

import Servicios.Ciudades;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CiudadesServicios {

    HashMap<String, String> mapaCiudades;
    private final Scanner leer;

    public CiudadesServicios() {
        this.mapaCiudades = new HashMap<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void cargarCiudades() {
        String cp;
        Ciudades crear = new Ciudades();
        System.out.println("Ingrese el codigo postal de la Ciudad");
        cp = leer.next();
        System.out.println("Ingrese el nombre de la ciudad");
        crear.setCiudad(leer.next());
        mapaCiudades.put(cp, crear.getCiudad());

    }

    public void mostrarCiudades() {
        for (Map.Entry<String, String> aux : mapaCiudades.entrySet()) {
            String key = aux.getKey();
            String value = aux.getValue();
            System.out.println("Codigo postal " + aux.getKey() + ". " + aux.getValue());
        }

    }

    public void buscarCiudad() {
        System.out.println("Ingrese el CP que desea buscar");
        String CP = leer.next();
        if (mapaCiudades.containsKey(CP)) {
            System.out.println(mapaCiudades.get(CP));

        } else {
            System.out.println("El codigo postal ingresado no corresponde a ninguna ciudad del mapa creado");
        }
    }
    public void agregarCiudad(){
        System.out.println("Ingrese un CP");
        String CP = leer.next();
        System.out.println("Ingrese el nombre de la ciudad");
        String ciudad = leer.next();
        mapaCiudades.put(CP, ciudad);
    }
    public void eliminarCiudades(){
        System.out.println("Que codigo postal desea eliminar");
        String eliminar = leer.next();
        
            mapaCiudades.remove(eliminar);
        }
    

}
