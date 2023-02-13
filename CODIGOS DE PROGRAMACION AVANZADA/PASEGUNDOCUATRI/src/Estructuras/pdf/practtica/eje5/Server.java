package Estructuras.pdf.practtica.eje5;

import java.util.ArrayDeque;
import java.util.Queue;

public class Server {
     private  Queue<Peticion>p=new ArrayDeque<>();
    public  void add(Peticion pw){
       this.p.add(pw);
    }
    public  void atendida(){
        Peticion pes=this.p.peek();
        System.out.println("ATENDIDO "+pes.getResquest());
        this.p.remove();
    }

    public static void main(String[] args) {
        Server sv=new Server();
        sv.add(new Peticion("REQUEST_1"));
        sv.add(new Peticion("REQUEST_2"));
        sv.add(new Peticion("REQUEST_3"));
        for(Peticion por:sv.p){
            sv.atendida();

        }
    }
}
