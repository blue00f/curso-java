import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int cantidadElementos = scanner.nextInt();

        int[] arreglo1 = generarArreglo(cantidadElementos);
        int[] arreglo2 = generarArreglo(cantidadElementos);
        scanner.close();

        int[] resultado = combinarArreglos(arreglo1, arreglo2);
        System.out.println("Resultado: " + Arrays.toString(resultado));
    }

    public static int[] generarArreglo(int cantidadElementos) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[cantidadElementos];
        for (int i = 0; i < cantidadElementos; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        return arreglo;
    }

    public static int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int n = Math.min(arreglo1.length, arreglo2.length);
        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                resultado[i] = arreglo1[i];
            } else {
                resultado[i] = arreglo2[i];
            }
        }

        return resultado;
    }
}
