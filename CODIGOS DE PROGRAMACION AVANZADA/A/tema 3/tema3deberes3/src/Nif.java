import java.util.Scanner;
public class Nif {

        private long dni;
        private char letra;

        public Nif(long var1) {
            this.dni = var1;
            this.asignarLetra();
        }

        public Nif() {
            this.recoger();
        }

        private void asignarLetra() {
            int var1 = (int)this.dni % 23;
            switch(var1) {
                case 0:
                    this.letra = 'T';
                    break;
                case 1:
                    this.letra = 'R';
                    break;
                case 2:
                    this.letra = 'W';
                    break;
                case 3:
                    this.letra = 'A';
                    break;
                case 4:
                    this.letra = 'G';
                    break;
                case 5:
                    this.letra = 'M';
                    break;
                case 6:
                    this.letra = 'Y';
                    break;
                case 7:
                    this.letra = 'F';
                    break;
                case 8:
                    this.letra = 'P';
                    break;
                case 9:
                    this.letra = 'D';
                    break;
                case 10:
                    this.letra = 'X';
                    break;
                case 11:
                    this.letra = 'B';
                    break;
                case 12:
                    this.letra = 'N';
                    break;
                case 13:
                    this.letra = 'J';
                    break;
                case 14:
                    this.letra = 'Z';
                    break;
                case 15:
                    this.letra = 'S';
                    break;
                case 16:
                    this.letra = 'Q';
                    break;
                case 17:
                    this.letra = 'V';
                    break;
                case 18:
                    this.letra = 'H';
                    break;
                case 19:
                    this.letra = 'L';
                    break;
                case 20:
                    this.letra = 'C';
                    break;
                case 21:
                    this.letra = 'K';
                    break;
                case 22:
                    this.letra = 'E';
            }

        }

        public boolean igual(Nif var1) {
            return this.dni == var1.dni && this.letra == var1.letra;
        }

        public void recoger() {
            Scanner var1 = new Scanner(System.in);
            System.out.println("Introduzca el nÃºmero de DNI: ");
            this.dni = var1.nextLong();
            this.asignarLetra();
        }

        public String toString() {
            return this.dniDigitsNumber() > 8 ? this.dni + "-" + this.letra : null;
        }

        private int dniDigitsNumber() {
            return Long.toString(this.dni).length();
        }

        public static void main(String[] var0) {
            Nif var1 = new Nif(33467502L);
            System.out.println(var1);
            System.out.println();
            Nif var2 = new Nif();
            System.out.println(var2);
            if (var1.igual(var2)) {
                System.out.println("son iguales");
            } else {
                System.out.println("Son distintos");
            }

        }
    }


