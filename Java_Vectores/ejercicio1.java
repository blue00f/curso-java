import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del array: ");
        int cantidadElementos = scanner.nextInt();

        int[] numeros = new int[cantidadElementos];

        for (int i = 0; i < cantidadElementos; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int posicionMenor = encontrarPosicionMenor(numeros);
        System.out.println("La posicion del elemento menor es: " + posicionMenor);
        scanner.close();
    }

    private static int encontrarPosicionMenor(int array[]) {
        int posicionMenor = 0;
        int menor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
                posicionMenor = i;
            }
        }
        return posicionMenor;
    }
}
