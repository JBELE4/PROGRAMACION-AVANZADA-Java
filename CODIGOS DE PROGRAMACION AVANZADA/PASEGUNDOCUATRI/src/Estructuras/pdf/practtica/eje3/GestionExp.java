package Estructuras.pdf.practtica.eje3;

import java.util.HashMap;
import java.util.Map;

public class GestionExp {
Map<String,Expediente>gestionar=new HashMap<>();
public  void add(Expediente e ,String s ){
   this. gestionar.put(s,e);
}

    @Override
    public String toString() {
        return "GestionExp{" +
                "gestionar=" + gestionar +
                '}';
    }
    public  int porNombre(String s){
    Expediente o= this.gestionar.get(s);
    return  o.darNum();

    }

    public static void main(String[] args) {
        GestionExp geste=new GestionExp();
        geste.add(new Expediente(50),"JAVI");
        System.out.println(geste.porNombre("JAVI"));
    }

}
