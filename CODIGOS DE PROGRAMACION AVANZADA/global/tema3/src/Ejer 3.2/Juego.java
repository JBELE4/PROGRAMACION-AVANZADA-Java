public class Juego {

    private Tablero tablero;
    private Jugador[] jugadores;
    private final int MAXIMO_JUGADORES = 2;
    private final int MINIMO_NUMERO_MOVIMIENTOS = 5;

    public Juego() {
        this.tablero = new Tablero();
        this.jugadores = new Jugador[this.MAXIMO_JUGADORES];
        // inicializar jugadores
        this.jugadores[0] = new Jugador(new Ficha('x'));
        this.jugadores[1] = new Jugador(new Ficha('o'));
    }

    public void partida() {
        this.tablero.limpiar();
        // Visualizar el tablero
        this.tablero.mostrar();

        // Poner fichas los jugadores
        // Asignar turno a un jugador
        Turno turno = new Turno();
        for (int i = 0; i < this.MINIMO_NUMERO_MOVIMIENTOS; i++) {
            this.jugadores[turno.toca()].poner(this.tablero);
            // cambiar turno
            turno.cambiar();
            this.tablero.mostrar();
        }

        if (!this.hayVictoria(turno.noToca())) {
            // El segundo jugador pone su tercera ficha
            this.jugadores[turno.toca()].poner(this.tablero);
            turno.cambiar();
            while (!this.hayVictoria(turno.noToca())) {
                this.tablero.mostrar();
                this.jugadores[turno.toca()].mover(this.tablero);
                turno.cambiar();
            }
        }

        this.jugadores[turno.noToca()].cantaVictoria();
    }

    public void partida(Jugador[] jugadores) {
        this.jugadores = jugadores;
        this.partida();
    }

    public boolean hayVictoria(int turno) {
        return this.tablero.hayVictoria(this.jugadores[turno].getFicha());
    }

    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.partida();
     }
}
