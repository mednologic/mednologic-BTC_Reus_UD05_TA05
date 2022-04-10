package Pr11;
/**
 * 
 * @author joseporiollopezbosch
 *Ejercicio 13 UD5_TA05 
 *Introducción de un día y responde si es laboral o no
 */

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un día de la semana: ");
		//Demand of input
		String dia = scan.nextLine();
		scan.close();
		
		switch(dia.toLowerCase()) {
		
		case "lunes":
			System.out.println("Lunes és laboral");
			break;
		case "martes":
			System.out.println("Martes és laboral");
			break;
		case "miercoles":
			System.out.println("Miercoles és laboral");
			break;
		case "jueves":
			System.out.println("Jueves és laboral");
			break;
		case "viernes":
			System.out.println("Viernes és laboral");
			break;
		case "sabado":
			System.out.println("Sabado és laboral");
			break;
		case "domingo":
			System.out.println("Domingo no és laboral");
			break;
		default:
			System.out.println("Has introducido un dato incorrecto, el dato no corresponde a ningún dia de la semana");
			break;
		}

	}

}
