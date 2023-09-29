import java.util.Scanner;
import matrices.MatrizUtils;

public class ejercicio14 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int filas = MatrizUtils.obtenerFila();
    int columnas = MatrizUtils.obtenerColumna();
    int[][] matriz = MatrizUtils.obtenerMatriz(filas, columnas);
    MatrizUtils.mostrarMatriz(matriz);

    int[][] matrizModificado = rotarMatrizALaIzquierda(matriz);
    MatrizUtils.mostrarMatriz(matrizModificado);

    sc.close();
  }

  public static int[][] rotarMatrizALaIzquierda(int matriz[][]) {
    int filas = matriz.length;
    int columnas = matriz[0].length;
    int[][] matrizRotada = new int[filas][columnas];

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        int nuevaFila = i;
        int nuevaColumna = (j - 1 + columnas) % columnas;
        matrizRotada[nuevaFila][nuevaColumna] = matriz[i][j];
      }
    }
    return matrizRotada;
  }
}
