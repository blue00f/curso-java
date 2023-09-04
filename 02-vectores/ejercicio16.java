import java.util.Scanner;
import java.util.Arrays;

public class ejercicio16 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingresar elementos en orden estrictamente creciente\nIngresa la cantidad de elementos: ");
    int cantidadElementos = sc.nextInt();

    System.out.println("Vector A");
    int[] vector = obtenerArreglo(cantidadElementos);

    System.out.println("A = " + Arrays.toString(vector));

    if (verificarOrdenCreciente(vector) == true) {
      System.out.println("El vector tiene un orden estrictamente creciente");
    } else {
      System.out.println("El vector no tiene un orden estrictamente creciente");
    }
  }

  public static int[] obtenerArreglo(int cantidadElementos) {
    int[] arreglo = new int[cantidadElementos];

    for (int i = 0; i < cantidadElementos; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      arreglo[i] = sc.nextInt();
    }

    return arreglo;
  }

  public static boolean verificarOrdenCreciente(int[] vector) {
    boolean estado = true;

    for (int i = 0; i < vector.length - 1; i++) {
      if (vector[i] >= vector[i + 1]) {
        estado = false;
        break;
      }
    }
    return estado;
  }
}
