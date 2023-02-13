package Estructuras.pdf.practtica.eje2;

import java.util.Objects;

public class Alumnos {
    private String nombre;
    public  Alumnos(String nombre){

        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumnos alumnos = (Alumnos) o;
        return Objects.equals(nombre, alumnos.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
