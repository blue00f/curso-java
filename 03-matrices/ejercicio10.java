import java.util.Scanner;
import matrices.MatrizUtils;

public class ejercicio10 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int filas = MatrizUtils.obtenerFila();
    int columnas = MatrizUtils.obtenerColumna();
    int[][] matriz = MatrizUtils.obtenerMatriz(filas, columnas);
    MatrizUtils.mostrarMatriz(matriz);

    int indiceColumna;
    do {
      System.out.print("Ingrese la columna a sumar: ");
      indiceColumna = sc.nextInt();
    } while (indiceColumna >= columnas);

    System.out.println("Suma de la columna: " + sumarColumna(matriz, indiceColumna));

    sc.close();
  }

  public static int sumarColumna(int matriz[][], int indiceColumna) {
    int acumulador = 0;
    for (int i = 0; i < matriz.length; i++) {
      acumulador = acumulador + matriz[i][indiceColumna];
    }
    return acumulador;
  }
}
