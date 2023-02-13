package extecciobes.eje1;

public class Test {
    public static void main(String[] args) {
        Bono b=new Bono(4);
        for(int i=0;i<6;i++){
            try{
                System.out.println(b.quitar());    }
            catch (SaldoAgotadoException e){
                System.out.println("mal");
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }



}
