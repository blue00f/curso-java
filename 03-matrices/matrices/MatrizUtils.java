package matrices;

import java.util.Scanner;

public class MatrizUtils {
  public static Scanner sc = new Scanner(System.in);

  public static int[][] obtenerMatriz(int filas, int columnas) {
    int[][] matriz = new int[filas][columnas];
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.print("Ingrese el valor en la posición [" + i + "][" + j + "]: ");
        matriz[i][j] = sc.nextInt();
      }
    }
    return matriz;
  }

  public static void mostrarMatriz(int matriz[][]) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }
}