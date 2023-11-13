package ejercicio_01;

public class Alumnos {
	private String nombre;
	private int edad;
	private String documento;
	
	public Alumnos(String nombre, int edad, String documento) {
		this.setNombre(nombre);
		this.setEdad(this.calcularEdad(edad));
		this.setDocumento(documento);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setDocumento(String documento) {
		this.documento = documento;	
	}
	
	public String getDocumento() {
		return documento;
	}
	
	public void mostrarDatos() {
		System.out.println("El alumno " + this.getNombre() + " con DNI " + this.getDocumento() + " nació en el año " + this.getEdad());
	}
	
	public int calcularEdad(int anio) {
		return 2023-anio;
	}
}
