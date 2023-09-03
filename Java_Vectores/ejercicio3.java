import java.util.Scanner;

public class ejercicio3
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del array: ");
        int cantidadElementos = scanner.nextInt();

        int[] numeros = new int[cantidadElementos];

        for (int i = 0; i < cantidadElementos; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        if(sonPositivos(numeros) == true) {
            System.out.println("Son positivos");
        }
        else {
            System.out.println("No todos son positivos");
        }
        scanner.close();
	}

    private static boolean sonPositivos(int array[]) {
        for(int i = 1; i < array.length; i++) {
            if(array[i] < 0) {
                return false;
            }
        }
        return true;
    }    
}
