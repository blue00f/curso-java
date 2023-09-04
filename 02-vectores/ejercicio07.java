import java.util.Arrays;
import java.util.Scanner;

public class ejercicio07 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese la cantidad de elementos del arreglo: ");
    int cantidadElementos = sc.nextInt();

    int[] arreglo1 = generarArreglo(cantidadElementos);

    sc.close();

    System.out.println("Vector con orden original: " + Arrays.toString(arreglo1));
    System.out.println("Vector con orden inverso: " + Arrays.toString(obtenerInversaDelArreglo(arreglo1)));
  }

  public static int[] generarArreglo(int cantidadElementos) {
    int[] arreglo = new int[cantidadElementos];

    for (int i = 0; i < cantidadElementos; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      arreglo[i] = sc.nextInt();
    }

    return arreglo;
  }

  public static int[] obtenerInversaDelArreglo(int[] arreglo) {
    int[] arregloInverso = new int[arreglo.length];
    for (int i = 0; i < arreglo.length; i++) {
      arregloInverso[i] = arreglo[arreglo.length - 1 - i];
    }
    return arregloInverso;
  }
}
