package ejercicio_06;

public class Perro extends Animal {
	public Perro(String nombre, int edad) {
		super(nombre, edad);
	}

	@Override
	public String comer() {
		return "El perro esta comiendo";
	}

	@Override
	public String emitirSonido() {
		return "Guau";
	}

}
