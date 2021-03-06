public class BurbujeoSeleccion {
	int[] intArray = new int[10];

	public BurbujeoSeleccion(){
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) Math.floor(Math.random() * 101);
		}
	}

	/**
	 * Imprimir Array
	 * @return
	 */
	public String imprimirArr () {
		String s = "";
		for (int i = 0; i < intArray.length; i++) {
			s += intArray[i] + " ";
		}

		return s;
	}

	/**
	 * Ordena el arreglo por el metodo Seleccion
	 */
	public void ordenarSeleccion() {
		for (int i = 0; i < intArray.length-1; i++) {
			int aux = i;
			for (int j = i+1; j < intArray.length; j++) {				
				if (intArray[j] < intArray[aux]) {
					aux = j;
				}
			}
			int aux2 = intArray[i];
			intArray[i] = intArray[aux];
			intArray[aux] = aux2;
		} 
	}
	
	/**
	 * Ordena el arreglo por el metodo Burbuja
	 */
	public void ordenarBurbuja() {
		int aux;
		for (int i = 0; i < intArray.length-1; i++) {
			for (int j = 0; j < intArray.length-1; j++) {				
				if(intArray[j+1]<intArray[j]){
					aux=intArray[j+1];
					intArray[j+1]=intArray[j];
					intArray[j]=aux;
				}
			} 
		}
	}
}