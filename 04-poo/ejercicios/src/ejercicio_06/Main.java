package ejercicio_06;

public class Main {
	public static void main(String[] args) {
		Perro perro = new Perro("Lucho", 9);
		Gato gato = new Gato("Mauricio", 6);
		Pajaro pajaro = new Pajaro("Pigeon", 2);

		System.out.println(perro.comer() + " - " + perro.emitirSonido() + " - " + perro.getNombre() + " tiene " + perro.getEdad() + " años");
		System.out.println(gato.comer() + " - " +  gato.emitirSonido() + " - " + gato.getNombre() + " tiene " + gato.getEdad() + " años");
		System.out.println(pajaro.comer() + " - " +  pajaro.emitirSonido() + " - " + pajaro.getNombre() + " tiene " + pajaro.getEdad() + " años");
	}
}
