public class Ficha {
    private char color;

    public Ficha(char color) {
        this.color = color;
    }

    public boolean igual(Ficha ficha) {
        return this.color == ficha.color;
    }

    public void mostrar() {
        System.out.print(this.color);
    }
}
