import java.util.Scanner;

public class ejercicio02 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese la cantidad de elementos del array: ");
    int cantidadElementos = sc.nextInt();

    int[] numeros = new int[cantidadElementos];

    for (int i = 0; i < cantidadElementos; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      numeros[i] = sc.nextInt();
    }

    int posicionMayor = encontrarPosicionMayor(numeros);
    System.out.println("La posicion del elemento mayor es: " + posicionMayor);
    sc.close();
  }

  private static int encontrarPosicionMayor(int array[]) {
    int posicionMayor = 0;
    int mayor = array[0];

    for (int i = 1; i < array.length; i++) {
      if (array[i] > mayor) {
        mayor = array[i];
        posicionMayor = i;
      }
    }
    return posicionMayor;
  }
}
