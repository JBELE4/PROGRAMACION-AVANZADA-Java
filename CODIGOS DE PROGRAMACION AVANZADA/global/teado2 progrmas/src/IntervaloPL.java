public class IntervaloPL {
    private double puntoMedio;
    private double longitud;

    public IntervaloPL() {
        this(0.0, 0.0);
    }

    public IntervaloPL(double extremoInferior, double extremoSuperior) {
        this.setExtremoInferior(extremoInferior);
        this.setExtremoSuperior(extremoSuperior);
    }

    public IntervaloPL(double extremoSuperior) {
        this(0.0, extremoSuperior);
    }

    public IntervaloPL(IntervaloPL i) {
        this(i.getExtremoInferior(), i.getExtremoSuperior());
    }

    public IntervaloPL(double extremoInferior, int longitud) {
        this(extremoInferior, extremoInferior + longitud);
    }


    private double getPuntoMedio() {
        return this.puntoMedio;
    }

    private void setPuntoMedio(double puntoMedio) {
        this.puntoMedio = puntoMedio;
    }

    private void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    private double getExtremoInferior() {
        return this.getPuntoMedio() - this.longitud() / 2;
    }

    private void setExtremoInferior(double extremoInferior) {
        double extremoSuperior = this.getExtremoSuperior();
        this.setLongitud(extremoSuperior - extremoInferior);
        this.setPuntoMedio(extremoSuperior - this.longitud() / 2);
    }

    private double getExtremoSuperior() {
        return this.getPuntoMedio() + this.longitud() / 2;
    }

    private void setExtremoSuperior(double extremoSuperior) {
        double extremoInferior = this.getExtremoInferior();
        this.setLongitud(extremoSuperior - extremoInferior);
        this.setPuntoMedio(extremoInferior + this.longitud() / 2);
    }

    public String toString() {
        return "[" + this.getExtremoInferior() + "," + this.getExtremoSuperior() + "]";
    }

    //    Calcular la longitud del intervalo
    public double longitud() {
        return this.longitud;
    }

    public boolean igual(IntervaloPL intervalo) {
        return this.getExtremoInferior() == intervalo.getExtremoInferior()
                && this.getExtremoSuperior() == intervalo.getExtremoSuperior();
    }

    public boolean distinto(IntervaloPL intervalo) {
        return !this.igual(intervalo);
    }

    public void desplazar(double desplazamiento) {
        this.setExtremoInferior(this.getExtremoInferior() + desplazamiento);
        this.setExtremoSuperior(this.getExtremoSuperior() + desplazamiento);
    }

    // desplaza el intervalo al origen de coordenadas
    public void desplazar() {
        this.desplazar(-this.getExtremoInferior());
    }

    public boolean incluye(double punto) {
        return this.getExtremoInferior() <= punto && punto <= this.getExtremoSuperior();
    }

    // Si un intervalo incluye a otro
    public boolean incluye(IntervaloPL intervalo) {
        return this.incluye(intervalo.getExtremoInferior())
                && this.incluye(intervalo.getExtremoSuperior());
    }

    public IntervaloPL union(IntervaloPL intervalo) {
        double extremoInferior;
        double extremoSuperior;

        if (this.incluye(intervalo.getExtremoInferior()))
            extremoInferior = this.getExtremoInferior();
        else
            extremoInferior = intervalo.getExtremoInferior();

        if (this.incluye(intervalo.getExtremoSuperior()))
            extremoSuperior = this.getExtremoSuperior();
        else
            extremoSuperior = intervalo.getExtremoSuperior();
        return new IntervaloPL(extremoInferior, extremoSuperior);
    }

    public IntervaloPL interseccion(IntervaloPL i) {
        IntervaloPL result = null;

        if (this.incluye(i))
            result = new IntervaloPL(i);
        else if (i.incluye(this))
            result = new IntervaloPL(this);
        else if (this.incluye(i.getExtremoInferior()))
            result = new IntervaloPL(i.getExtremoInferior(), this.getExtremoSuperior());
        else if (i.incluye(this.getExtremoInferior()))
            result = new IntervaloPL(this.getExtremoInferior(), i.getExtremoSuperior());

        return result;
    }

    public static void main(String[] args) {
        IntervaloPL i1 = new IntervaloPL(2.0, 3.0);
        IntervaloPL i2 = new IntervaloPL(i1);
        IntervaloPL i3 = new IntervaloPL();
        IntervaloPL i4 = new IntervaloPL(5);
        IntervaloPL i5 = new IntervaloPL(2.0, 4);

        System.out.println("i1: " + i1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("i4: " + i4);
        System.out.println("i5: " + i5);

        System.out.println("longitud i5: " + i5.longitud());

        if (i5.incluye(i4)) {
            System.out.println(i5 + " incluye al intervalo " + i2);
        } else {
            System.out.println(i5 + " NO incluye al intervalo " + i2);
        }

    }

}//fin de clase
