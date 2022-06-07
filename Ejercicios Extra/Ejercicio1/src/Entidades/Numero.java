
package Entidades;


public class Numero {
    private int numeros;

    public Numero(int numeros) {
        this.numeros = numeros;
    }

    public Numero() {
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "Lista{" + "numeros=" + numeros + '}';
    }
    
    
}
