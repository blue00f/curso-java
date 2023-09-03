import java.util.Arrays;
import java.util.Scanner;

public class ejercicio7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de elementos del arreglo: ");
    int cantidadElementos = scanner.nextInt();
    int[] arreglo1 = generarArreglo(cantidadElementos);
    scanner.close();

    System.out.println("Vector con orden original: " + Arrays.toString(arreglo1));
    System.out.println("Vector con orden inverso: " + Arrays.toString(inversoArreglo(arreglo1)));
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

  public static int[] inversoArreglo(int[] arreglo) {
    int[] arregloInverso = new int[arreglo.length];
    for (int i = 0; i < arreglo.length; i++) {
      arregloInverso[i] = arreglo[arreglo.length - 1 - i];
    }
    return arregloInverso;
  }

}
