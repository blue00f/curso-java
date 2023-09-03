import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        System.out.println("El factorial de " + numero + " es: " + calcularFactorial(numero));

        scanner.close();
    }

    public static int calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            int factorial = 1;
            for (int i = 2; i <= numero; i++) {
                factorial *= i;
                /*
                 * Si pasamos como parametro 4, el for hace esto:
                 * 1 = 1*2 = 2
                 * 2 = 2*3 = 6
                 * 6 = 6*4 = 24
                 */
            }
            return factorial;
        }
    }
}
