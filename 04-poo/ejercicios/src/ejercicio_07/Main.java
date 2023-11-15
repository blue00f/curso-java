package ejercicio_07;

public class Main {

	public static void main(String[] args) {
		Calculadora operacion1 = new Calculadora(19, 11, '+');
		System.out.println(operacion1.getOperando1() + " " + operacion1.getOperador() + " " + operacion1.getOperando2()
				+ " = " + operacion1.calcular());
		
		Calculadora operacion2 = new Calculadora(56, 21, '-');
		System.out.println(operacion2.getOperando1() + " " + operacion2.getOperador() + " " + operacion2.getOperando2()
				+ " = " + operacion2.calcular());
		
		Calculadora operacion3 = new Calculadora(6, 9, '*');
		System.out.println(operacion3.getOperando1() + " " + operacion3.getOperador() + " " + operacion3.getOperando2()
				+ " = " + operacion3.calcular());
		
		Calculadora operacion4 = new Calculadora(5, 0, '/');
		System.out.println(operacion4.getOperando1() + " " + operacion4.getOperador() + " " + operacion4.getOperando2()
				+ " = " + operacion4.calcular());

		CalculoCirculo operacion5 = new CalculoCirculo(10);
		System.out.println("\nRadio = " + operacion5.getRadio());
		System.out.println("Area = " + operacion5.calcular());
	}
}
