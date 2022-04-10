package Pr04;

/**
 * 
 * @author joseporiollopezbosch
 *Ejercicio 13 UD5_TA05 
 *Cálculo del área de un círculo
 */
import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		Double circleArea;
		
//Asking for the ratio value
		System.out.println("Introducir valor del radio: ");
		Double radius = Double.parseDouble(scan.nextLine());
		scan.close();
		
		circleArea = Math.PI * radius * radius;
		
		System.out.println("El àrea del círculo con radio "+radius+" es: "+circleArea);
		

	}

}
