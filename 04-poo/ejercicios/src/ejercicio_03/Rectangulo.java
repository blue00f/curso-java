package ejercicio_03;

public class Rectangulo {
	private int lado1;
	private int lado2;

	public Rectangulo(int lado1, int lado2) {
		this.setLado1(lado1);
		this.setLado2(lado2);
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public int getLado1() {
		return lado1;
	}

	public int getLado2() {
		return lado2;
	}

	public double getArea() {
		return getLado1() * getLado2();
	}

	public double getPerimetro() {
		return getLado1() + getLado2();
	}
}
