import java.util.Scanner;

public class ejercicio08 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingresa un numero para generar su tabla de multiplicar: ");
    int numero = sc.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(numero + " * " + i + " = " + (numero * i));
    }

    sc.close();
  }
}