import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " = " + decimalABinario(i));
        }

        scanner.close();
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
