package fp.daw.examen;

public class Ejercicio2 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'stringToArray' que
	 * reciba a través de un parámetro formal un objeto de tipo String y retorne
	 * un vector de caracteres de la misma longitud que la cadena recibida que 
	 * contenga los mismos caracteres que ésta y en el mismo orden. 
	 */
	// Char -> array de caracteres
	public static char [] stringToArray(String cadena) {
		//Declaramos un vector de caracteres con la longitud de la cadena
		char [] vector = new char [cadena.length()];
		for(int i=0; i< vector.length; i++)
			// a cada posicion del vector se le asigna un caracter del String
			vector[i] = cadena.charAt(i);
		return vector;
	}
	
	
	/*
	 * 0,25 puntos
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba
	 * el método 'stringToArray' mostrando por pantalla el resultado de su ejecución. 
	 */
	
	public static void main(String[] args) {
		//llamamos al metodo
		char [] vector = stringToArray("hola");
		for(int i=0; i< vector.length; i++)
			System.out.println(vector[i]);
	}

}
