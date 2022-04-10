package Pr06;

/**
 * 
 * @author joseporiollopezbosch
 *Ejercicio 13 UD5_TA05 
 *Calculadora de precio final con iva
 */

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final float IVA=21;
		float numPlusIVA;
		
		System.out.println("Introduce un número");
		
		float num = Float.parseFloat(scan.nextLine());
		scan.close();
		//Calculate IVA
		
		numPlusIVA = num+(num*(IVA/100));
		
		System.out.println("El precio final es: "+numPlusIVA);
		

	}

}
