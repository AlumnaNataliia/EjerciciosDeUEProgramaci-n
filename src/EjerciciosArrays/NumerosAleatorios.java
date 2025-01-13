package EjerciciosArrays;

import java.util.Scanner;
import java.util.Random;

/*
 * Crear una matriz de 5filas
 * y n columnas (se pide al usuario). 
 * Rellenarlo con números aleatorios entre 0 y 10.
 */
public class NumerosAleatorios {

	public static void main(String[] args) {
		// Variables
		final int FILAS =5;
		int columnas;
		
		Scanner sc = new Scanner(System.in);
		int array [][];
		Random rd = new Random();
		
		System.out.print("Cuantos columnos quieres crear: ");
		columnas=sc.nextInt();
		array= new int [FILAS][columnas];
		
		for(int i=0;i<array.length; i++) {
			
			for(int j=0;j<array[i].length;j++) {
				rd.nextInt(11+0);
			}
		}
		
		

		for(int i=0;i<array.length; i++) {
			
			for(int j=0;j<array[i].length;j++) {
				System.out.println(" "+array[i][j]+ " ");
			}
			System.out.println(" ");
		}
			
	}

}
