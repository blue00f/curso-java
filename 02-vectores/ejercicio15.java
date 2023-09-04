import java.util.Scanner;
import java.util.Arrays;

public class ejercicio15 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingresar numero y ordenarlo en el vector\nIngresa la cantidad de elementos: ");
    int cantidadElementos = sc.nextInt();

    System.out.println("Vector A");
    int[] vector = obtenerArreglo(cantidadElementos);

    System.out.println("A ordenado = " + Arrays.toString(obtenerAscendenteDeVector(vector)));

    System.out.print("Ingresa el numero para insertarlo en el vector: ");
    int numero = sc.nextInt();

    System.out.println("A actualizado = " + Arrays.toString(agregarElemento(vector, numero)));
  }

  public static int[] obtenerArreglo(int cantidadElementos) {
    int[] arreglo = new int[cantidadElementos];

    for (int i = 0; i < cantidadElementos; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      arreglo[i] = sc.nextInt();
    }

    return arreglo;
  }

  public static int[] obtenerAscendenteDeVector(int[] vector) {
    int[] vectorAscendente = vector.clone();
    Arrays.sort(vectorAscendente);
    return vectorAscendente;
  }

  public static int[] agregarElemento(int[] vector, int numero) {
    int longitudNueva = vector.length + 1;
    int[] nuevoVector = new int[longitudNueva];

    for (int i = 0; i < vector.length; i++) {
      nuevoVector[i] = vector[i];
    }

    nuevoVector[longitudNueva - 1] = numero;

    return obtenerAscendenteDeVector(nuevoVector);
  }
}
