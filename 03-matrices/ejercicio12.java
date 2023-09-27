import java.util.Arrays;
import java.util.Scanner;
import matrices.MatrizUtils;

public class ejercicio12 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int filas = MatrizUtils.obtenerFila();
    int columnas = MatrizUtils.obtenerColumna();
    int[][] matriz = MatrizUtils.obtenerMatriz(filas, columnas);
    System.out.println(Arrays.deepToString(matriz));

    int columnaUno, columaDos;
    do {
      System.out.print("Ingrese la fila 1: ");
      columnaUno = sc.nextInt();
    } while (columnaUno >= columnas);

    do {
      System.out.print("Ingrese la fila 2: ");
      columaDos = sc.nextInt();
    } while (columaDos >= columnas);

    int[][] matrizModificado = intercambiarColumnasMatriz(matriz, columnaUno, columaDos);

    System.out.println("Matriz con las columnas cambiadas:\n" + Arrays.deepToString(matrizModificado));

    sc.close();
  }

  public static int[][] intercambiarColumnasMatriz(int matriz[][], int columnaUno, int columnaDos) {
    for (int i = 0; i < matriz.length; i++) {
      int temp = matriz[i][columnaUno];
      matriz[i][columnaUno] = matriz[i][columnaDos];
      matriz[i][columnaDos] = temp;
    }
    return matriz;
  }
}
