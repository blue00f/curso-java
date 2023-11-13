package ejercicio_02;

public class Calculadora {
	private float num1;
	private float num2;

	public Calculadora(float num1, float num2) {
		this.setNum1(num1);
		this.setNum2(num2);
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum1() {
		return num1;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}

	public float getNum2() {
		return num2;
	}

	public float sumar() {
		return getNum1() + getNum2();
	}

	public float restar() {
		return getNum1() - getNum2();
	}

	public float multiplicar() {
		return getNum1() * getNum2();
	}

	public float dividir() {
		if (num2 == 0) {
			return 0;
		} else {
			return getNum1() / getNum2();
		}
	}
}
