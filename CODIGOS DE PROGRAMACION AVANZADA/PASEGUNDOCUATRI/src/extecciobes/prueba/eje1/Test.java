package extecciobes.prueba.eje1;

public class Test {
    public static void main(String[] args) {



        Metoods m=new Metoods("HOLA",50);
        try {
           m.hola();
        }
        catch (Cadena e){
          System.out.println( e.getMessage());

        }
    }


}
