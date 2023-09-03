import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos numeros y guardarlos en variables
        System.out.print("Ingrese el numero 1: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el numero 2: ");
        int numero2 = scanner.nextInt();

        // Imprimir las operaciones del numero
        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicacion: " + (numero1 * numero2));

        if (numero2 == 0) {
            System.out.println("No se puede realizar la division");
        } else {
            System.out.println("Division: " + (numero1 / numero2));
        }

        scanner.close();
    }
}