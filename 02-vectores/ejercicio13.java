import java.util.Scanner;
import java.util.Arrays;

public class ejercicio13 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Buscar un numero usando busqueda binaria\nIngresa la cantidad de elementos: ");
    int cantidadElementos = sc.nextInt();

    System.out.println("Vector A");
    int[] vector = obtenerArreglo(cantidadElementos);
    int[] vectorAscendente = obtenerAscendenteDeVector(vector);

    System.out.println("A = " + Arrays.toString(vectorAscendente));

    System.out.print("Ingresa el numero a buscar: ");
    int numero = sc.nextInt();
    int posicion = buscarNumero(vectorAscendente, numero);

    if (posicion == -1) {
      System.out.print("El numero buscado no se encuentra en el vector");
    } else {
      System.out.println("Numero = " + numero);
      System.out.println("Posicion = " + posicion);
    }
  }

  public static int[] obtenerArreglo(int cantidadElementos) {
    int[] arreglo = new int[cantidadElementos];

    for (int i = 0; i < cantidadElementos; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      arreglo[i] = sc.nextInt();
    }

    return arreglo;
  }

  public static int[] obtenerAscendenteDeVector(int[] vector) {
    int[] vectorAscendente = vector.clone();
    Arrays.sort(vectorAscendente);
    return vectorAscendente;
  }

  // Algoritmo binary search (descartar mitades hasta encontrar el numero)
  public static int buscarNumero(int[] vector, int numero) {
    int l = 0, r = vector.length - 1;
    while (l <= r) {
      int m = l + (r - l) / 2;

      // Checkear si el 'numero' esta en la mitad
      if (vector[m] == numero)
        return m;

      // Si 'numero' es grande, ignora la mitad izquierda
      if (vector[m] < numero)
        l = m + 1;

      // Si 'numero' es chico, ignora la mitad derecha
      else
        r = m - 1;
    }

    // Si el numero no esta en el vector, retorna -1
    return -1;
  }
}
