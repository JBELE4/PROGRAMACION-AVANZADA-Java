package eje1;

public class Gratis  extends  Antivirus{
    public  Gratis(int precio ){
        super(precio);
    }
    @Override
    public  int actualizar(int a){
            return super.actualizar(0);}



    @Override
    public String toString() {
        return "Antivirus PAURJC\n"+"Cobertura básica\n"+"Totalmente gratuito";
    }



}
