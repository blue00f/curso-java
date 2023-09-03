import java.util.Arrays;
import java.util.Scanner;

public class ejercicio6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de elementos del arreglo: ");
    int cantidadElementos = scanner.nextInt();

    int[] arregloA = generarArreglo(cantidadElementos);
    int[] arregloB = generarArreglo(cantidadElementos);
    int[] arregloC = calcularArregloC(arregloA, arregloB);

    System.out.println("Arreglo A: " + Arrays.toString(arregloA));
    System.out.println("Arreglo B: " + Arrays.toString(arregloB));
    System.out.println("Arreglo C: " + Arrays.toString(arregloC));
    scanner.close();

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

  public static int[] calcularArregloC(int[] arregloA, int[] arregloB) {
    int n = arregloA.length;
    int[] arregloC = new int[n];

    for (int i = 0; i < n; i++) {
      arregloC[i] = arregloA[i] * arregloB[n - i - 1];
    }

    return arregloC;
  }
}
