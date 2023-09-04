import java.util.Scanner;

public class ejercicio07 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int suma = 0;
    int cantidadDeNumeros = 10;
    float promedio = 0;

    for (int i = 0; i < cantidadDeNumeros; i++) {
      System.out.print("Ingrese el número " + (i + 1) + ": ");
      int numero = sc.nextInt();
      suma += numero;
    }

    promedio = (float) suma / cantidadDeNumeros;
    System.out.println("El promedio es: " + promedio);

    sc.close();
  }
}