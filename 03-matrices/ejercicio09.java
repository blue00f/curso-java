import java.util.Scanner;
import matrices.MatrizUtils;

public class ejercicio09 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int filas = MatrizUtils.obtenerFila();
    int columnas = MatrizUtils.obtenerColumna();
    int[][] matriz = MatrizUtils.obtenerMatriz(filas, columnas);
    MatrizUtils.mostrarMatriz(matriz);

    int indiceFila;
    do {
      System.out.print("Ingrese la fila a sumar: ");
      indiceFila = sc.nextInt();
    } while (indiceFila >= columnas);

    System.out.println("Suma de la fila: " + sumarFila(matriz, indiceFila));

    sc.close();
  }

  public static int sumarFila(int matriz[][], int indiceFila) {
    int acumulador = 0;
    for (int i = 0; i < matriz.length; i++) {
      acumulador = acumulador + matriz[indiceFila][i];
    }
    return acumulador;
  }
}
