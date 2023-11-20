package semaforo;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClientHandler extends Thread {
	private static final int DURACION_VERDE = 6000; // 60000ms = 60s
	private static final int DURACION_ROJO = 6000; // 30000ms = 30s

	private static boolean deteccionVehiculo = false;
	private static boolean semaforoEnVerde = false;
	private static long tiempoInicioEstadoActual = System.currentTimeMillis();

	public Socket socket;

	public EchoClientHandler(Socket socket) {
		this.socket = socket;
	}

	public void handle() {
		this.start();
	}

	// Polimorfismo con el método 'run', heredado de 'threads'
	public void run() {
		try (Scanner in = new Scanner(socket.getInputStream());
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
			deteccionVehiculo = in.nextBoolean();

			if (deteccionVehiculo) {
				while (true) {
					String colorSemaforo = enviarColorSemaforo();
					System.out.println("Estado del semáforo: " + colorSemaforo);

					out.println(colorSemaforo);
					out.flush();

					int tiempoEspera = 1000;
					try {
						Thread.sleep(tiempoEspera);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		} catch (Exception e) {
			System.err.println("Error al conectar con el sensor de vehiculo.");
			e.printStackTrace();
		}

		// Finalizar la conexión de forma segura
		if (this.socket != null) {
			try {
				this.socket.close();
			} catch (IOException e) {
				System.err.println("Error al cerrar el socket.");
			} finally {
				this.socket = null;
			}
		}
	}

	public static String enviarColorSemaforo() {
		long tiempoTranscurrido = System.currentTimeMillis() - tiempoInicioEstadoActual;

		if (semaforoEnVerde && tiempoTranscurrido >= DURACION_VERDE) {
			semaforoEnVerde = false;
			deteccionVehiculo = false;
			tiempoInicioEstadoActual = System.currentTimeMillis();
		} else if (!semaforoEnVerde && tiempoTranscurrido >= DURACION_ROJO && deteccionVehiculo) {
			semaforoEnVerde = true;
			tiempoInicioEstadoActual = System.currentTimeMillis();
		}

		if (semaforoEnVerde) {
			return "Verde";
		} else {
			return "Rojo";
		}
	}
}