package eje1;

public class Pago extends Antivirus {
    private int numerodispositivos;
    public Pago(int precio ,int numerosdispositivos){
        super(precio);
        this.numerodispositivos=numerosdispositivos;
    }
    public boolean comprobar(){
        return  this.numerodispositivos>0;
    }

    @Override
    public String toString() {
        return this.numerodispositivos + "Precio anual"+super.toString();

    }
}
