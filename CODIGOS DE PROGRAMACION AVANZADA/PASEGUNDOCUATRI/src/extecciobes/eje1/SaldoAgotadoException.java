package extecciobes.eje1;

public class SaldoAgotadoException  extends  Exception{
    public SaldoAgotadoException(int saldo){
        super("se ha agotado, tu nsaldo  actual  es "+saldo);
    }
}
