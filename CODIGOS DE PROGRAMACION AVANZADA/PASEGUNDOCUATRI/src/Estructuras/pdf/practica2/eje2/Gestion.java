package Estructuras.pdf.practica2.eje2;

import java.util.*;

public class Gestion {
 private Set<Alumno>s=new HashSet<Alumno>();
 public  void añadir(Alumno w){
     s.add(w);

 }

 public  void esta(List<Alumno> e) {
     int i = 0;
     for (Alumno c:e) {
         Alumno n = e.get(i);
         if (s.contains(n)) {
             System.out.println("comntionr" + n.getNombre());
         } else {
             System.out.println("NOESTA" + n.getNombre());
         }
i++;
     }
 }



    @Override
    public String toString() {
        return "Gestion{" +
                "s=" + s +
                '}';
    }

    public static void main(String[] args) {
     List<Alumno>e=new ArrayList<>();
     e.add(new Alumno("HOLA"));
        e.add(new Alumno("PACO"));
        e.add(new Alumno("PACOoo"));
        Gestion n=new Gestion();
        n.añadir(new Alumno("PACO"));
        n.añadir(new Alumno("PACOoo"));
        n.esta(e);

    }


}
