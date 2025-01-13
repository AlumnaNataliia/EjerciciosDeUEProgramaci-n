package EjerciciosArrays;

import java.util.Scanner;

public class NumeroMatriz {

	public static void main(String[] args) {
		//Variables
int numeros [][] = new int [3][3];
Scanner sc = new Scanner(System.in);
 //Bucle para ir guardar valores en el array
//Recorre las columnas con la letra j dentro de cada fila con la lenta i
for(int i=0; i<numeros.length;i++) {
	for(int j=0;j<numeros[i].length;j++) {


		System.out.println("Dime el numero a guardar: ");
		numeros[i][j]=sc.nextInt();
	}
}
for(int i=0; i<numeros.length;i++) {
	for(int j=0;j<numeros[i].length;j++) {
		
		System.out.println(" "+numeros[i][j]+ " ");
		numeros[i][j]=sc.nextInt();
	

	}
System.out.println(" ");
sc.close();
}
	}
}
	
	