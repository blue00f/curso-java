import java.util.Scanner;

public class ejercicio03 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese el numero 1: ");
    int numero1 = sc.nextInt();

    System.out.print("Ingrese el numero 2: ");
    int numero2 = sc.nextInt();

    System.out.println("Suma: " + (numero1 + numero2));
    System.out.println("Resta: " + (numero1 - numero2));
    System.out.println("Multiplicacion: " + (numero1 * numero2));

    if (numero2 == 0) {
      System.out.println("No se puede realizar la division");
    } else {
      System.out.println("Division: " + (numero1 / numero2));
    }

    sc.close();
  }
}