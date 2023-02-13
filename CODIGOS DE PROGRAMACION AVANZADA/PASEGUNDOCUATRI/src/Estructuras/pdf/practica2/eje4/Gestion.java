package Estructuras.pdf.practica2.eje4;

import java.util.Set;
import java.util.TreeSet;

public class Gestion {
  private   Set<Lol>e=new TreeSet<>(new Dem());
  public  void aad( Lol w){
    e.add(w);

  }

  @Override
  public String toString() {
    return "Gestion{" +
            "e=" + e +
            '}';
  }

  public static void main(String[] args) {
    Gestion e=new Gestion();
    e.aad(new Lol(50,"hola"));
    e.aad(new Lol(50,"aola"));
    e.aad(new Lol(50,"eola"));
    e.aad(new Lol(50,"bola"));
   System.out.println(e);
  }

}
