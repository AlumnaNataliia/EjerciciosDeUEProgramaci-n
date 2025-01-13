package ejercicios.ue;
import java.util.Scanner;
public class EjercicioCalcularElSueldoDeUnTrabajador {
		//Constante
	public static final double Trabajador_clase_A =25.0;
	public static final double Trabajador_clase_B =20.0;
	public static final double Trabajador_clase_C =15.0;
	public static final double Trabajador_clase_D =10.0;
	public static final double IRPF_BAJO = 0.15;
	public static final double IRPF_ALTO = 0.20;
	public static final double LIMITE_SALARIO = 1200.0;
	
	public static void main(String[] args) {
		// Elaborar un programa para calcular el sueldo de un trabajador, a partir de las horas trabajadas en la semana y la clase a la que pertenece
		Scanner teclado = new Scanner(System.in);
		char clase;
		double sueldo, horas, sueldoNeto;
		String continuar;
		do {
		//Menu
		System.out.println("==Bienvenido a tu calculadora de salarios==");
		System.out.println("Escribe tus horas de trabajo:  ");
		horas = teclado.nextDouble();
		
		if (horas < 0) {
			System.out.println("Las horas trabajadas no pueden ser negativas.");
		} else {
		System.out.println("Escribe que clase de trabajador eres (A,B,C,D):  ");
		clase = teclado.next().charAt(0);
		clase = Character.toUpperCase(clase);
		
		//Operaciones matemáticas
		
			switch(clase) {
			case 'A':
				
				sueldo = horas * Trabajador_clase_A; 
				System.out.println("Tu sueldo es: "+ sueldo);
				break;
			case 'B':
				sueldo = horas * Trabajador_clase_B;
				System.out.println("Tu sueldo es: "+ sueldo);
				break;
			case 'C':
				sueldo = horas * Trabajador_clase_C; 
				System.out.println("Tu sueldo es: "+ sueldo);
				break;
			case 'D':
				sueldo = horas * Trabajador_clase_D;
				System.out.println("Tu sueldo es: "+ sueldo);
				break;
				default:
					System.out.println("Clase no válida.");
					sueldo =0;
					break;
				
		}
			//Calcular sueldo neto con retención de IRPF
			if ( sueldo > 0) {
				if (sueldo <= LIMITE_SALARIO) {
					sueldoNeto = sueldo * (1 - IRPF_BAJO);
				} else {
					sueldoNeto = sueldo * (1 - IRPF_ALTO);
				}
				System.out.println("Tu sueldo bruto es: " + sueldo);
				System.out.println("Tu sueldo neto después de retenciones es: " + sueldoNeto);
			}
		}
		System.out.println("¿Deseas calcular otro sueldo? (S/N): ");
		continuar =teclado.next();
		} while (continuar.equalsIgnoreCase("S"));
			System.out.println("Gracias por tu trabajo!");
		teclado.close();
			
			
		}
	
			
	}


