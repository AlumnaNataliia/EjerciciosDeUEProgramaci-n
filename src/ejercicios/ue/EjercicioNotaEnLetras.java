package ejercicios.ue;
import java.util.Scanner;
public class EjercicioNotaEnLetras {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce una nota (de 0 a 10): ");
		int nota = scanner.nextInt();
		if (nota < 0 || nota > 10) {
			System.out.println( " Error: Introducce una nota válida entre 0 y 10.");
			
		}else if (nota >= 0 && nota <= 4) {
			System.out.println("INSUFICIENTE");
		}else if (nota == 5) {
			System.out.println("SUFICIENTE");
		}else if (nota == 6) {
			System.out.println("BIEN");
		}else if (nota >= 7 && nota >= 8) {
			System.out.println("NOTABLE");
		}else if (nota == 9) {
			System.out.println("SOBRESALIENTE");
		}else if ( nota == 10) {
			System.out.println("MATRICULA DE HONOR");
		}
scanner.close();
	}

}
