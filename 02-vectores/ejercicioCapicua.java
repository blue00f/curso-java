import java.util.Arrays;
import java.util.Scanner;

public class ejercicioCapicua {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese la cantidad de elementos del arreglo: ");
    int cantidadElementos = sc.nextInt();

    int[] arreglo = generarArreglo(cantidadElementos);

    sc.close();

    System.out.println("Vector con orden original: " + Arrays.toString(arreglo));
    System.out.println("Vector con orden inverso: " + Arrays.toString(obtenerInversaDelArreglo(arreglo)));
    if (esCapicua(arreglo) == true) {
      System.out.println("El vector es capicua");
    } else {
      System.out.println("El vector no es capicua");
    }
  }

  public static int[] generarArreglo(int cantidadElementos) {
    int[] arreglo = new int[cantidadElementos];

    for (int i = 0; i < cantidadElementos; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      arreglo[i] = sc.nextInt();
    }

    return arreglo;
  }

  public static int[] obtenerInversaDelArreglo(int[] arreglo) {
    int[] arregloInverso = new int[arreglo.length];
    for (int i = 0; i < arreglo.length; i++) {
      arregloInverso[i] = arreglo[arreglo.length - 1 - i];
    }
    return arregloInverso;
  }

  public static boolean esCapicua(int[] arregloOriginal) {
    int[] arregloInverso = obtenerInversaDelArreglo(arregloOriginal);
    int length = arregloOriginal.length;
    int contador = 0;

    for (int i = 0; i < length; i++) {
      if (arregloInverso[i] == arregloOriginal[i]) {
        contador++;
      }
    }

    if (contador == length) {
      return true;
    } else {
      return false;
    }
  }
}
