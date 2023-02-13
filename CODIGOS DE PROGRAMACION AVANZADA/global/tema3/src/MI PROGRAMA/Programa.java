class Programa {
	public static void main(String[] args) {

		java.util.Scanner s = new java.util.Scanner(System.in)
				.useDelimiter(System.getProperty("line.separator"));

		System.out.print("Introduce el numero de fracciones: ");
		int numFracciones = s.nextInt();

		Fraccion[] fracciones = new Fraccion[numFracciones];

		System.out.println("Fracciones:");
		for (int i = 0; i < fracciones.length; i++) {
			fracciones[i] = new Fraccion();
			fracciones[i].recogerTeclado();
		}

		System.out.println("Fracciones iguales:");
		for (int i = 0; i < fracciones.length; i++) {
			System.out.print("Fracciones iguales a ");
			System.out.println(fracciones[i]);
			for (int j = i + 1; j < fracciones.length; j++) {
				if (fracciones[i].igual(fracciones[j])) {
					System.out.println(fracciones[j]);
				}
			}
		}

		System.out.println("Fracciones equivalentes:");
		for (int i = 0; i < fracciones.length; i++) {
			System.out.print("Fracciones equivalentes a ");
			System.out.println(fracciones[i]);
			for (int j = i + 1; j < fracciones.length; j++) {
				if (fracciones[i].equivalente(fracciones[j])) {
					System.out.println(fracciones[j]);
				}
			}
		}

	}
}