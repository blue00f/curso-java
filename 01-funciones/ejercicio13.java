import java.util.Scanner;

public class ejercicio13 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese un numero: ");
    int numero = sc.nextInt();

    System.out.println(mostrarMes(numero));

    sc.close();
  }

  public static String mostrarMes(int numeroMes) {
    String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
        "Octubre", "Noviembre", "Diciembre" };

    if (numeroMes >= 1 && numeroMes <= 12) {
      return meses[numeroMes - 1];
    } else {
      return "Mes invalido";
    }
  }
}
