import java.util.Scanner;
import matrices.MatrizUtils;

public class ejercicio13 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // hago uso de MatrizUtils creado por mi para reutilizar codigo en todos los
    // ejercicios
    int filas = MatrizUtils.obtenerFila();
    int columnas = MatrizUtils.obtenerColumna();
    int[][] matriz = MatrizUtils.obtenerMatriz(filas, columnas);
    MatrizUtils.mostrarMatriz(matriz);

    // la nueva matriz se iguala con lo que retorna esta funcion
    int[][] matrizModificado = rotarMatrizALaDerecha(matriz);
    MatrizUtils.mostrarMatriz(matrizModificado);

    // cierro el scanner al final para liberar recursos de memoria
    sc.close();
  }

  public static int[][] rotarMatrizALaDerecha(int matriz[][]) {
    int filas = matriz.length;
    int columnas = matriz[0].length;
    int[][] matrizRotada = new int[filas][columnas];

    // se interan las columnas de esta forma [j][i], primero las columnas y despues
    // las filas
    for (int j = 0; j < columnas; j++) {
      for (int i = 0; i < filas; i++) {
        int nuevaFila = i;
        int nuevaColumna = (j + 1) % columnas;
        // se saca el modulo entre la columna actual y la columna total. Si ambos
        // coinciden, se desplaza a la posicion 0.
        matrizRotada[nuevaFila][nuevaColumna] = matriz[i][j];
      }
    }
    return matrizRotada;
  }
}
