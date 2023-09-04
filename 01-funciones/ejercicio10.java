import java.util.Scanner;

public class ejercicio10 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i + " = " + decimalABinario(i));
    }

    sc.close();
  }

  public static String decimalABinario(int numero) {
    StringBuilder binario = new StringBuilder();

    if (numero == 0) {
      binario.append(0);
    }

    while (numero > 0) {
      int residuo = numero % 2;
      binario.insert(0, residuo);
      numero = numero / 2;
    }

    return binario.toString();
  }
}
