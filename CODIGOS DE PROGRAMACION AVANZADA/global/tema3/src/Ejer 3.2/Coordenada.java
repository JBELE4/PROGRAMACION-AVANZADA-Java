import java.util.Scanner;

public class Coordenada {
    private int x;
    private int y;

    public Coordenada() {
        this(0,0);
    }

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean valida(int limite) {
        return this.x <= limite && this.x >= 0 && this.y <= 2 && this.y >= 0;
    }

    public void leer(String titulo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(titulo);
        System.out.println("Dame fila: ");
        this.x = scanner.nextInt();
        System.out.println("Dame columna: ");
        this.y = scanner.nextInt();



    }
}
