package Estructuras.pdf.practica2.eje5;

import java.util.ArrayDeque;
import java.util.Queue;

public class Server {
    private  Queue <Peticion>e=new ArrayDeque<>();
    public  void  añadir(Peticion m){
        e.add(m);
    }
    public  void  atendido(){
        Peticion n=e.peek();
        e.remove();
        System.out.println(n);
    }
    @Override
    public String toString() {
        return "Server{" +
                "e=" + e +

                '}';
    }

    public static void main(String[] args) {
        Server b=new Server();
        b.añadir(new Peticion("5"));
        b.añadir(new Peticion("6"));
        b.añadir(new Peticion("7"));
        b.añadir(new Peticion("8"));
        b.atendido();
        b.atendido();
        b.atendido();
        b.atendido();
    }
}
