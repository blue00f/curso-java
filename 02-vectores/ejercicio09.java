import java.util.Scanner;
import java.util.Arrays;

public class ejercicio09 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Calculo de escalar entre dos vectores, ingresa la cantidad de elementos: ");
    int cantidadElementos = sc.nextInt();

    System.out.println("Vector A");
    float[] vector1 = generarArreglo(cantidadElementos);
    System.out.println("Vector B");
    float[] vector2 = generarArreglo(cantidadElementos);

    System.out.println("A = " + Arrays.toString(vector1));
    System.out.println("B = " + Arrays.toString(vector2));
    System.out.println("A * B = " + obtenerEscalarEntreDosVectores(vector1, vector2));
  }

  public static float[] generarArreglo(int cantidadElementos) {
    float[] arreglo = new float[cantidadElementos];

    for (int i = 0; i < cantidadElementos; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      arreglo[i] = sc.nextFloat();
    }

    return arreglo;
  }

  public static float obtenerEscalarEntreDosVectores(float[] vector1, float[] vector2) {
    float escalar = 0;

    for (int i = 0; i < vector1.length; i++) {
      escalar += (vector1[i] * vector2[i]);
    }

    return escalar;
  }
}
