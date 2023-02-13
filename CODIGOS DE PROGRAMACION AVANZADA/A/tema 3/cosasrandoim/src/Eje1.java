import java.util.Random;
public class Eje1 {
    private  int []a;
    public  Eje1(){
        this.a=new int[10];
    }
    public void rellenar(){
        for (int i=0;i<10;i++){
         this.a[i]=new  Random().nextInt(50-19+1)+19 ;
        }

    }
    public void imprimir(){
        for (int i=0;i<10;i++){
          System.out.println(this.a[i]);
        }
    }

    public static void main(String[] args) {
        Eje1 a=new Eje1();
        a.rellenar();
        a.imprimir();
    }
}
