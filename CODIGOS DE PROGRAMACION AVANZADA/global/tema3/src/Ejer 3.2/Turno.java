public class Turno {
    private int valor;

    public Turno() {
        this.valor = 0;
    }

    public void cambiar() {
        this.valor = (this.valor +1) % 2;
    }

    public int toca() {
        return this.valor;
    }

    public int noToca() {
        return (this.valor +1) % 2;
    }
}
