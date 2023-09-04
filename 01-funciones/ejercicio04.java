import java.util.Scanner;

public class ejercicio04 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese un numero: ");
    int numero = sc.nextInt();

    if (numero % 2 == 0) {
      System.out.println("El numero " + numero + " es PAR");
    } else {
      System.out.println("El numero " + numero + " es IMPAR");
    }

    sc.close();
  }
}