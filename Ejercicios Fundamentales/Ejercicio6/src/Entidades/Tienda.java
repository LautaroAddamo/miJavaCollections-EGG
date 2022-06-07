
package Entidades;


public class Tienda {
    
    private double precio;

    public Tienda(double precio) {
        
        this.precio = precio;
    }

    public Tienda() {
    }

    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tienda{" + "precio=" + precio + '}';
    }
    

    
}
