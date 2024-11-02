package ejercicios.ue;

import java.util.Scanner;
public class EjercicioConProfeParEImpar {
public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame el  número: ");
		num1=sc.nextInt();
		
		if(num1%2==0)System.out.println("El numero es par");
		
		else System.out.println("El numero es impar");
		
		sc.close();
	}

}
