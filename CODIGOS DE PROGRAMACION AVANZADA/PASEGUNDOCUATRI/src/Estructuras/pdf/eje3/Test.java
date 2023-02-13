package Estructuras.pdf.eje3;

public class Test {
    public static void main(String[] args) {
        GestorDeViajes a=new GestorDeViajes();
        a.addViaje( new Viaje("MADRID","pamplona",50));
        a.addViaje( new Viaje("MAlaga","pamplona",50));
        a.addViaje( new Viaje("Barcelona","pamplona",50));
System.out.println(a.ciudades());
//System.out.println(a.devovlerDes("pamplona"));
        System.out.println("KLK");
System.out.println(a.devovlerOG("MAlaga"));
    }
}
