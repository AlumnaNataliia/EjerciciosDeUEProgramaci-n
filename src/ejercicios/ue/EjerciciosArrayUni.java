
package ejercicios.ue;
import java.util.Scanner;
public class EjerciciosArrayUni {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
final int POSICIONES = 4;

		int arrayNumeros []= new int [POSICIONES];
		double arrayNotas [] =new double [4];
		String arrayNombres [] = new String [7];
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el numero de posiciones: ");
		
//arrayNumeros = new int [POSICIONES];
		arrayNumeros[0] =9;
		arrayNumeros[3] = 8;//insertar un valor en la posición número 8
		System.out.println("Valor en la posicion 3: "+arrayNumeros[2]);
		System.out.println("Valor en la posicion 0: "+arrayNombres[0]);
for (int i=0; i<arrayNotas.length; i++) {
	System.out.print("Dime la nota del alumno: ");
	arrayNotas[i]=sc.nextDouble();
}
for (int i=0; i<arrayNotas.length; i++) {
	System.out.println("La nota de alumnos es: "+arrayNotas[i]);
	sc.close();
}

	}
}
