import java.util.Scanner;

public class ejercicio01 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese la cantidad de elementos del array: ");
    int cantidadElementos = sc.nextInt();

    int[] numeros = new int[cantidadElementos];

    for (int i = 0; i < cantidadElementos; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      numeros[i] = sc.nextInt();
    }

    int posicionMenor = encontrarPosicionMenor(numeros);
    System.out.println("La posicion del elemento menor es: " + posicionMenor);
    sc.close();
  }

  private static int encontrarPosicionMenor(int array[]) {
    int posicionMenor = 0;
    int menor = array[0];

    for (int i = 1; i < array.length; i++) {
      if (array[i] < menor) {
        menor = array[i];
        posicionMenor = i;
      }
    }
    return posicionMenor;
  }
}
