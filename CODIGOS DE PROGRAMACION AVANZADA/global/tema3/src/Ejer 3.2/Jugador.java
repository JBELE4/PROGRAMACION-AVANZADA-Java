public class Jugador {

    private Ficha ficha;

    public Jugador(Ficha ficha) {
        this.ficha = ficha;
    }

    public void poner(Tablero tablero) {
        this.mostrar();
        Coordenada destino = new Coordenada();
        boolean ocupada;
        do {
            do {
                destino.leer("Coordenada destino de movimiento");
            } while (!destino.valida(tablero.limite()));
            ocupada = tablero.ocupado(destino);
            if (ocupada)
                System.out.println("coordenada destino ocupada por otra ficha");
        } while (ocupada);
        tablero.poner(destino, this.ficha);
    }

    private void mostrar() {
        System.out.print("juega ");
        this.ficha.mostrar();
        System.out.println();
    }

    public void mover(Tablero tablero) {
        this.mostrar();
        Coordenada origen = new Coordenada();
        boolean vacia = false;
        boolean ocupadaMismaFicha = true;
        do {
            do {
                origen.leer("Coordenada origen de movimiento");
            } while (!origen.valida(tablero.limite()));
            vacia = tablero.vacio(origen);
            if (vacia)
                System.out.println("Coordenada origen vacia");
            else {
                ocupadaMismaFicha = tablero.ocupado(origen, this.ficha);
                if (!ocupadaMismaFicha)
                    System.out
                            .println("Coordenada origen ocupada por una ficha distinta");
            }
        } while (vacia || !ocupadaMismaFicha);
        tablero.quitar(origen);
        this.poner(tablero);
    }

    public Ficha getFicha() {
        return this.ficha;
    }

    public void cantaVictoria() {
        System.out.print("Han ganado las ");
        this.ficha.mostrar();
        System.out.println(" ...");
    }
}
