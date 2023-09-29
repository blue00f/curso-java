package matrices;

import java.util.Scanner;

public class MatrizUtils {
  public static Scanner sc = new Scanner(System.in);

  public static int obtenerFila() {
    System.out.print("Ingrese la cantidad de filas: ");
    int filas = sc.nextInt();
    return filas;
  }

  public static int obtenerColumna() {
    System.out.print("Ingrese la cantidad de columnas: ");
    int columnas = sc.nextInt();
    return columnas;
  }

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
    System.out.println("Matriz: ");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + "\t");
      }
      System.out.println();
    }
  }

  public static double[][] obtenerMatrizDouble(int filas, int columnas) {
    double[][] matriz = new double[filas][columnas];
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.print("Ingrese el valor en la posición [" + i + "][" + j + "]: ");
        matriz[i][j] = sc.nextDouble();
      }
    }
    return matriz;
  }

  public static void mostrarMatrizDouble(double matriz[][]) {
    System.out.println("Matriz: ");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + "\t");
      }
      System.out.println();
    }
  }
}