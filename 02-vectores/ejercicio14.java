import java.util.Scanner;
import java.util.Arrays;

public class ejercicio14 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Duplicar longitud del vector y rellenarlo con 10\nIngresa la cantidad de elementos: ");
    int cantidadElementos = sc.nextInt();

    System.out.println("Vector A");
    int[] vector = obtenerArreglo(cantidadElementos);

    System.out.println("A = " + Arrays.toString(vector));
    System.out.println("A duplicado = " + Arrays.toString(obtenerArregloDuplicado(vector)));
  }

  public static int[] obtenerArreglo(int cantidadElementos) {
    int[] arreglo = new int[cantidadElementos];

    for (int i = 0; i < cantidadElementos; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      arreglo[i] = sc.nextInt();
    }

    return arreglo;
  }

  public static int[] obtenerArregloDuplicado(int[] vector) {
    int n = vector.length;
    int[] vectorDuplicado = new int[n * 2];

    for (int i = 0; i < n; i++) {
      vectorDuplicado[i] = vector[i];
    }

    for (int i = n; i < n * 2; i++) {
      vectorDuplicado[i] = 10;
    }

    return vectorDuplicado;
  }
}
