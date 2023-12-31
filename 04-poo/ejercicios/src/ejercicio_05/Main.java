package ejercicio_05;

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter number of columns: ");
		int columns = sc.nextInt();
		
		Matrix matrix = new Matrix(rows,columns);
		System.out.println("Size of matrix: A[" + matrix.getRows() + "][" + matrix.getColumns() + "]");
		
		System.out.println("Initialization at 0");
		System.out.println("A[0][0] = " + matrix.getValueByIndex(0, 0));
		System.out.println("A[0][1] = " + matrix.getValueByIndex(0, 1));
		
		for (int i = 0; i < matrix.getRows(); i++) {
			for (int j = 0; j < matrix.getColumns(); j++) {
				System.out.print("Enter value for matrix" + "[" + i + "][" + j + "]: ");
				int value = sc.nextInt();
				matrix.setValueByIndex(i, j, value);
			}
		}
		
		for (int i = 0; i < matrix.getRows(); i++) {
			for (int j = 0; j < matrix.getColumns(); j++) {
				System.out.println("A[" + i + "][" + j + "] = " + matrix.getValueByIndex(i,j));
			}
		}
	}

}
