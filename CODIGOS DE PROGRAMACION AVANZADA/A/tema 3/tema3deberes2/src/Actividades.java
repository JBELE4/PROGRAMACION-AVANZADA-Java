import java.util.Arrays;

public class Actividades {
private String a;
private  Horario[]clases;
private int contador;
public Actividades(int numeroDEturno,String nombre){
    this.clases=new Horario[numeroDEturno];
this.a=nombre;
this.contador=0;
}


    public String toString() {
    StringBuilder sb=new StringBuilder();
           sb.append("hola" +a+ ",");
    for (int i=0;i<this.clases.length;i++){
     sb.append(this.clases[i]+"\n");

    }
    return sb.toString();

    }
    public  void add(Horario h){
    this.clases[contador++]=h;

    }

    public static void main(String[] args) {
    Actividades a=new Actividades(2,"PACO");
    Horario h=new Horario("11","12");
    a.add(h);
    a.toString();
    }



}

















