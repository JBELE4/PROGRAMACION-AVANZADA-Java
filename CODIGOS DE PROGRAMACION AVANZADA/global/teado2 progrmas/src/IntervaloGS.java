public class IntervaloGS {

        private double extremoInferior;
        private double extremoSuperior;

        public IntervaloGS() {
            this(0.0, 0.0);
        }

        public IntervaloGS(double extremoInferior, double extremoSuperior) {
            this.setExtremoInferior(extremoInferior);
            this.setExtremoSuperior(extremoSuperior);
        }

        public IntervaloGS(double extremoSuperior) {
            this(0.0, extremoSuperior);
        }

        public IntervaloGS(IntervaloGS i) {
            this(i.getExtremoInferior(), i.getExtremoSuperior());
        }

        public IntervaloGS(double extremoInferior, int longitud) {
            this(extremoInferior, extremoInferior + longitud);
        }

        private double getExtremoInferior() {
            return extremoInferior;
        }

        private void setExtremoInferior(double extremoInferior) {
            this.extremoInferior = extremoInferior;
        }

        private double getExtremoSuperior() {
            return extremoSuperior;
        }

        private void setExtremoSuperior(double extremoSuperior) {
            this.extremoSuperior = extremoSuperior;
        }

        public String toString() {
            return "[" + this.getExtremoInferior() + "," + this.getExtremoSuperior() + "]";
        }

        //    Calcular la longitud del intervalo
        public double longitud() {
            return this.getExtremoSuperior() - this.getExtremoInferior();
        }

        public boolean igual(IntervaloGS intervalo) {
            return this.getExtremoInferior() == intervalo.getExtremoInferior()
                    && this.getExtremoSuperior() == intervalo.getExtremoSuperior();
        }

        public boolean distinto(IntervaloGS intervalo) {
            return !this.igual(intervalo);
        }

        public void desplazar(double desplazamiento) {
            this.setExtremoInferior(this.getExtremoInferior()+desplazamiento);
            this.setExtremoSuperior(this.getExtremoSuperior()+desplazamiento);
        }

        // desplaza el intervalo al origen de coordenadas
        public void desplazar() {
            this.desplazar(-this.getExtremoInferior());
        }

        public boolean incluye(double punto) {
            return this.getExtremoInferior() <= punto && punto <= this.getExtremoSuperior();
        }

        // Si un intervalo incluye a otro
        public boolean incluye(IntervaloGS intervalo) {
            return this.incluye(intervalo.getExtremoInferior())
                    && this.incluye(intervalo.getExtremoSuperior());
        }

        public IntervaloGS union(IntervaloGS intervalo) {
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
            return new IntervaloGS(extremoInferior, extremoSuperior);
        }

        public IntervaloGS interseccion(IntervaloGS i) {
            IntervaloGS result = null;

            if (this.incluye(i))
                result = new IntervaloGS(i);
            else if (i.incluye(this))
                result = new IntervaloGS(this);
            else if (this.incluye(i.getExtremoInferior()))
                result = new IntervaloGS(i.getExtremoInferior(), this.getExtremoSuperior());
            else if (i.incluye(this.getExtremoInferior()))
                result = new IntervaloGS(this.getExtremoInferior(), i.getExtremoSuperior());

            return result;
        }

        public static void main(String[] args) {
            IntervaloGS i1 = new IntervaloGS(2.0, 3.0);
            IntervaloGS i2 = new IntervaloGS(i1);
            IntervaloGS i3 = new IntervaloGS();
            IntervaloGS i4 = new IntervaloGS(5);
            IntervaloGS i5 = new IntervaloGS(2.0, 4);

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

    } // Fin de la clase Intervalo

