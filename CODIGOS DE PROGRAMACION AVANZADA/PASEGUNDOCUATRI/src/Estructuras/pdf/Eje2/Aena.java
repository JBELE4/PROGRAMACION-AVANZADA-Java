package Estructuras.pdf.Eje2;

import java.util.HashMap;
import java.util.Map;

public class Aena {
    public static void main(String[] args) {
        Map<String ,Aeropuerto>hola=new HashMap<String, Aeropuerto>();
        Aeropuerto h=new Aeropuerto("paco","madrid",5);
        hola.put(h.nombre(),h);
        System.out.println(hola);
        Aena.Anadir(hola,new Aeropuerto("macaco","ibiza",50));
        for(Aeropuerto a:hola.values()){
            System.out.println(a);
        }
    }

    public  static void Anadir( Map<String ,Aeropuerto>hola,Aeropuerto a){
        hola.put(a.nombre(),a);

    }



}
