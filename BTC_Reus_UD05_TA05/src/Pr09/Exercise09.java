package Pr09;

/**
 * 
 * @author joseporiollopezbosch
 *Ejercicio 13 UD5_TA05 
 *Muestra por pantalla los números divisibles por 2 y 3 en el rango del 1 al 100
 */

public class Exercise09 {

	public static void main(String[] args) {

		for(int i=1; i<101; i++) {
			if(i%2==0) {
				System.out.println("Divisible entre 2 : "+i);
			}else if(i%3==0) {
				System.out.println("Divisible entre 3 : "+i);
			}
		}
	}
}
