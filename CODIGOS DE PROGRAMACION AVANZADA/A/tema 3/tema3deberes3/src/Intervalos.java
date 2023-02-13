import  java.util.Scanner;
public class Intervalos {
    private int intervaloS;
    private int intervaloI;
     public Intervalos(int a,int b){
         this.intervaloI=a;
         this.intervaloS=b;
     }

     public   void recogerInfromacion(){
         Scanner s=new Scanner(System.in);
        System.out.println("Introduzca el intervalo superior ");
        this.intervaloS=s.nextInt();
         System.out.println("Introduzca el intervalo  inferior ");
         this.intervaloI=s.nextInt();


    }
    public Intervalos(){
        this.recogerInfromacion();
    }
    public  int deovlverItS(){return  this.intervaloS; }
    public  int deovlverItI(){return  this.intervaloI; }

    @Override
    public String toString() {
        return "Intervalos{" +
                "intervaloS=" + intervaloS +
                ", intervaloI=" + intervaloI +
                '}';
    }
}
