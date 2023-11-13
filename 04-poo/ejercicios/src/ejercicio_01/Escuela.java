package ejercicio_01;

public class Escuela {
	public static void main(String[] args) {
		Alumnos[] alumnosArray = new Alumnos[2];
		alumnosArray[0]= new Alumnos("Bruno",18,"12345678");
		alumnosArray[1]= new Alumnos("Lucho",9,"87654321");
		
		for(Alumnos alumno : alumnosArray) {
			if(alumno != null) {
				alumno.mostrarDatos();	
			}
		}
	}
}
