
public class Electrodomestico {
    private String producto;
    private double precio;
    private int peso;
    // Valores posibles de la A a la F
    private char consumo_energetico;
    private String marca;

    // Datos por defecto
    public Electrodomestico() {
        this("lavadora",100,5,'F',"AEG");
        this.actualizarPrecio();
    }

    public Electrodomestico(String producto, double precio, int peso) {
        this(producto, precio,peso,'F', "AEG");
        this.actualizarPrecio();
    }

    public Electrodomestico(String producto, double precio, int peso, char consumo_energetico, String marca) {
        this.producto = producto;
        this.precio = precio;
        this.peso = peso;
        this.consumo_energetico = consumo_energetico;
        this.marca = marca;
        this.actualizarPrecio();
    }

    private void actualizarPrecio() {
        switch (this.consumo_energetico) {
            case 'A': this.precio = this.precio + 100; break;
            case 'B': this.precio = this.precio + 80; break;
            case 'C': this.precio = this.precio + 60; break;
            case 'D': this.precio = this.precio + 50; break;
            case 'E': this.precio = this.precio + 30; break;
            case 'F': this.precio = this.precio + 10; break;
            default: break;
        }
    }

    public boolean mismoConsumoEnergetico(char consumo_energetico) {
        return this.consumo_energetico == consumo_energetico;
    }

    public boolean mismoProducto(Electrodomestico e) {
        return this.producto.equals(e.producto);
    }

    public boolean menorOigualPeso(Electrodomestico e) {
        return this.peso <= e.peso;
    }

    public String toString() {
        return this.producto + " de la marca "+ this.marca+",\n"+
                " de peso "+ this.peso + " kilos, con eficiencia energetica " + this.consumo_energetico
                + " y un coste de " + this.precio + " euros";
    }
}
