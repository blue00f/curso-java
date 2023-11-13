package ejercicio_07;

public class Calculadora implements ICalculable {
	private double operando1;
	private double operando2;
	private char operador;

	public Calculadora(double operando1, double operando2, char operador) {
		this.setOperando1(operando1);
		this.setOperando2(operando2);
		this.setOperador(operador);
	}

	public void setOperando1(double operando1) {
		this.operando1 = operando1;
	}

	public void setOperando2(double operando2) {
		this.operando2 = operando2;
	}

	public void setOperador(char operador) {
		this.operador = operador;
	}

	public double getOperando1() {
		return operando1;
	}

	public double getOperando2() {
		return operando2;
	}

	public char getOperador() {
		return operador;
	}

	@Override
	public double calcular() {
		switch (operador) {
		case '+':
			return operando1 + operando2;
		case '-':
			return operando1 - operando2;
		case '*':
			return operando1 * operando2;
		case '/':
			if (operando2 != 0) {
				return operando1 / operando2;
			} else {
				System.out.println("Error: division por cero");
				return Double.NaN;
			}
		default:
			System.out.println("Operador no valido");
			return Double.NaN;
		}
	}
}
