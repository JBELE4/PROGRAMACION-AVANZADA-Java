package Estructuras.pdf.Eje1;
import java.util.ArrayList;
import  java.util.List;
public class Eje1 {
    public static void sElemToList(List<String>l1,String h){
l1.add(h);

for(String s:l1){
    System.out.println(s);
}

    }


    public static void main(String[] args) {
        List<String>h=new ArrayList();
        h.add(0,"hola");
        Eje1.sElemToList(h,"SSSDD");





    }
}
