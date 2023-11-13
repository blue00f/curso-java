package ejercicio_07;

public class Main {

	public static void main(String[] args) {
		Calculadora operacion1 = new Calculadora(2, 5, '*');
		System.out.println(operacion1.getOperando1() + " " + operacion1.getOperador() + " " + operacion1.getOperando2()
				+ " = " + operacion1.calcular());

		CalculoCirculo operacion2 = new CalculoCirculo(10);
		System.out.println("\nRadio = " + operacion2.getRadio());
		System.out.println("Area = " + operacion2.calcular());
	}
}
