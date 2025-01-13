package ejercicios.ue;
import java.util.Scanner;
public class FigurasGeometricas {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			String respuesta;
			int figura;
			double lado, base, altura, hipotenusa, radio, area, perimetro;
			
			respuesta = "s";
			while(respuesta.equalsIgnoreCase("S")) {
				System.out.println("=== Calcular Area y Perimetro De Figuras Geometricas ===");
				System.out.println("1.- Cuadrado");
				System.out.println("2.- Rectangulo");
				System.out.println("3.- Triangulo Rectangulo");
				System.out.println("4.- Circunferencia");
				System.out.println("Selecciona Una Figura Geométrica (1-4)");
				figura = teclado.nextInt();
				
				if(figura >= 1 && figura <=4) {
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
						hipotenusa = Math.sqrt( (base*base) + (altura*altura));
						perimetro = base + altura + hipotenusa;
						System.out.println("El Area Del Triangulo Rectangulo Es " + area);
						System.out.println("El Perimetro Del Triangulo Rectangulo Es " + perimetro);
						break;
					case 4:
						System.out.println("Cuanto Mide De Radio");
						radio = teclado.nextDouble();
						area = 3.1416 * (radio * radio);
						perimetro = 3.1416 * (radio * 2);
						System.out.println("El Area De La Circunfencia Es " + area);
						System.out.println("El Perimetro Del La Circunfencia Es " + perimetro);
						break;
						
					}
				}
				else {
					System.out.println("Error: La Figura Geometrica No Existe");
					
				}
				
			}
		}
		
	}

}
