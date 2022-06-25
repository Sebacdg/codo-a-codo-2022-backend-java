package codo.a.codo;

public class Arrays {

	public static void main(String[] args) {
		//array de enteros
		int [] array = new int[4]; // 0 - 2
		
		//String[] nombres = new String[2] {"nombre1", "nombre2"};		
		array[0] = 10;
		array[1] = 11;
		array[2] = 12;
		array[3] = 13;//Error
		
		System.out.println("FIN");
		//recorrer array de enteros?
		for(int i=0; i< array.length; i++) {
			System.out.println(array[i]);
		}
		//quiero mostrar solo el indice 3
		System.out.println("Mostrando valor del indice 3: " + array[3]);
	
	//recorrer el array usando foreach
		// en js era for (let aux of array)
		for (int aux : array) {
			System.out.println(aux);
		}
	}
}
