import java.util.Scanner;

public class ejercicio14 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    contarNumeros();
  }

  public static void contarNumeros() {
    int numero;
    int positivos = 0;
    int negativos = 0;
    int ceros = 0;

    do {
      System.out.print("Ingrese un numero entero (0 para salir): ");
      numero = sc.nextInt();

      if (numero > 0) {
        positivos++;
      } else if (numero < 0) {
        negativos++;
      } else {
        ceros++;
      }
    } while (numero != 0);

    mostrarCantidadNumeros(positivos, negativos, ceros);
    sc.close();
  }

  public static void mostrarCantidadNumeros(int positivos, int negativos, int ceros) {
    System.out.println("Cantidad de numeros positivos: " + positivos);
    System.out.println("Cantidad de numeros negativos: " + negativos);
    System.out.println("Cantidad de ceros: " + ceros);
  }
}
