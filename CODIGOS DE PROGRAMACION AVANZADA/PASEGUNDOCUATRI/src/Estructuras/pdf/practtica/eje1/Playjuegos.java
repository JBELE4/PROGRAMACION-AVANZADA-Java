package Estructuras.pdf.practtica.eje1;

public class Playjuegos implements  Comparable<Playjuegos> {
    private  String nombre;
    private int  precio;
    private int duracion ;
public  Playjuegos( String nombre,int  precio, int duracion ){
    this.duracion=duracion;
    this.nombre=nombre;
    this.precio=precio;

}
public  String getNombre(){
    return  this.nombre;
}

    @Override
    public int compareTo(Playjuegos o) {
        if (this.nombre.length() > o.nombre.length()) {
            return 1;
        }
        if (this.nombre.length() < o.nombre.length()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Playjuegos{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", duracion=" + duracion +
                '}';
    }
}
