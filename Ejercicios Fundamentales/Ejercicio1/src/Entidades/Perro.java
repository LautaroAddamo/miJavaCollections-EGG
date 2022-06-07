package Entidades;

public class Perro {

    //Atributos
    private String raza;
//Constructores

    public Perro(String raza) {
        this.raza = raza;
    }

    public Perro() {
    }
//Getter & setter

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
//ToString

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + '}';
    }

}
