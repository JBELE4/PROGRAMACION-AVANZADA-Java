import  java.util.Scanner;
public class programa2 {
    public static void main(String[] args) {
   int actual=1,wiguiente=1 ;
   int medio=0;
   int fuera =0;
   while(fuera==0){
System.out.println(actual+" "+wiguiente+" ");
       medio=actual+wiguiente;
       actual=wiguiente;
       wiguiente=medio;
       if(wiguiente>800){
           fuera=5;
       }
   }
    }
}
