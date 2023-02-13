package Estructuras.pdf.eje3;

public class Viaje {
    private String origen;
    private int duracion;
    private String destino;
    public  Viaje(String origen,String destino,int duracion){
        this.destino=destino;
        this.origen=origen;
        this.duracion=duracion;
    }
    public String devolverDes(){
        return  this.destino;
    }
  public String devolverOrg(){
        return  this.origen;
    }
    public int devolverDur(){
        return  this.duracion;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "origen='" + origen + '\'' +
                ", duracion=" + duracion +
                ", destino='" + destino + '\'' +
                '}';
    }
}
