import java.util.Arrays;

    public class NumberSeparator {

        public static void main(String[] args) {

			// se declara e inicializa el array de números enteros
            int[] numbers = { 3, 4, 6, 2, 5, 1, 0, 10, 11 };

            int evenNumbersCount = 0;
            int oddNumbersCount = 0;

            // Contar el número de pares e impares
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    evenNumbersCount++;
                } else {
                    oddNumbersCount++;
                }
            }

            // Crear los nuevos arrays
            int[] evenNumbers = new int[evenNumbersCount];
            int[] oddNumbers = new int[oddNumbersCount];

            // Copiar los números al array correspondiente
            evenNumbersCount = 0;
            oddNumbersCount = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    // Insertar en array de pares
                    evenNumbers[evenNumbersCount] = numbers[i];
                    evenNumbersCount++;
                } else { // Insertar en array de impares
                    oddNumbers[oddNumbersCount] = numbers[i];
                    oddNumbersCount++;
                }
            }

            System.out.println("Enteros");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();

            System.out.println("Pares");
            for (int i = 0; i < evenNumbers.length; i++) {
                System.out.print(evenNumbers[i] + " ");
            }
            System.out.println();

            System.out.println("Impares");
            for (int i = 0; i < oddNumbers.length; i++) {
                System.out.print(oddNumbers[i] + " ");
            }
            System.out.println();

        }

    }

