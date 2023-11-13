package ejercicio_02;

public class Main {
	public static void main(String[] args) {
		Calculadora operacion1 = new Calculadora(56,102);
		Calculadora operacion2 = new Calculadora(73,21);
		Calculadora operacion3 = new Calculadora(12,128);
		Calculadora operacion4 = new Calculadora(146,18);
		
		System.out.println(operacion1.getNum1() + " + " + operacion1.getNum2() + " = " + operacion1.sumar());
		System.out.println(operacion2.getNum1() + " - " + operacion2.getNum2() + " = " + operacion2.restar());
		System.out.println(operacion3.getNum1() + " * " + operacion3.getNum2() + " = " + operacion3.multiplicar());
		System.out.println(operacion4.getNum1() + " / " + operacion4.getNum2() + " = " + operacion4.dividir());
	}

}
