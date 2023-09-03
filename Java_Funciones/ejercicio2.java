import java.util.Scanner;

public class ejercicio2 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Pedir al usuario que ingrese un numero
                System.out.print("Ingrese un numero: ");

                // Leer el numero ingresado por el usuario
                int numero = scanner.nextInt();

                // Imprimir el numero por pantalla
                System.out.println("El doble de " + numero + " es: " + numero * 2);
                System.out.println("El triple de " + numero + " es: " + numero * 3);

                scanner.close();
        }
}