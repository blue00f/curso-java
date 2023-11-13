package ejercicio_06;

public class Gato extends Animal {
	public Gato(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public String comer() {
		return "El gato esta comiendo";
	}

	@Override
	public String emitirSonido() {
		return "Miau";
	}

}
