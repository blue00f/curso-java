import java.util.Scanner;

public class ejercicio12 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese un numero: ");
    int numero = sc.nextInt();

    System.out.println("El factorial de " + numero + " es: " + calcularFactorial(numero));

    sc.close();
  }

  public static int calcularFactorial(int numero) {
    if (numero == 0 || numero == 1) {
      return 1;
    } else {
      int factorial = 1;
      for (int i = 2; i <= numero; i++) {
        factorial *= i;
      }
      return factorial;
    }
  }
}
