package extecciobes.eje3;

public class Test {
    public static void main(String[] args) {
        Cade a =new Cade();
         try{
             a.metodo_pedido(4,"hola");
         }catch (Stringexceptio e){
             System.out.println(e.getMessage());
         }
    }
}
