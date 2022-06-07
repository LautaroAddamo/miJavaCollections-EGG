
package Entidades;

import java.util.Objects;


public class Paises {
   private String paises;

    public Paises(String paises) {
        this.paises = paises;
    }

    public Paises() {
    }

    public String getPaises() {
        return paises;
    }

    public void setPaises(String paises) {
        this.paises = paises;
    }

    @Override
    public String toString() {
        return "Paises{" + "paises=" + paises + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.paises);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paises other = (Paises) obj;
        return true;
    }
   
}
