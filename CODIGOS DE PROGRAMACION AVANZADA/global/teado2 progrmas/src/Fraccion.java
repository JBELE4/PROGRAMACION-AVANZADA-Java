import java.util.Scanner;
public class Fraccion {
    private double numerador;
    private  double  denominador;

    public Fraccion(){
        this.numerador=0;
        this.denominador=0;
    }
    public Fraccion(double numerador,double  denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }
    @Override
    public String toString() {
        return "Fraccion{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }


    public boolean igual(Fraccion  i1){
        return this.denominador==i1.denominador
                &&this.numerador==i1.numerador;
    }
    public boolean equivlaente(Fraccion i1){
       double resultado1=this.numerador/this.denominador;

       double resultado2=i1.numerador/i1.denominador;

       return resultado1==resultado2;

    }
    public void rellenar(){
        Scanner input=new Scanner(System.in);
        System.out.println("dame un numerador");
        this.numerador=input.nextInt();
        System.out.println("dame un denominador");
        this.denominador=input.nextInt();
        input.close();
    }

    public static void main(String[] args) {
        /*Fraccion i1=new Fraccion(2,1);
        Fraccion i2=new Fraccion(4,8);
        System.out.println("fracion"+i1);
        System.out.println( i1.igual(i2));
        System.out.println(i1.equivlaente(i2));
        i2.rellenar();
        System.out.println("fracion"+i2);*/
      Scanner input=new Scanner(System.in);
        System.out.println("dame numeros de fraciones a insertar");
        int  contador =input.nextInt();
        int  tamaño=contador;
        Fraccion array[]=new Fraccion[contador];
        for (int i=0;i<contador;i++){
            System.out.println("dame un numerador");
            int  numerador=input.nextInt();
            System.out.println("dame un denominador");
            int denominador=input.nextInt();
            Fraccion  a =new Fraccion(numerador,denominador);
            array[i]=a;
        }
        for (int i=0;i<contador;i++){
            System.out.println(array[i]);
        }
        for (int i=0;i<contador;i++) {
            for (int j =i+1;j< contador; j++) {
                if ( array[i].equivlaente(array[j])) {
                    System.out.println( array[i]+","+array[j]);
                }

            }
        }



      input.close();
    }
}
