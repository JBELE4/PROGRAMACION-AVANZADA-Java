package Estructuras.pdf.practtica.eje1;

import java.util.*;

public class Gestor {
     private Set<Playjuegos>p=new TreeSet<>(){
     };

     public  void add(Playjuegos pl){
         this.p.add(pl);


     }


    @Override
    public String toString() {
        return "Gestor{" +
                "p=" + p +
                '}';
    }

    public static void main(String[] args) {

        Gestor a=new Gestor();


        a.add((new Playjuegos("paco",50,20)));
        a.add(new Playjuegos("codff",50,50));
        a.add((new Playjuegos("pacsasasao",50,20)));
        a.add(new Playjuegos("codafff",50,50));
System.out.println(a);

    }


}
