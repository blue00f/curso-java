package ejercicio_04;

public class Main {
	public static void main(String[] args) {
		Vector3D vector = new Vector3D(5, 5, 2);
		System.out.println("V = (" + vector.getX() + ", " + vector.getY() + ", " + vector.getZ() + ")");
		System.out.println("Norma = " + vector.getNorma());
	}

}
