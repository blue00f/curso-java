import java.util.Scanner;

public class ejercicioPalindromo {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese una frase: ");
    String str = sc.nextLine(), reverseStr = "";

    int strLength = str.length();

    for (int i = (strLength - 1); i >= 0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str + " es una cadena palindroma.");
    } else {
      System.out.println(str + " no es una cadena palindroma.");
    }
  }
}