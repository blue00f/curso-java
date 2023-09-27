import java.util.Scanner;
import matrices.MatrizUtils;

public class ejercicio02 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int filas = MatrizUtils.obtenerFila();
    int columnas = MatrizUtils.obtenerColumna();
    int[][] matriz = MatrizUtils.obtenerMatriz(filas, columnas);
    MatrizUtils.mostrarMatriz(matriz);

    System.out.println("Contador de positivos: " + contarPositivos(matriz));
    sc.close();
  }

  public static int contarPositivos(int matriz[][]) {
    int contador = 0;
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if (matriz[i][j] > 0) {
          contador++;
        }
      }
    }
    return contador;
  }
}
