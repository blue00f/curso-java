import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int cantidadDeNumeros = 10;
        float promedio = 0;

        for (int i = 0; i < cantidadDeNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            suma += numero;
        }

        promedio = (float) suma / cantidadDeNumeros;
        System.out.println("El promedio es: " + promedio);

        scanner.close();
    }
}