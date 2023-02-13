package Estructuras.pdf.practtica.eje3;

import java.util.Objects;

public class Expediente {
    private int numero;
    public  Expediente(int numero){
        this.numero=numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expediente that = (Expediente) o;
        return numero == that.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return "GestionExp{" +
                "numero=" + numero +
                '}';
    }
    public  int  darNum(){
        return  this.numero;
    }
}
