import java.util.Scanner;
import java.util.Arrays;

public class ejercicio17 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingresar elementos en orden estrictamente creciente\nIngresa la cantidad de elementos: ");
    int cantidadElementos = sc.nextInt();

    System.out.println("Vector A");
    int[] vector = obtenerArreglo(cantidadElementos);

    System.out.println("A = " + Arrays.toString(vector));
    System.out.println("Numero de veces que se rompe el orden: " + contarOrdenDecreciente(vector));
  }

  public static int[] obtenerArreglo(int cantidadElementos) {
    int[] arreglo = new int[cantidadElementos];

    for (int i = 0; i < cantidadElementos; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      arreglo[i] = sc.nextInt();
    }

    return arreglo;
  }

  public static int contarOrdenDecreciente(int[] vector) {
    int contador = 0;

    for (int i = 0; i < vector.length - 1; i++) {
      if (vector[i] >= vector[i + 1]) {
        contador++;
      }
    }
    return contador;
  }
}
