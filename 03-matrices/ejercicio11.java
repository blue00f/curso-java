import java.util.Arrays;
import java.util.Scanner;
import matrices.MatrizUtils;

public class ejercicio11 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int filas = MatrizUtils.obtenerFila();
    int columnas = MatrizUtils.obtenerColumna();
    int[][] matriz = MatrizUtils.obtenerMatriz(filas, columnas);
    System.out.println(Arrays.deepToString(matriz));

    int filaUno, filaDos;
    do {
      System.out.print("Ingrese la fila 1: ");
      filaUno = sc.nextInt();
    } while (filaUno >= columnas);

    do {
      System.out.print("Ingrese la fila 2: ");
      filaDos = sc.nextInt();
    } while (filaDos >= columnas);

    int[][] matrizModificado = intercambiarFilasMatriz(matriz, filaUno, filaDos);

    System.out.println("Matriz con las filas cambiadas:\n" + Arrays.deepToString(matrizModificado));

    sc.close();
  }

  public static int[][] intercambiarFilasMatriz(int matriz[][], int filaUno, int filaDos) {
    int[] temp = matriz[filaUno];
    matriz[filaUno] = matriz[filaDos];
    matriz[filaDos] = temp;
    return matriz;
  }
}
