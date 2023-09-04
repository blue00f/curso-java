import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale; // lo uso para usar el punto como separador de decimales

public class ejercicio08 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    sc.useLocale(Locale.US); // aca se setea el pais para aceptar los puntos como decimales

    System.out.print("Ingrese la cantidad de elementos del arreglo: ");
    int cantidadElementos = sc.nextInt();

    float[] vector = generarArreglo(cantidadElementos);

    System.out.print("Ingresa el valor del escalar: ");
    float escalar = sc.nextFloat();

    System.out.println("Arreglo ingresado: " + Arrays.toString(vector));
    System.out.println(
        "Arreglo multiplicado por " + escalar + ": "
            + Arrays.toString(productoEscalarArray(vector, escalar)));
  }

  public static float[] generarArreglo(int cantidadElementos) {
    float[] arreglo = new float[cantidadElementos];

    for (int i = 0; i < cantidadElementos; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      arreglo[i] = sc.nextFloat();
    }

    return arreglo;
  }

  public static float[] productoEscalarArray(float[] vector, float escalar) {
    float[] vectorMultiplicado = new float[vector.length];

    for (int i = 0; i < vector.length; i++) {
      vectorMultiplicado[i] = vector[i] * escalar;
    }

    return vectorMultiplicado;
  }
}
