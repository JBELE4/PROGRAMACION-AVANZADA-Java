package Estructuras.pdf.practica2.eje5;

public class Peticion {
    private  String m ;
    public Peticion(String m){
        this.m=m;
    }

    public String getM() {
        return m;
    }

    @Override
    public String toString() {
        return "Peticion{" +
                "REQUEST_" + m +
                '}';
    }
}
