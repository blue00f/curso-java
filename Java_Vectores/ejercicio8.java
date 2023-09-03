import java.util.Arrays;
import java.util.Scanner;

public class ejercicio8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese la cantidad de elementos del arreglo: ");
    int cantidadElementos = scanner.nextInt();
    int[] arreglo1 = generarArreglo(cantidadElementos);
    System.out.print("Ingresa el valor del escalar: ");
    double escalar = scanner.nextDouble();

    System.out.println("Arreglo ingresado: " + Arrays.toString(arreglo1));
    System.out
        .println("Arreglo multiplicado por " + escalar + Arrays.toString(productoEscalarArray(arreglo1, escalar)));
  }

  public static int[] generarArreglo(int cantidadElementos) {
    Scanner scanner = new Scanner(System.in);
    int[] arreglo = new int[cantidadElementos];
    for (int i = 0; i < cantidadElementos; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      arreglo[i] = scanner.nextInt();
    }
    return arreglo;
  }

  public static double[] productoEscalarArray(int[] arreglo, double escalar) {
    double[] arregloMultiplicado = new double[arreglo.length];
    for (int i = 0; i < arreglo.length; i++) {
      arregloMultiplicado[i] = arreglo[i] * escalar;
    }
    return arregloMultiplicado;
  }
}
