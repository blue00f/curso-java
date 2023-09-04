import java.util.Arrays;
import java.util.Scanner;

public class ejercicio11 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese la cantidad de elementos del arreglo: ");
    int cantidadElementos = sc.nextInt();

    int[] arreglo = obtenerArreglo(cantidadElementos);
    System.out.println("Vector ingresado: " + Arrays.toString(arreglo));

    System.out.print("Ingrese un numero para buscar su posicion en el vector: ");
    int elemento = sc.nextInt();

    int posicion = buscarPosicion(arreglo, elemento);
    if (posicion == -1) {
      System.out.print("El numero buscado no se encuentra en el vector");
    } else {
      System.out.print("Numero: " + elemento + "\nPosicion: " + posicion);
    }

    sc.close();
  }

  public static int[] obtenerArreglo(int cantidadElementos) {
    int[] arreglo = new int[cantidadElementos];
    for (int i = 0; i < cantidadElementos; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      arreglo[i] = sc.nextInt();
    }
    return arreglo;
  }

  public static int buscarPosicion(int[] arreglo, int elemento) {
    int posicion = -1;

    for (int i = 0; i < arreglo.length; i++) {
      if (arreglo[i] == elemento) {
        posicion = i;
      }
    }
    return posicion;
  }
}
