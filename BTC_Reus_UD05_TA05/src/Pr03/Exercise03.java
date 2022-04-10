package Pr03;

/**
 * 
 * @author joseporiollopezbosch
 *Ejercicio 13 UD5_TA05 
 *Saludo usuario con introducción por el usuario
 */

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
//Declaration
		Scanner scan 	= new Scanner(System.in);
		
		System.out.println("Introduce tu nombre porfavor");
		String nombre 	= scan.nextLine(); //Asking name to the user
		
		scan.close(); //Closing the scanner
		
		System.out.println("\nBienvenido "+nombre);
//Logic

	}

}
