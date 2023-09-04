import java.util.Scanner;

public class ejercicio01 {
  public static void main(String[] args) {
    // Creamos la clase Scanner dentro del 'main'
    // para obtener entrada de datos primitivos (int, decimal, string, etc)
    Scanner scanner = new Scanner(System.in);

    // Salida de texto
    System.out.print("Ingrese su nombre: ");

    // Entrada nextLine para leer strings
    String nombre = scanner.nextLine();

    // Salida de texto con variables
    System.out.println("Hola, " + nombre + "!");

    // Por ultimo cerramos la clase Scanner para liberar recursos de memoria
    scanner.close();
  }
}
