package ejercicio_06;

public class Pajaro extends Animal {
	public Pajaro(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public String comer() {
		return "El pajaro esta comiendo";
	}

	@Override
	public String emitirSonido() {
		return "Pio pio";
	}

}
