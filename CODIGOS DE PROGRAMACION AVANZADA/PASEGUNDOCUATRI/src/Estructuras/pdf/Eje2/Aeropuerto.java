package Estructuras.pdf.Eje2;

public class Aeropuerto {
    private  String name;
    private String lugar;
    private  int numAngares;
    public  Aeropuerto(String name,String lugar,int n ){
        this.lugar=lugar;
        this.name=name;
        this.numAngares=n;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "name='" + name + '\'' +
                ", lugar='" + lugar + '\'' +
                ", numAngares=" + numAngares +
                '}';
    }
    public  String nombre(){
        return  this.name;
    }
}
