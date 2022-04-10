package Pr05;

/**
 * 
 * @author joseporiollopezbosch
 *Ejercicio 13 UD5_TA05 
 *Comprobador de Pares
 */

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		
		//Demand of input and parsing
		int num = Integer.parseInt(scan.nextLine());
		scan.close();
		
		if(num%2==0) {
			System.out.println("El número es divisible por 2");
		}else {
			System.out.println("El número no es divisible por 2");
		}
	}

}
