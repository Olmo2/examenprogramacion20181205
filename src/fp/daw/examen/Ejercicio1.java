package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio1 {
	
	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'contiene' que
	 * reciba dos parámetros: un vector de cadenas de caracteres y una cadena.
	 * El método retornará true si la cadena recibida en el segundo parámetro
	 * se encuentra almacenada en el vector y false en caso contrario.
	 * El método incluirá una única sentencia 'return' y no está permitido el
	 * uso de variables booleanas.
	 */
	
	public static boolean contiene (String [] vector , String txt ) {
//		for (int i=0; i < vector.length; i++) 
//			if (txt.equals(vector[i])) 
//				return true;	
//			return false;
		
		int i =0;
		while(i < vector.length && !txt.equals(vector[i]) )
			i++;
	
//		if (i < vector.length)
//			return true;
//		else 
//			return false;
		
		return i < vector.length;
		}

	
	/*
	 * 0,25 puntos
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba
	 * el método 'contiene' mostrando por pantalla el resultado de su ejecución. 
	 */
	
	public static void main(String[] args) {
		
		String [] vector = {"c1" , "c3" , "c4", "c5"};
		System.out.println(contiene(vector , "hola"));
	}

}
