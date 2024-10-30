package ejercicios.ue;

import java.util.Scanner;

public class calculadoraBasica {

	public static void main(String[] args) {
		//Declaración de variables
		int op1, op2, resta;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el primer numero:");
		op1=sc.nextInt(); //Lectura de valor int
		/*sc.next(); //Lectura de cadena de texto, hacta que encuenta un espacio
		sc.nextLine(); //Lectura de cadena de texto entera
		sc.nextDouble();//Lectura de valor double*/
		
		System.out.print("Dime el segundo numero:");
		op2=sc.nextInt();
		//Operaciones y mostrar resultados
		
		System.out.println("La suma de "+op1+" más "+op2+" es "+(op1+op2));
resta = op1 - op2;
if(op1>op2) {
	System.out.println("La resta de "+op1+" menos "+op2+" es "+resta);
}
else {
	System.out.println("La resta de "+op2+" menos "+op1+" es "+(op2-op1));
}
System.out.println("La multiplicación de "+op1+" por "+op2+" es "+(op1*op2));

if(op2==0) {
	System.out.println("El divisor es cero, no podemos hacer la división");
}
else {
	
}
System.out.println("La división de "+op1+" entre "+op2+" es "+(op1/op2));
if(op2==0) {
	System.out.println("El divisor es cero, no podemos obtener el resto");
}
else {
	System.out.println("La resto de "+op1+" y "+op2+" es "+(op1%op2));
}


op1 = op1+7;
op1 +=7;
	}

}
