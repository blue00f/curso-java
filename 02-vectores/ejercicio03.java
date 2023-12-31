import java.util.Scanner;

public class ejercicio03 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese la cantidad de elementos del array: ");
    int cantidadElementos = sc.nextInt();

    int[] numeros = new int[cantidadElementos];

    for (int i = 0; i < cantidadElementos; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      numeros[i] = sc.nextInt();
    }

    if (sonPositivos(numeros) == true) {
      System.out.println("Son positivos");
    } else {
      System.out.println("No todos son positivos");
    }
    sc.close();
  }

  private static boolean sonPositivos(int array[]) {
    for (int i = 1; i < array.length; i++) {
      if (array[i] < 0) {
        return false;
      }
    }
    return true;
  }
}
