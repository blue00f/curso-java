import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        System.out.println(mostrarMes(numero));

        scanner.close();
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
