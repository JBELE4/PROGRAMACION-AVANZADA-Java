package Estructuras.pdf.practica2.eje1;

public class Juegos   {
    private String nombre;

    public Juegos(String a) {
        this.nombre = a;
    }

    public String devolver() {
        return this.nombre;
    }


    @Override
    public String toString() {
        return "Juegos{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
