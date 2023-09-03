import java.util.Scanner;

public class ejercicio2
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

        int posicionMayor = encontrarPosicionMayor(numeros);
        System.out.println("La posicion del elemento mayor es: " + posicionMayor);
        scanner.close();
	}

    private static int encontrarPosicionMayor(int array[]) {
        int posicionMayor = 0;
        int mayor = array[0];

        for(int i = 1; i < array.length; i++) {
            if(array[i] > mayor) {
                mayor = array[i];
                posicionMayor = i;
            }
        }
        return posicionMayor;
    }    
}
