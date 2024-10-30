package ejercicios.ue;
import java.util.Scanner;
public class EjercicioMayorMenorIgual {
public static void main(String[] args) {
	//Declaración de variables
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Dado el primer número: ");
	int num1 = sc.nextInt();
	
	System.out.print("Dado el segundo número: ");
	int num2 = sc.nextInt();
	
	
	
	if (num1 > num2) {
		System.out.println("El mayor es: " + num1);
		System.out.println("El menor es: " + num2);
		
	}
	else if (num1 < num2 ){
		System.out.println("El mayor es: " + num2);
		System.out.println("El menor es: " + num1);
	}
	else {
		System.out.print("Ambos números son iguales.");
	}
	sc.close();
	
	}
	
	
}

