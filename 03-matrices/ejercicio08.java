import java.util.Scanner;
import matrices.MatrizUtils;

public class ejercicio08 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int filas = MatrizUtils.obtenerFila();
    int columnas = MatrizUtils.obtenerColumna();
    int[][] matriz = MatrizUtils.obtenerMatriz(filas, columnas);
    MatrizUtils.mostrarMatriz(matriz);

    System.out.print("Ingrese el numero a buscar: ");
    int numero = sc.nextInt();

    int indiceFila = findRowNumber(matriz, numero);
    int indiceColumna = findColumnNumber(matriz, numero);

    if (indiceFila == -1 || indiceColumna == -1) {
      System.out.println("El numero no se encuentra en la matriz");
    } else {
      System.out.println("Posicion es: " + "[" + indiceFila + "][" + indiceColumna + "]");
    }

    sc.close();
  }

  public static int findRowNumber(int matriz[][], int numero) {
    int fila = 0;
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        if (numero == matriz[i][j]) {
          numero = matriz[i][j];
          fila = i;
          return fila;
        }
      }
    }
    return fila = -1;
  }

  public static int findColumnNumber(int matriz[][], int numero) {
    int columna = 0;
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        if (numero == matriz[i][j]) {
          numero = matriz[i][j];
          columna = j;
          return columna;
        }
      }
    }
    return columna = -1;
  }
}
