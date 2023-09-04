import java.util.Scanner;
import java.util.Arrays;

public class ejercicio10 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Calculo de escalar entre un vector A y su inversa, ingresa la cantidad de elementos: ");
    int cantidadElementos = sc.nextInt();

    System.out.println("Vector A");
    float[] vector1 = obtenerArreglo(cantidadElementos);
    float[] vector2 = obtenerInversaDelVector(vector1);

    System.out.println("A = " + Arrays.toString(vector1));
    System.out.println("B = " + Arrays.toString(vector2));
    System.out.println("A * B = " + obtenerEscalarEntreDosVectores(vector1, vector2));
  }

  public static float[] obtenerArreglo(int cantidadElementos) {
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

  public static float[] obtenerInversaDelVector(float[] arreglo) {
    float[] arregloInverso = new float[arreglo.length];
    for (int i = 0; i < arreglo.length; i++) {
      arregloInverso[i] = arreglo[arreglo.length - 1 - i];
    }
    return arregloInverso;
  }
}
