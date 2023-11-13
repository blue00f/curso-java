package ejercicio_03;

public class Main {
	public static void main(String[] args) {
		Rectangulo objeto = new Rectangulo(2,5);
		System.out.println("Lado vertical: " + objeto.getLado1());
		System.out.println("Lado horizontal: " + objeto.getLado2());
		System.out.println("Area: " + objeto.getArea());
		System.out.println("Perimetro: " + objeto.getPerimetro());
	}
}
