import java.util.Scanner;

public class ejercicio11 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese el primer numero: ");
    int numero1 = sc.nextInt();

    System.out.print("Ingrese el segundo numero: ");
    int numero2 = sc.nextInt();

    System.out.println(
        "El maximo comun divisor de " + numero1 + " y " + numero2 + " es: " + calcularMCD(numero1, numero2));

    sc.close();
  }

  public static int calcularMCD(int numero1, int numero2) {
    while (numero2 != 0) {
      int temp = numero2;
      numero2 = numero1 % numero2;
      numero1 = temp;
    }
    return numero1;
  }
}
