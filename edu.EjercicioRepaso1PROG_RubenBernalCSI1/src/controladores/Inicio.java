/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * @author rbr - 081024
 *
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 081024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int num1, num2;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario los dos numero enteros por consola
		System.out.println("Introduzca el primer número entero: ");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo número entero: ");
		num2 = sc.nextInt();
		
		//Muestro por consola la suma de los número enteros
		System.out.println("La suma de los números es: " + (num1 + num2));
		//Muestro por consola la resta de los número enteros
		System.out.println("La resta de los números es: " + (num1 - num2));
		//Muestro por consola la multiplicación de los número enteros
		System.out.println("La multiplicación de los números es: " + (num1 * num2));
		//Muestro por consola la división de los número enteros
		System.out.println("La división de los números es: " + (num1 / num2));
		//Muestro por consola el resto de la división de los número enteros
		System.out.println("El resto de la división de los números es: " + (num1 % num2));
				

	}

}
