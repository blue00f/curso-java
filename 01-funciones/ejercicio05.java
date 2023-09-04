import java.util.Scanner;

public class ejercicio05 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese un numero: ");
    int numero = sc.nextInt();

    if (numero > 0) {
      System.out.println(numero + " es POSITIVO");
    } else if (numero < 0) {
      System.out.println(numero + " es NEGATIVO");
    } else {
      System.out.println(numero + " es CERO");
    }

    sc.close();
  }
}