package extecciobes.eje3;

public class Cade {
    public  void metodo_pedido(int a,String w)throws Stringexceptio{
        if(w.length()<(a-1)){
            throw  new Stringexceptio((a-1));

        }
        else{
            System.out.println(w.charAt(a-1));
        }

    }
}
