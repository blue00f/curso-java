import java.util.Scanner;
import matrices.MatrizUtils;

public class ejercicio16 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int filas = MatrizUtils.obtenerFila();
    int columnas = MatrizUtils.obtenerColumna();
    double[][] matrizUno = MatrizUtils.obtenerMatrizDouble(filas, columnas);
    double[][] matrizDos = MatrizUtils.obtenerMatrizDouble(filas, columnas);
    double[][] matrizSuma = restarElementosMatrices(matrizUno, matrizDos);

    System.out.print("A = ");
    MatrizUtils.mostrarMatrizDouble(matrizUno);
    System.out.print("B = ");
    MatrizUtils.mostrarMatrizDouble(matrizDos);
    System.out.print("A - B = ");
    MatrizUtils.mostrarMatrizDouble(matrizSuma);

    sc.close();
  }

  public static double[][] restarElementosMatrices(double matrizUno[][], double matrizDos[][]) {
    int filas = matrizUno.length;
    int columnas = matrizUno[0].length;
    double[][] sumaMatriz = new double[filas][columnas];

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        sumaMatriz[i][j] = matrizUno[i][j] - matrizDos[i][j];
      }
    }
    return sumaMatriz;
  }
}
