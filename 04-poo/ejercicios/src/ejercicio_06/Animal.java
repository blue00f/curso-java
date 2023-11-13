package ejercicio_06;

public abstract class Animal {
	protected String nombre;
	protected int edad;

	public Animal(String nombre, int edad) {
		this.setNombre(nombre);
		this.setEdad(edad);
	}

	public abstract String comer();
	public abstract String emitirSonido();
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
}
