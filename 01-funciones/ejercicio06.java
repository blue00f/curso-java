import java.util.Scanner;

public class ejercicio06 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese el numero 1: ");
    int numero1 = sc.nextInt();

    System.out.print("Ingrese el numero 2: ");
    int numero2 = sc.nextInt();

    System.out.print("Ingrese el numero 3: ");
    int numero3 = sc.nextInt();

    if (numero1 > numero2 && numero1 > numero3) {
      System.out.println("El numero 1: " + numero1 + " es el numero MAYOR");
    } else if (numero2 > numero1 && numero2 > numero3) {
      System.out.println("El numero 2: " + numero2 + " es el numero MAYOR");
    } else if (numero3 > numero1 && numero3 > numero2) {
      System.out.println("El numero 3: " + numero3 + " es el numero MAYOR");
    } else if (numero1 == numero2 && (numero3 < numero1 && numero3 < numero2)) {
      System.out.println("Los numeros 1 y 2: " + numero1 + ", " + numero2 + " son los numeros MAYORES");
    } else if (numero2 == numero3 && (numero1 < numero2 && numero1 < numero3)) {
      System.out.println("Los numeros 2 y 3: " + numero2 + ", " + numero3 + " son los numeros MAYORES");
    } else if (numero1 == numero3 && (numero2 < numero1 && numero2 < numero3)) {
      System.out.println("Los numeros 1 y 3: " + numero1 + ", " + numero3 + " son los numeros MAYORES");
    } else {
      System.out.println("Todos son iguales");
    }

    if (numero1 < numero2 && numero1 < numero3) {
      System.out.println("El numero 1: " + numero1 + " es el numero MENOR");
    } else if (numero2 < numero1 && numero2 < numero3) {
      System.out.println("El numero 2: " + numero2 + " es el numero MENOR");
    } else if (numero3 < numero1 && numero3 < numero2) {
      System.out.println("El numero 3: " + numero3 + " es el numero MENOR");
    } else if (numero2 == numero3 && (numero1 > numero2 && numero1 > numero3)) {
      System.out.println("Los numeros 2 y 3: " + numero2 + ", " + numero3 + " son los numeros MENORES");
    } else if (numero1 == numero3 && (numero2 > numero1 && numero2 > numero3)) {
      System.out.println("Los numeros 1 y 3: " + numero1 + ", " + numero3 + " son los numeros MENORES");
    }

    sc.close();
  }
}