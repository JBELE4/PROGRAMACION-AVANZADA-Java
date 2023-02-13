package Estructuras.pdf.practtica.eje4;

import java.util.Collection;
import java.util.Comparator;
import java.util.*;
public class Jugador implements Comparable<Jugador> {
    private String nombre;
    private  int ganadas;
    public    Jugador(String nombre,int n){
        this.ganadas=n;
        this.nombre=nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int compareTo(Jugador o) {

        return -1*this.nombre.compareTo(o.nombre);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int getGanadas() {
        return this.ganadas;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", ganadas=" + ganadas +
                '}';
    }
}
