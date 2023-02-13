package extecciobes.eje1;

public class Bono {

    private int viajes ;


    public Bono(int a){
        this.viajes=a;
    }
public  int quitar()throws SaldoAgotadoException{
        this.viajes--;
        if(this.viajes<=0){
            throw  new SaldoAgotadoException((this.viajes));

        }
        return  this.viajes;
}

    @Override
    public String toString() {
        return "Bono{" +
                "viajes=" + viajes +
                '}';
    }
}

