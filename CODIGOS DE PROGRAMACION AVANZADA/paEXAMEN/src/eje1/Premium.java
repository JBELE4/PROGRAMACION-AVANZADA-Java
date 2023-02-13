package eje1;

public class Premium extends Pago{
    private int numerodispositivos;
    public Premium(int precio ,int numerosdispositivos){
        super(precio,numerosdispositivos);
    }
    @Override
    public  int actualizar(int a){
        if(!super.comprobar()){
       return super.actualizar(70);}
        else {
           return super.actualizar(90);}
        }




    @Override
    public String toString() {
        if(!super.comprobar()){
            return "Antivirus PAURJC Premium Security\n"+"Cobertura básica +  paquetes extra con cobertura para un único dispositivo\n"+"Precio anual"+super.toString();
        }
        else{
            return "Antivirus PAURJC Premium Security\n"+"Cobertura básica + cuatro paquetes extra con cobertura para un máximo de " +super.toString();
        }

    }



}



