package websocket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {

		try(ServerSocket listeningSocket = new ServerSocket(12345)) {
			// El servidor entra en un ciclo infinito. Se debería
			// utilizar una mejor estrategia de salida. Alcanza para
			// demostrar los conceptos de sockets.
			while (true) {
				// El servidor le pide al socket en el cual escucha
				// que le devuelva una nueva conexión con un cliente.
				System.out.println("Server waiting for connections on port 12345");

				try (Socket socket = listeningSocket.accept()) {
					System.out.println("Server: Client connected");
					System.out.println("Client: " + socket.toString());

					handleClient(socket);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void handleClient(Socket socket) {
		// Una vez que se tiene el socket, se tienen que obtener
		// los canales de comunicación que utiliza el mismo. Esto
		// permite al servidor leer y escribir del socket como si
		// estuviera leyendo del teclado y escribiendo a la consola.
		try(Scanner input = new Scanner(socket.getInputStream());
			PrintWriter output = new PrintWriter(socket.getOutputStream())) {
			
			////////////////////////////////////////////////////////////////////////////////////////////
			// El protocolo que tienen que cumplir es el siguiente:
			// 1.- El cliente envía al servidor la cantidad de elementos que van a contener los vectores.
			// 2.- El cliente envía uno a uno los elementos del primer vector.
			// 3.- El cliente envía uno a uno los elementos del segundo vector.
			// 4.- El servidor contesta con el resultado del producto escalar.
			////////////////////////////////////////////////////////////////////////////////////////////

			// 1.- Leer tamaño de los vectores.
			int size = input.nextInt()+5;

			// 4.- El servidor envía el resultado al cliente.
			output.println(size);

			// Se envía el resultado al cliente.
			output.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}