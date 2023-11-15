package websocket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// El cliente debe pedirle al usuario el tamaño que tendrán los vectores.
		// Luego, deberá pedirle al usuario que ingrese ambos vectores.
		// Le enviará los vectores al servidor, esperará por la respuesta del servidor,
		// y le mostrará la respuesta al usuario.

		try(Scanner in = new Scanner(System.in)) {

			System.out.print("Ingrese el tamaño de los vectores: ");
			int size = in.nextInt();


			// Se le enviará la información al servidor.
			// Se crean el socket y los objetos que nos ayudan a leer y escribir sobre el socket.
			try(Socket socket = new Socket("localhost", 12345);
				Scanner input = new Scanner(socket.getInputStream());
				PrintWriter output = new PrintWriter(socket.getOutputStream())) {
				
				////////////////////////////////////////////////////////////////////////////////////////////
				// El protocolo que tienen que cumplir es el siguiente:
				// 1.- El cliente envía al servidor la cantidad de elementos que van a contener los vectores.
				// 2.- El cliente envía uno a uno los elementos del primer vector.
				// 3.- El cliente envía uno a uno los elementos del segundo vector.
				// 4.- El servidor contesta con el resultado del producto escalar.
				////////////////////////////////////////////////////////////////////////////////////////////

				// 1.- Se envía el tamaño de los vectores al servidor.
				output.println(size);

				// Se asegura que la información se envíe al servidor.
				output.flush();

				// 4.- Se espera por el resultado que envía el servidor.
				int tamanio = input.nextInt();

				// Se imprime por pantalla el resultado.
				System.out.println(String.format("El tamaño del vector es "+ tamanio));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}