package EjerciciosArrays;
import java.util.Scanner;
public class unidad4 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int [3][3];
		for (int fila =0; fila<= matriz.length; fila++) {
			for(int columna =0; columna<= matriz.length; columna++) {
				System.out.println("Introduzca el contenido de la pasición["+fila+","+columna+"]:");
				matriz [fila] [columna]=teclado.nextInt();
			}
		}
		
System.out.println("====Contenido de matriiz====");
for (int fila=0; fila<= matriz.length; fila++) {
	for(int columna =0; columna<= matriz.length; columna++) {
		System.out.println("Introduzca el contenido de la pasición["+fila+","+columna+"]:");
		System.out.println(matriz [fila][columna]);
	}
}
	}

}
