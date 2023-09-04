import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class ejercicio12 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ordenamiento de vectores ASC y DESC\nIngresa la cantidad de elementos: ");
    int cantidadElementos = sc.nextInt();

    System.out.println("Vector A");
    int[] vector = obtenerArreglo(cantidadElementos);

    System.out.println("Ordenamiento burbuja");
    System.out.println("ASC = " + Arrays.toString(obtenerAscendenteBubbleSort(vector)));
    System.out.println("DESC = " + Arrays.toString(obtenerDescendenteBubbleSort(vector)));

    System.out.println("Ordenamiento con sort");
    System.out.println("ASC = " + Arrays.toString(obtenerAscendenteDeVector(vector)));
    System.out.println("DESC = " + Arrays.toString(obtenerDescendenteDeVector(vector)));
  }

  public static int[] obtenerArreglo(int cantidadElementos) {
    int[] arreglo = new int[cantidadElementos];

    for (int i = 0; i < cantidadElementos; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      arreglo[i] = sc.nextInt();
    }

    return arreglo;
  }

  /* Dos metodos para obtener el vector ASC y DESC usando sort */
  public static int[] obtenerAscendenteDeVector(int[] vector) {
    int[] vectorAscendente = vector.clone();
    Arrays.sort(vectorAscendente);
    return vectorAscendente;
  }

  public static int[] obtenerDescendenteDeVector(int[] vector) {
    // convertir un int[] a Integer[]
    Integer[] vectorDescendenteInteger = Arrays.stream(vector)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .toArray(Integer[]::new);

    // una vez ordenado, convertir el Integer[] a int[] para retornarlo
    int[] vectorDescendente = Arrays.stream(vectorDescendenteInteger)
        .mapToInt(Integer::intValue)
        .toArray();

    return vectorDescendente;
  }

  /* Dos metodos para obtener el vector ASC y DESC usando bubble sort */
  public static int[] obtenerAscendenteBubbleSort(int[] vector) {
    int temp;
    boolean swapped;

    for (int i = 0; i < vector.length - 1; i++) {
      swapped = false;
      for (int j = 0; j < vector.length - i - 1; j++) {
        if (vector[j] > vector[j + 1]) {
          temp = vector[j];
          vector[j] = vector[j + 1];
          vector[j + 1] = temp;
          swapped = true;
        }
      }

      if (swapped == false)
        break;
    }
    return vector;
  }

  public static int[] obtenerDescendenteBubbleSort(int[] vector) {
    int temp;
    boolean swapped;

    for (int i = 0; i < vector.length - 1; i++) {
      swapped = false;
      for (int j = 0; j < vector.length - i - 1; j++) {
        if (vector[j] < vector[j + 1]) {
          temp = vector[j];
          vector[j] = vector[j + 1];
          vector[j + 1] = temp;
          swapped = true;
        }
      }

      if (swapped == false)
        break;
    }
    return vector;
  }
}
