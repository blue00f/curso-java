import java.util.Scanner;

public class ejercicio04 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese la cantidad de elementos del arreglo: ");
    int cantidadElementos = sc.nextInt();

    boolean[] array = new boolean[cantidadElementos];
    for (int i = 0; i < cantidadElementos; i++) {
      System.out.print("Ingrese el valor (true/false) para el elemento " + i + ": ");
      array[i] = sc.nextBoolean();
    }

    int producto = calcularProducto(array);
    System.out.println("El producto es: " + producto);
    sc.close();
  }

  public static int calcularProducto(boolean[] array) {
    int cantidadTrue = 0;
    int cantidadFalse = 0;

    for (int i = 0; i < array.length; i++) {
      if (i % 2 == 0 && array[i]) {
        cantidadTrue++;
      } else if (i % 2 != 0 && !array[i]) {
        cantidadFalse++;
      }
    }
    return cantidadTrue * cantidadFalse;
  }
}
