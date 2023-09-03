import java.util.Arrays;
import java.util.Scanner;

public class ejercicio11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese la cantidad de elementos del arreglo: ");
    int cantidadElementos = scanner.nextInt();

    int[] arreglo1 = generarArreglo(cantidadElementos);

    System.out.println("Vector con orden original: " + Arrays.toString(arreglo1));

    System.out.print("Ingrese el elemento para buscar su posicion: ");
    int elemento = scanner.nextInt();

    scanner.close();

    int posicion = buscarPosicion(arreglo1, elemento);

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

  public static int buscarPosicion(int[] arreglo, int elemento) {
    Scanner scanner = new Scanner(System.in);
    int posicion = -1;

    for (int i = 0; i < arreglo.length; i++) {
      if (arreglo[i] == elemento) {
        posicion = i;
      }
    }
    return posicion;
  }
}
