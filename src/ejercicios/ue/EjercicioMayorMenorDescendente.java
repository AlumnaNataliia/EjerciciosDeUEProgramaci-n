package ejercicios.ue;
import java.util.Arrays;
import java.util.Scanner;

public class EjercicioMayorMenorDescendente {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Introduce el primer número: ");
	int num1 = scanner.nextInt();
	System.out.print("Introduce el segundo número: ");
	int num2 = scanner.nextInt();
	System.out.print("Introduce el tercer número: ");
	int num3 = scanner.nextInt();
	int[] nums = { num1, num2, num3};
	Arrays.sort(nums);
	
	System.out.println("Orden descendente: " + nums[2] + "," + nums [1] + "," + nums[0]);
	System.out.println("El mayor es: " + nums[2]);
	System.out.println("El menor es: " + nums[0]);
	scanner.close();
	
}
}
