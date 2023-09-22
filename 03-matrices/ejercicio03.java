import java.util.Scanner;
import matrices.MatrizUtils;

public class ejercicio03 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de filas: ");
    int filas = sc.nextInt();

    System.out.print("Ingrese la cantidad de columnas: ");
    int columnas = sc.nextInt();

    int indice;
    do {
      System.out.print("Ingrese el indice para buscar el maximo: ");
      indice = sc.nextInt();
    } while (indice >= columnas);

    int[][] matriz = MatrizUtils.obtenerMatriz(filas, columnas);

    System.out.println("Matriz: ");
    MatrizUtils.mostrarMatriz(matriz);

    System.out.println("Maximo del indice: " + findMaxColumnIndex(matriz, indice));
    sc.close();
  }

  // cuando meto una matriz de tamaño 2x2 no encuentra el maximo
  public static int findMaxColumnIndex(int matriz[][], int indice) {
    int maximo = matriz[0][indice];
    for (int i = 1; i < matriz.length; i++) {
      if (maximo < matriz[i][indice]) {
        maximo = matriz[i][indice];
      }
    }
    return maximo;
  }
}
