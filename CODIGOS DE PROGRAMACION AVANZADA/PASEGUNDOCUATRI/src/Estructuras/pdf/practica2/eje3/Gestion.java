package Estructuras.pdf.practica2.eje3;

import java.util.HashMap;
import java.util.Map;

public class Gestion {
private Map<String, Alumno>s=new HashMap<>();

    @Override
    public String toString() {
        return "Gestion{" +
                "s=" + s +
                '}';
    }
    public  void añadir(String w ,Alumno e){
        s.put(w,e);
    }
    public  int dar(String w){
      Alumno r=  s.get(w);
        return  r.getExp();

    }

    public static void main(String[] args) {
        Gestion v =new Gestion();
        v.añadir("holsa",new Alumno(50,"es"));
        v.añadir("holaa",new Alumno(30,"esdd"));
        System.out.println(v.dar("holaa"));
        System.out.println(v.dar("holsa"));

    }
}
