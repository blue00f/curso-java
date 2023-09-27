import java.util.Scanner;
import matrices.MatrizUtils;

public class ejercicio04 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int filas = MatrizUtils.obtenerFila();
    int columnas = MatrizUtils.obtenerColumna();
    int[][] matriz = MatrizUtils.obtenerMatriz(filas, columnas);
    MatrizUtils.mostrarMatriz(matriz);

    int indiceColumna;
    do {
      System.out.print("Ingrese la columna para buscar el maximo: ");
      indiceColumna = sc.nextInt();
    } while (indiceColumna >= columnas);

    System.out.println(
        "El elemento maximo esta ubicado en la fila: " + findMaxColumnIndex(matriz, indiceColumna));
    sc.close();
  }

  public static int findMaxColumnIndex(int matriz[][], int indiceColumna) {
    int maximo = matriz[0][indiceColumna];
    int fila = 0;
    for (int i = 1; i < matriz.length; i++) {
      if (maximo < matriz[i][indiceColumna]) {
        maximo = matriz[i][indiceColumna];
        fila = i;
      }
    }
    return fila;
  }
}
