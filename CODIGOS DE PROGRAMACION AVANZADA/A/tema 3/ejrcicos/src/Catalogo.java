
public class Catalogo {

    private Electrodomestico[] electrodomesticos;
    private int numeroProductosVenta;

    public Catalogo(int stockMaximo) {
        this.electrodomesticos = new Electrodomestico[stockMaximo];
        this.numeroProductosVenta = 0;
    }

    public void añadirProducto(Electrodomestico e) {
        if (this.numeroProductosVenta < this.electrodomesticos.length) {
            this.electrodomesticos[this.numeroProductosVenta++] = e;
        }
    }

    // Listar todos los productos del catálogo
    public void listar() {
        System.out.println("Productos del catálogo");
        for (int i = 0; i < this.numeroProductosVenta; i++) {
            System.out.println(this.electrodomesticos[i]);
        }
    }

    // listar todos los productos con una eficiencia determinada
    public void listar(char consumo_energetico) {

        System.out.println("Productos del catálogo con eficiencia energética: " + consumo_energetico);
        for (int i = 0; i < this.numeroProductosVenta; i++) {
            if (this.electrodomesticos[i].mismoConsumoEnergetico(consumo_energetico))
                System.out.println(this.electrodomesticos[i]);
        }
    }

    // Listar todos los productos iguales (mismo producto) y con un peso menor o igual al del
    // electrodoméstico que se recibe como parámetro
    public void listar(Electrodomestico e) {
        for (int i = 0; i < this.numeroProductosVenta; i++) {
            if (this.electrodomesticos[i].mismoProducto(e) &&
                    this.electrodomesticos[i].menorOigualPeso(e)) {
                System.out.println(this.electrodomesticos[i]);
            }
        }
    }

    public static void main(String[] args) {
        Catalogo c = new Catalogo(10);
        c.añadirProducto(new Electrodomestico("Lavadora", 250, 25, 'B', "AEG"));
        c.añadirProducto(new Electrodomestico("Lavadora", 300, 2, 'A', "AEG"));
        c.añadirProducto(new Electrodomestico("Secadora", 350, 25, 'B', "BOSCH"));
        c.añadirProducto(new Electrodomestico("Secadora", 325, 25, 'C', "BALAY"));
        c.añadirProducto(new Electrodomestico("Microondas", 35, 7, 'D', "CECOTEC"));

        c.listar();
    }


}
