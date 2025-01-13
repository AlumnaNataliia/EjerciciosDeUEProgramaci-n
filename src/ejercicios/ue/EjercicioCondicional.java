package ejercicios.ue;

import java.util.Scanner;

public class EjercicioCondicional {

	public static void main(String[] args) {
		//Declaración de variables
		int edad;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu edad: ");
		
		edad = sc.nextInt();
		
		
		if(edad>=18) {
			if(edad>18 && edad<=30) {
				System.out.println("Perteneces a la generación Z");
			}
			
			else {System.out.println("Perteneces a la generación H");
			  }
			}
		else {
			System.out.println("No puedes votar");
		
		}
		System.out.println("Prueba condicional compuesto");
		sc.close();
		}
}

