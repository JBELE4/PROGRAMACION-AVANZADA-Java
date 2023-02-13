package Estructuras.pdf.practtica.eje2;

import java.util.HashSet;
import java.util.Set;

public class Gestion {
    Set<Alumnos>alLista=new HashSet<>();
    public void añadir(Alumnos a){
        this.alLista.add(a);
    }
    public  String estar(String e){
        if (this.alLista.contains(new Alumnos(e))==true){
        return "esta";}
        else{return " no esta";}
    }

    public static void main(String[] args) {
        Gestion m=new Gestion();
        m.añadir(new Alumnos("paco"));
      System.out.println(m.estar("paco"));
    }
}
