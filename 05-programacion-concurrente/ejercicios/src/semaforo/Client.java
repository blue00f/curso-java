package semaforo;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		int contadorVehiculos = 1;
		while (true) {
			simulateClientConnection(contadorVehiculos);
			int tiempoEspera = 1000;
			try {
				Thread.sleep(tiempoEspera);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			contadorVehiculos++;
		}
	}

	private static void simulateClientConnection(int contadorVehiculos) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Sensor de vehículo " + contadorVehiculos + " activado");
			boolean solicitarCambioSemaforo = true;

			try (Socket socket = new Socket("localhost", 12345);
					Scanner input = new Scanner(socket.getInputStream());
					PrintWriter output = new PrintWriter(socket.getOutputStream())) {

				output.println(solicitarCambioSemaforo);
				output.flush();

				String colorSemaforo = input.nextLine();

				System.out.println(String.format(" - Color del semáforo " + colorSemaforo));

				if ("Verde".equalsIgnoreCase(colorSemaforo)) {
					System.out.println("El semáforo está en verde. Finalizando la conexión.");
					System.exit(0);
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
