import java.util.Scanner;

public class ejercicio1 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de filas: ");
    int filas = sc.nextInt();

    System.out.print("Ingrese la cantidad de columnas: ");
    int columnas = sc.nextInt();

    int[][] matriz = llenarMatriz(filas, columnas);

    System.out.println("Matriz: ");
    mostrarMatriz(matriz);

    System.out.println("Suma de elementos de la matriz: " + sumarElementosMatriz(matriz));
    sc.close();
  }

  private static int[][] llenarMatriz(int filas, int columnas) {
    int[][] matriz = new int[filas][columnas];
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.print("Ingrese el valor en la posición [" + i + "][" + j + "]: ");
        matriz[i][j] = sc.nextInt();
      }
    }
    return matriz;
  }

  private static void mostrarMatriz(int matriz[][]) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int sumarElementosMatriz(int matriz[][]) {
    int acumulador = 0;
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        acumulador = acumulador + matriz[i][j];
      }
    }
    return acumulador;
  }
}
