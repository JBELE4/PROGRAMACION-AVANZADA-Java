package Estructuras.pdf.practica2.eje1;

import java.util.Comparator;

public class Conm  implements Comparator <Juegos>{
    @Override
    public  int compare(Juegos j1,Juegos j2){
        if(j1.devolver().length()>j2.devolver().length()){
            return 1;

        }
        if(j1.devolver().length()<j2.devolver().length()){
            return -1;
        }
    else {
    return  0;
        }
    }
}
