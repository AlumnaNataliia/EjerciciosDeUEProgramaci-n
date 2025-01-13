package ejercicios.ue;
import java.util.Scanner;
public class EjercicioPrecioFinalProducto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//La base imponible.
		System.out.print("Introduzca la base imponible: ");
		double baseImponible =scanner.nextDouble();
		
		//IVA
		System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
		String tipoIva = scanner.next().toLowerCase();
		
		//Promocional
		System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
		String codigoPromocional = scanner.next().toLowerCase();
		
		//Determinación del  % de IVA
		double procentajeIva=0;
		switch (tipoIva) {
		case "general":
			procentajeIva=0.21;
			break;
		case "reducido":
			procentajeIva=0.10;
			break;
		case "superreducido":
			procentajeIva=0.04;
			break;
			default:
				System.out.println("Tipo de IVA no válido.");
				return;
		
		}
		//Calcular precio con IVA
		double iva = baseImponible * procentajeIva;
		double precioConIva = baseImponible + iva;
		
		//Usar promocional
		double descuento = 0;
		switch (codigoPromocional) {
		case "nopro":
			descuento= 0;
			break;
		case "mitad":
			descuento = precioConIva /2;
			break;
		case "meno5":
			descuento = 5;
			break;
		case "5porc":
			descuento = precioConIva * 0.05;
			break;
			default:
				System.out.println("Código promocional no válido.");
				return;
		}
		//Calcular precio final
		double precioFinal = precioConIva - descuento;
		
		//Resultado
		System.out.printf("Base imponible    %.2f%n", baseImponible);
		System.out.printf("IVA (%.0f%%)         %.2f%n", procentajeIva * 100, iva);
		System.out.printf("Precio con IVA    %.2f%n.", precioConIva);
		System.out.printf("Cód. promo. (%s): -%.2f%n", codigoPromocional,descuento);
		System.out.printf("TOTAL             %.2f%n", precioFinal);
		
		scanner.close();
	
		
	}

}
