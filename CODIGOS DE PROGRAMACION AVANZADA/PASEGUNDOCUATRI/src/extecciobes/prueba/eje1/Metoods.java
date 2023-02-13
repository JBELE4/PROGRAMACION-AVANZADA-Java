package extecciobes.prueba.eje1;

public class Metoods {
    private  int num;
    private String s;
    public  Metoods(String s, int num){
        this.num=num;
        this.s=s;


    }
    public  void   hola ()throws Cadena{

           if(s.length()<num-1){
               throw new Cadena(num);

           }
else {
    System.out.println(s.charAt(num));
           }

    }
}
