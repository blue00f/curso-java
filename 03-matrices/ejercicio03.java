import java.util.Scanner;
import matrices.MatrizUtils;

public class ejercicio03 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int filas = MatrizUtils.obtenerFila();
    int columnas = MatrizUtils.obtenerColumna();
    int[][] matriz = MatrizUtils.obtenerMatriz(filas, columnas);
    MatrizUtils.mostrarMatriz(matriz);

    int indiceFila;
    do {
      System.out.print("Ingrese la fila para buscar el maximo: ");
      indiceFila = sc.nextInt();
    } while (indiceFila >= columnas);

    System.out.println(
        "El elemento maximo esta ubicado en la columna: " + findMaxRowIndex(matriz, indiceFila));
    sc.close();
  }

  public static int findMaxRowIndex(int matriz[][], int indiceFila) {
    int maximo = matriz[indiceFila][0];
    int columna = 0;
    for (int i = 1; i < matriz.length; i++) {
      if (maximo < matriz[i][indiceFila]) {
        maximo = matriz[i][indiceFila];
        columna = i;
      }
    }
    return columna;
  }
}
