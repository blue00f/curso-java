package threads;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientString {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Ingrese un texto , se devolvera el reverso ");
			String Texto = in.nextLine();

			try (Socket socket = new Socket("localhost", 12345);
					Scanner input = new Scanner(socket.getInputStream());
					PrintWriter output = new PrintWriter(socket.getOutputStream())) {

				// 1.- Se envía el tamaño de los vectores al servidor.
				output.println(Texto);

				// Se asegura que la información se envíe al servidor.
				output.flush();

				// 4.- Se espera por el resultado que envía el servidor.
				String TextoReverso = input.nextLine();

				// Se imprime por pantalla el resultado.
				System.out.println(String.format("El reverso es" + TextoReverso));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}