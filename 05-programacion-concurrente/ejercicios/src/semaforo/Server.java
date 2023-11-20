package semaforo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try (ServerSocket listening = new ServerSocket(12345)) {
			System.out.println("Iniciando control de semáforos.");

			while (true) {
				Socket socket = listening.accept();
				System.out.println("Sensor de vehiculo DETECTADO");

				// Implementación de multithreads y lógica del semáforo
				EchoClientHandler handler = new EchoClientHandler(socket);
				handler.handle();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}