import java.util.Scanner;
import matrices.MatrizUtils;

public class ejercicio06 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int filas = MatrizUtils.obtenerFila();
    int columnas = MatrizUtils.obtenerColumna();
    int[][] matriz = MatrizUtils.obtenerMatriz(filas, columnas);
    MatrizUtils.mostrarMatriz(matriz);

    System.out.println("La columna que contiene al elemento maximo es: " + findMaxColumn(matriz));
    sc.close();
  }

  public static int findMaxColumn(int matriz[][]) {
    int maximo = matriz[0][0];
    int columna = 0;
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        if (maximo < matriz[i][j]) {
          maximo = matriz[i][j];
          columna = j;
        }
      }
    }
    return columna;
  }
}
