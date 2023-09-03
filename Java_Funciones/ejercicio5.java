import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println(numero + " es POSITIVO");
        } else if (numero < 0) {
            System.out.println(numero + " es NEGATIVO");
        } else {
            System.out.println(numero + " es CERO");
        }

        scanner.close();
    }
}