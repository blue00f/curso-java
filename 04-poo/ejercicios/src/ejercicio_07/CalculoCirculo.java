package ejercicio_07;

public class CalculoCirculo implements ICalculable {
	private double radio;

	public CalculoCirculo(double radio) {
		this.setRadio(radio);
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	@Override
	public double calcular() {
		return Math.PI * Math.pow(radio, 2);
	}
}
