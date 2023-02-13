package Lamba.lamba1;

import java.util.List;

public class Buesqueda {
    public  void busqye(List<AlumnoPA>l,int min,int max){
        for(AlumnoPA p:l){
            if(p.notaEnRango(min,max)){
                System.out.println(p.toString());
            }
        }


    }
    public  void mat(int matr,List<AlumnoPA>l){
        for(AlumnoPA p:l){
            if(p.mayorNumMatriculas(matr)){
                System.out.println(p.toString());
            }
        }
    }
}
