package Estructuras.pdf.practica2.eje1;

import Estructuras.pdf.practtica.eje2.Gestion;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Gestor {

 private  Set<Juegos>e=new TreeSet<>(new Conm());
 public  void  add(Juegos m){
     this.e.add(m);
 }

    @Override
    public String toString() {
        return "Gestor{" +
                "e=" + e +
                '}';
    }

    public static void main(String[] args) {



        Gestor my=new Gestor();
        my.add(new Juegos("hola"));
        my.add(new Juegos("mELA"));
        my.add(new Juegos("mEeeLA"));

        for (Juegos se :my.e){
            System.out.println(my);
        }

    }
}
