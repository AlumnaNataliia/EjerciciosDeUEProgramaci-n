package ejercicios.ue;
import java.util.Scanner;  

public class EjercicioIVA {  
    public static void main(String[] args) {  
        calcularPrecioFinal();  
    }  

    public static void calcularPrecioFinal() {  
        Scanner scanner = new Scanner(System.in);  

        // Solicitar la base imponible  
        System.out.print("Introduzca la base imponible: ");  
        double baseImponible = scanner.nextDouble();  

        // Solicitar el tipo de IVA  
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");  
        String tipoIVA = scanner.next().toLowerCase();  

        // Definir los tipos de IVA  
        double iva;  
        if (tipoIVA.equals("general")) {  
            iva = 0.21;  
        } else if (tipoIVA.equals("reducido")) {  
            iva = 0.10;  
        } else if (tipoIVA.equals("superreducido")) {  
            iva = 0.04;  
        } else {  
            System.out.println("Tipo de IVA inválido.");  
            return;  
        }  

        // Solicitar el código promocional  
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");  
        String codigoPromocional = scanner.next().toLowerCase();  

        // Calcular el IVA y el precio con IVA  
        double ivaCalculado = baseImponible * iva;  
        double precioConIVA = baseImponible + ivaCalculado;  

        // Aplicar el código promocional  
        double descuento;  
        if (codigoPromocional.equals("nopro")) {  
            descuento = 0;  
        } else if (codigoPromocional.equals("mitad")) {  
            descuento = precioConIVA / 2;  
        } else if (codigoPromocional.equals("meno5")) {  
            descuento = 5;  
        } else if (codigoPromocional.equals("5porc")) {  
            descuento = precioConIVA * 0.05;  
        } else {  
            System.out.println("Código promocional inválido.");  
            return;  
        }  

        // Calcular el total final  
        double total = precioConIVA - descuento;  

        // Mostrar resultados  
        System.out.printf("Base imponible : %.2f\n", baseImponible);  
        System.out.printf("IVA (%.0f%%) : %.2f\n", iva * 100, ivaCalculado);  
        System.out.printf("Precio con IVA : %.2f\n", precioConIVA);  
        System.out.printf("Cód. promo. (%s): -%.2f\n", codigoPromocional, descuento);  
        System.out.printf("TOTAL : %.2f\n", total);  
        scanner.close();
    }  
}