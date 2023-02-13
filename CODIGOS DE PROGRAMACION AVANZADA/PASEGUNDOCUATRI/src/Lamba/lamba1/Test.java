package Lamba.lamba1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<AlumnoPA>l= new ArrayList<>();
        l.add(new AlumnoPA(5,2,"rfdd"));
        l.add(new AlumnoPA(7,6,"rggfdd"));
        l.add(new AlumnoPA(3,4,"rfddhh"));
        Inetrfacbus e= (a) ->a.notaEnRango(5,6);
        if(e.cumple(l.get(0)))
            System.out.println("sd");


       /* Utils.imprimirAlumnos(l, new Impelemtn() {
            @Override
            public boolean cumple(AlumnoPA l) {
                return l.notaEnRango(5,7);
            }
        });*/
    }
}
