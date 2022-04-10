package Pr12;

/**
 * 
 * @author joseporiollopezbosch
 *Ejercicio 13 UD5_TA05 
 *Sistema de loggin simple con 3 intentos
 */

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		
		//Valor of password
		String password = "1234";
		String inputPassword="";
		int attempts=0;
		boolean login = false;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			attempts++;
		
			if(login != true) {
				System.out.println("Introduce el password de tu usuario: ");
				inputPassword = scan.nextLine();
				
				if(password.equals(inputPassword)) {
					System.out.println("Enhorabuena, te has loggeado");
					login = true;
				}else {
					if(attempts!=3) {
						System.out.println("Vuelve a intentarlo\n");	
					}
				}
			}
			
		}while(attempts <3 || login == true);
		scan.close();
		if(login==false) {
			System.out.println("Contacta con tu administrador para recuperar tu contraseña");
		}
	}

}
