package Pr13;

/**
 * 
 * @author joseporiollopezbosch
 * Ejercicio 13 UD5_TA05 
 * Calculadora
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercise13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int oper1,oper2;
		double result;
		String aritSign = "";
		
		//Demand of inputs
		System.out.println("Introduce un valor entero: ");
		oper1 = Integer.parseInt(scan.nextLine());
		
		System.out.println("Introduce otro valor entero: ");
		oper2 = Integer.parseInt(scan.nextLine());
		
		System.out.println("Introduce un valor aritmetico: ('+', '-', '*', '/', '^', '%')");
		aritSign = scan.nextLine();
		
		scan.close();
		
//Logic + JOptionPäne
		switch(aritSign) {
		
		case "+":
			result = oper1 + oper2; 
			JOptionPane.showMessageDialog(null, "El resultado de la operacion de "+oper1+ " + "+oper2+" es: "+result);
			break;
		case "-":
			result = oper1 - oper2;
			JOptionPane.showMessageDialog(null, "El resultado de la operacion de "+oper1+ " - "+oper2+" es: "+result);
			break;
		case "*":
			result = oper1 * oper2;
			JOptionPane.showMessageDialog(null, "El resultado de la operacion de "+oper1+ " * "+oper2+" es: "+result);
			break;
		case "/":
			result = oper1 / oper2;
			JOptionPane.showMessageDialog(null, "El resultado de la operacion de "+oper1+ " / "+oper2+" es: "+result);
			break;
		case "^":
			result = Math.pow((double)oper1, (double)oper2);
			JOptionPane.showMessageDialog(null, "El resultado de la operacion de "+oper1+ " ^ "+oper2+" es: "+result);
			break;
		case "%":
			result = oper1 % oper2;
			JOptionPane.showMessageDialog(null, "El resultado de la operacion de "+oper1+ " % "+oper2+" es: "+result);
			break;
		default:
			JOptionPane.showMessageDialog(null, "El signo introducido para operar no es válido");
			break;
		}
		
	}

}
