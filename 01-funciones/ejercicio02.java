import java.util.Scanner;

public class ejercicio02 {
  // Creamos la clase Scanner para que pueda ser utilizada por todos los metodos
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // Pedir al usuario que ingrese un numero
    System.out.print("Ingrese un numero: ");

    // Leer el numero ingresado por el usuario
    int numero = sc.nextInt();

    // Imprimir el numero por pantalla
    System.out.println("El doble de " + numero + " es: " + numero * 2);
    System.out.println("El triple de " + numero + " es: " + numero * 3);

    sc.close();
  }
}