import java.util.Scanner;

public class ejercicio1 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Pedir al usuario que ingrese su nombre
                System.out.print("Ingrese su nombre: ");

                // Leer el nombre ingresado por el usuario
                String nombre = scanner.nextLine();

                // Imprimir el nombre por pantalla
                System.out.println("Hola, " + nombre + "!");

                // Cerrar objeto scanner para liberar los recursos asociados
                scanner.close();
        }
}
