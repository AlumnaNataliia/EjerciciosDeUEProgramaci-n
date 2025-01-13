package ejercicios.ue;
import java.util.Scanner;
public class EjercicioNotasArrayBit {


	public static void main(String[] args) {
		// Declaración de variables
		Scanner sc =new Scanner(System.in);
		int opcion;
		boolean existe = false;
		String DNI, nombre, nota;
		String arrayAlumnos [][] = new String [25][3];
		System.out.println("Menu de opciones");
		System.out.println("1. - Insertar alumnos");
		System.out.println("6. - Salir");
		opcion=sc.nextInt();
		do {
			
		switch(opcion) {
			case 1: System.out.println("Dime tu DNI: ");
				DNI = sc.next();
				for(int i=0;i<arrayAlumnos.length;i++) {
					if(arrayAlumnos[i][0].equals(DNI)) {
						System.out.println("No se puede insertar, ya existe");
					existe=true;
						i=arrayAlumnos.length;// o usamos break;
					
					}
				}
				if(!existe) {for(int i=0;i<arrayAlumnos.length;i++) {
					if(arrayAlumnos[i][0]==null) {
						//Pido los datos y los guardo
						arrayAlumnos[i][0]=DNI;
						System.out.println("Dime tu nombre: ");
						arrayAlumnos[i][1]=sc.next();
						System.out.println("Dime tu nota: ");
						arrayAlumnos[i][2]=sc.next();
						break;
					}
				}
					
				}
			break;
			case 6: System.out.println("Hasta pronto");
				break;	
			default:
			}
		} while(opcion!=6);
		sc.close();
	}

}
