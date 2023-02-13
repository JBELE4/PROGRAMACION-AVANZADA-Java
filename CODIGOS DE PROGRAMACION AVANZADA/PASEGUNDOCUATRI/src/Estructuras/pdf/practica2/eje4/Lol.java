package Estructuras.pdf.practica2.eje4;

public class Lol {
    private int ganadas;
    private  String s;
    public  Lol(int  gana,String s){
        this.ganadas=gana;
        this.s=s;
    }

    public int getGanadas() {
        return ganadas;
    }

    public String getS() {
        return s;
    }

    @Override
    public String toString() {
        return "Lol{" +
                "ganadas=" + ganadas +
                ", s='" + s + '\'' +
                '}';
    }
}
