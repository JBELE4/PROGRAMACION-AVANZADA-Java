class TableManager {
	public static void main(String args[]) {

		// se declara e inicializa la tabla bidimensional
		int[][] tabla = { { 7, 0, 2, 1, 0, 1 }, { 3, 0, 0, 2 }, { 7, 9, 0 },
				{ 6, 5, 0, 1, 0, 2, 0 } };

		// tabla.length -> longitud de la primera dimensi�n
		// tabla[indice].length -> longitud de la segunda dimensi�n

		// comprimir eliminando ceros
		//Recorrer el array y por cada fila
		//Contar el número de ceros
		//Crear un array con el nuevo tamaño (quitando los ceros)
		//copiar los números que no son 0 al nuevo array
		for (int i = 0; i < tabla.length; i++) {
			int noCeros = 0;
			for (int j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] != 0)
					noCeros++;
			}
			// se reserva justo lo que se necesita
			int[] secuenciaAux = new int[noCeros];

			for (int j = 0, k = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] != 0) {
					secuenciaAux[k] = tabla[i][j];
					k++;
				}
			}
			tabla[i] = secuenciaAux;
		}

		// ordenar por longitud
		//Mientras haya intercambios
		//Recorrer el array comparando posición i con i+1
		//si tamaño posicion i > tamaño posicion i+1
		//intercambio
		boolean cambio;
		do {
			cambio = false;
			for (int i = 0; i < tabla.length - 1; i++)
				if (tabla[i].length > tabla[i + 1].length) {
					int[] sAux = tabla[i];
					tabla[i] = tabla[i + 1];
					tabla[i + 1] = sAux;
					cambio = true;
				}
		} while (cambio);

		// se visualiza para comprobar
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++)
				System.out.print(tabla[i][j] + " ");
			System.out.println();

		}
	}
}