public class Intervalops {


        private double extremoInferior;
        private double extremoSuperior;

        public Intervalops() {
            this(0.0, 0.0);
        }

        public Intervalops(double extremoInferior, double extremoSuperior) {
            this.extremoInferior = extremoInferior;
            this.extremoSuperior = extremoSuperior;
        }

        public Intervalops(double extremoSuperior) {
            this(0.0, extremoSuperior);
        }

        public Intervalops(Intervalops i) {
            this(i.extremoInferior, i.extremoSuperior);
        }

        public Intervalops(double extremoInferior, int longitud) {
            this(extremoInferior, extremoInferior + longitud);
        }

        public String toString() {
            return "[" + this.extremoInferior + "," + this.extremoSuperior + "]";
        }

        //    Calcular la longitud del intervalo
        public double longitud() {
            return this.extremoSuperior - this.extremoInferior;
        }

        public boolean igual(Intervalops intervalo) {
            return this.extremoInferior == intervalo.extremoInferior
                    && this.extremoSuperior == intervalo.extremoSuperior;
        }

        public boolean distinto(Intervalops intervalo) {
            return !this.igual(intervalo);
        }

        public void desplazar(double desplazamiento) {
            this.extremoInferior = this.extremoInferior + desplazamiento;
            this.extremoSuperior = this.extremoSuperior + desplazamiento;
        }

        // desplaza el intervalo al origen de coordenadas
        public void desplazar() {
            this.desplazar(-this.extremoInferior);
        }

        public boolean incluye(double punto) {
            return this.extremoInferior <= punto && punto <= this.extremoSuperior;
        }

        // Si un intervalo incluye a otro
        public boolean incluye(Intervalops intervalo) {
            return this.incluye(intervalo.extremoInferior)
                    && this.incluye(intervalo.extremoSuperior);
        }

        public Intervalops union(Intervalops intervalo) {
            double extremoInferior;
            double extremoSuperior;

            if (this.incluye(intervalo.extremoInferior))
                extremoInferior = this.extremoInferior;
            else
                extremoInferior = intervalo.extremoInferior;

            if (this.incluye(intervalo.extremoSuperior))
                extremoSuperior = this.extremoSuperior;
            else
                extremoSuperior = intervalo.extremoSuperior;
            return new Intervalops(extremoInferior, extremoSuperior);
        }

        public Intervalops interseccion(Intervalops i) {
            Intervalops result = null;

            if (this.incluye(i))
                result = new Intervalops(i);
            else if (i.incluye(this))
                result = new Intervalops(this);
            else if (this.incluye(i.extremoInferior))
                result = new Intervalops(i.extremoInferior, this.extremoSuperior);
            else if (i.incluye(this.extremoInferior))
                result = new Intervalops(this.extremoInferior, i.extremoSuperior);

            return result;
        }

        public static void main(String[] args) {
            Intervalops i1 = new Intervalops(2.0, 3.0);
            Intervalops i2 = new Intervalops(i1);
            Intervalops i3 = new Intervalops();
            Intervalops i4 = new Intervalops(5);
            Intervalops i5 = new Intervalops(2.0, 4);

            System.out.println("i1: " + i1);
            System.out.println("i2: " + i2);
            System.out.println("i3: " + i3);
            System.out.println("i4: " + i4);
            System.out.println("i5: " + i5);

            System.out.println("longitud i5: " + i5.longitud());

            if (i5.incluye(i4)) {
                System.out.println(i5 +" incluye al intervalo "+i2);
            }
            else {
                System.out.println(i5 +" NO incluye al intervalo "+i2);
            }

        }

    // Fin de la clase Intervalo

}
