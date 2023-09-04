import java.util.Scanner;
import matrices.MatrizUtils;

public class ejercicio01 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de filas: ");
    int filas = sc.nextInt();

    System.out.print("Ingrese la cantidad de columnas: ");
    int columnas = sc.nextInt();

    int[][] matriz = MatrizUtils.obtenerMatriz(filas, columnas);

    System.out.println("Matriz: ");
    MatrizUtils.mostrarMatriz(matriz);

    System.out.println("Suma de elementos de la matriz: " + sumarElementosMatriz(matriz));
    sc.close();
  }

  public static int sumarElementosMatriz(int matriz[][]) {
    int acumulador = 0;
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        acumulador = acumulador + matriz[i][j];
      }
    }
    return acumulador;
  }
}
