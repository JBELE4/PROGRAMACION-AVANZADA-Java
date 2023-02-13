public class Tablero {

    private Ficha[][] tablero;
    private final int FICHAS_POR_JUGADOR = 3;

    // se manejará un único objeto FICHA_VACIA
    private final Ficha FICHA_VACIA = new Ficha('-');

    public Tablero() {
        this.tablero = new Ficha[this.FICHAS_POR_JUGADOR][this.FICHAS_POR_JUGADOR];
        for (int i = 0; i < this.FICHAS_POR_JUGADOR; i++) {
            for (int j = 0; j < this.FICHAS_POR_JUGADOR; j++) {
                this.tablero[i][j] = this.FICHA_VACIA;
            }
        }
    }

    private Ficha getFicha(int fila, int columna) {
        return this.tablero[fila][columna];
    }

    public void limpiar() {
        for (int i = 0; i < this.FICHAS_POR_JUGADOR; i++) {
            for (int j = 0; j < this.FICHAS_POR_JUGADOR; j++) {
                this.tablero[i][j] = this.FICHA_VACIA;
            }
        }
    }

    public boolean hayVictoria(Ficha ficha) {
        boolean victoria = false;

        int diagonal = 0;
        int inversa = 0;
        int[] filas = new int[this.tablero.length];
        int[] columnas = new int[this.tablero.length];

        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero.length; j++) {
                if (this.getFicha(i, j).igual(ficha)) {
                    if (i == j)
                        diagonal++;
                    if (i + j == 2)
                        inversa++;
                    filas[i]++;
                    columnas[j]++;
                }
            }
        }
        if ((diagonal == this.FICHAS_POR_JUGADOR) ||
                (inversa == this.FICHAS_POR_JUGADOR))
            victoria = true;
        else
            for (int i = 0; i < this.FICHAS_POR_JUGADOR; i++) {
                if ((filas[i] == this.FICHAS_POR_JUGADOR) || (columnas[i] == this.FICHAS_POR_JUGADOR))
                    victoria = true;
            }

        return victoria;
    }

    public void mostrar() {
        for (int i = 0; i < this.FICHAS_POR_JUGADOR; i++) {
            for (int j = 0; j < this.FICHAS_POR_JUGADOR; j++) {
                this.tablero[i][j].mostrar();
            }
            System.out.println();
        }
        System.out.println();
    }

    public void poner(Coordenada coordenada, Ficha ficha) {
        this.tablero[coordenada.getX()][coordenada.getY()] = ficha;
    }

    public void quitar(Coordenada coordenada) {
        this.poner(coordenada, this.FICHA_VACIA);
    }

    // Devuelve verdadero si la coordenada que se consulta en el tablero está
    // ocupada por la ficha que se indica en el segundo parámetro
    public boolean ocupado(Coordenada coordenada, Ficha ficha) {
        return this.tablero[coordenada.getX()][coordenada.getY()]
                .igual(ficha);
    }
    public boolean ocupado(Coordenada coordenada) {
        return !this.tablero[coordenada.getX()][coordenada.getY()].igual(this.FICHA_VACIA);
    }

    public boolean vacio(Coordenada coordenada) {
        return this.tablero[coordenada.getX()][coordenada.getY()].igual(this.FICHA_VACIA);
    }

    public int limite() {
        return this.FICHAS_POR_JUGADOR;
    }
}
