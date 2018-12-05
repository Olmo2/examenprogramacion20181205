package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2,5 puntos
	 * 
	 * Escribe en el método 'main' un programa que obtenga el desglose en billetes
	 * y monedas de una cantidad exacta de euros que el usuario introducirá por teclado.
	 * Hay billetes de 500, 200, 100, 50, 20, 10 y 5 euros y monedas de 1 y 2 euros.
	 * Por ejemplo, si deseamos conocer el desglose de 434 euros, el programa mostrará
	 * por pantalla el siguiente resultado:
	 * 
	 * 		2 billetes de 200 euros.
	 * 		1 billete de 20 euros.
	 * 		1 billete de 10 euros.
	 * 		2 monedas de 2 euros.
	 * 
	 * Una vez ejecutado el programa, el usuario podrá realizar tantos desgloses como
	 * desee hasta que decida finalizar su ejecución. 
	 * El programa comprobará que la cantidad introducida sea una cantidad positiva
	 * mayor que 0. En caso contrario mostrará un mensaje de error y volverá a pedirla.
	 */
	
	public static void main(String[] args) {
		int cantidad ;
	
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Qué Cantidad que deseas desglosar? ");
		cantidad = teclado.nextInt();
		if (cantidad > 0) {
			if(cantidad / 500 > 0) {
				System.out.println(cantidad / 500 + " billetes de 500 euros.");
			}
			if((cantidad -= 500 * (cantidad / 500)) / 200 > 0) {
				System.out.println(cantidad / 200 + " billetes de 200 euros.");
			}
			if((cantidad -= 200 * (cantidad / 200)) / 100 > 0) {
				System.out.println(cantidad / 100 + " billetes de 100 euros.");
			}
			if((cantidad -= 100 * (cantidad / 100)) / 50 > 0) {
				System.out.println(cantidad / 50 + " billetes de 50 euros.");
			}
			if((cantidad -= 50 * (cantidad / 50)) / 20 > 0) {
				System.out.println(cantidad/ 20 + " billetes de 20 euros.");
			}
			if((cantidad -= 20 * (cantidad / 20)) / 10 > 0) {
				System.out.println(cantidad/ 10 + " billetes de 10 euros.");
			}
			if((cantidad -= 10 * (cantidad / 10)) / 5 > 0) {
				System.out.println(cantidad / 5 + " billetes de 5 euros.");
			}
			if((cantidad -= 5 * (cantidad / 5)) / 2 > 0) {
				System.out.println(cantidad / 2 + " monedas de 2 euros.");
			}
			if((cantidad -= 2 * (cantidad / 2)) / 1 > 0) {
				System.out.println(cantidad / 1 + " monedas de 1 euro.");
		}
		}else {
			System.out.println("Introduce una cantidad positiva porfavor: ");
			cantidad = teclado.nextInt();
	}
	}
}
