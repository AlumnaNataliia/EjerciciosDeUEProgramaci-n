package ejercicios.ue;
import java.util.Scanner;
public class EjerciciosFigurasGeometricos {

	public static void main(String[] args) {
		try (// Calcula el área y perímetro de una de las siguientes figuras.
		Scanner teclado = new Scanner(System.in)) {
			int figura;
			double lado, base, altura, area, perimetro;
			
			//Menu
				System.out.println("=== Calcular Area y Perimetro De Figuras Geometricas ===");
				System.out.println("1.- Cuadrado");
				System.out.println("2.- Rectangulo");
				System.out.println("3.- Triangulo");
				
				System.out.println("Selecciona Una Figura Geométrica (1-3)");
				figura = teclado.nextInt();
				
				//Operaciones matemáticas
				if(figura >= 1 && figura <=3) {
					switch(figura) {
					case 1:
						System.out.println("Cuanto Mide Un Lado");
						lado = teclado.nextDouble();
						area = lado * lado;
						perimetro = lado * 4;
						System.out.println("El Area Del Cuadro Es " + area);
						System.out.println("El Perimetro Del Cuadro Es " +perimetro);
						break;
					case 2:
						System.out.println("Cuanto Mide Su Base");
						base = teclado.nextDouble();
						System.out.println("Cuanto Mide Su Altura");
						altura = teclado.nextDouble();
						area = base * altura;
						perimetro = (base * 2) + (altura * 2);
						System.out.println("El Area Del Rectangulo Es " + area);
						System.out.println("El Perimetro Del Rectangulo Es " + perimetro);
						break;
					case 3:
						System.out.println("Cuanto Mide Su Base");
						base = teclado.nextDouble();
						System.out.println("Cuatno Mide Su Altura");
						altura = teclado.nextDouble();
						area = (base * altura) / 2;
						perimetro = base + altura + Math.sqrt(base * base + altura *altura);
						System.out.println("El Area Del Triangulo  Es " + area);
						System.out.println("El Perimetro Del Triangulo Rectangulo Es " + perimetro);
						break;
					
						
					}
				}
				else {
					System.out.println("Error: La Figura Geometrica No Existe");
					
				}
		}
		
		//Saludos
			System.out.println("Gracias por visitar el calculador de perímetro y área.");
			System.out.println("¡Hasta luego!");
	}

	}
	

