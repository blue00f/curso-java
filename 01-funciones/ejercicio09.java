import java.util.Scanner;

public class ejercicio09 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese un numero: ");
    int numero = sc.nextInt();

    if (esPrimo(numero)) {
      System.out.println(numero + " es un numero PRIMO");
    } else {
      System.out.println(numero + " no es un numero PRIMO");
    }

    sc.close();
  }

  private static boolean esPrimo(int numero) {
    if (numero <= 1) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(numero); i++) {
      if (numero % i == 0) {
        return false;
      }
    }

    return true;
  }
}
