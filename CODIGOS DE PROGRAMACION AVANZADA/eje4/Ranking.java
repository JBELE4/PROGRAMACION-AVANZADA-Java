package Estructuras.pdf.practtica.eje4;

import java.util.*;

public class Ranking {
  Set<Jugador>colle=new TreeSet<>();
  public   void add(Jugador j){
      this.colle.add(j);
  }

    @Override
    public String toString() {
        return "Ranking{" +
                "colle=" + colle +
                '}';
    }

    public static void main(String[] args) {
        Ranking s=new Ranking();
        s.add(new Jugador("ercao",6));
        s.add(new Jugador("arcao",6));
        s.add(new Jugador("paco",5));
        System.out.println(s);
    }


}
