package Pr10;

/**
 * 
 * @author joseporiollopezbosch
 *Ejercicio 13 UD5_TA05 
 *Caja registradora, muestra el precio final
 */

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce cantidad de ventas");
		int cantidadVentas = Integer.parseInt(scan.nextLine());
		//inicializamos variable
		float precioFinal=0;
		
		//Begins from 1 to make a real chain of numbers
		for(int i=1; i<=cantidadVentas; i++){
			System.out.println("Introduce el precio del producto "+i+"/"+cantidadVentas);
			precioFinal = precioFinal+(Float.parseFloat(scan.nextLine()));
		}
		scan.close();
		System.out.println("El precio final es: "+precioFinal);
	}
}
