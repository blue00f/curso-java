package threads;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClientHandler extends Thread { // texto reverse multi

	public Socket socket;

	public EchoClientHandler(Socket socket) {
		this.socket = socket;
	}

	public void handle() {
		this.start();
	}

	public void run() {

		try (Scanner in = new Scanner(socket.getInputStream());
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
			String text = in.nextLine();

			if (text != null) {
				String text2 = reverse(text);
				System.out.println("EchoServer echoing text: " + text2);

				out.println(text2);
				out.flush();
			}

		} catch (Exception e) {
			System.err.println("Error communicating with client");
			e.printStackTrace();
		}

		if (this.socket != null) {
			try {
				this.socket.close();
			} catch (IOException e) {
				System.err.println("Error closing socket.");
			} finally {
				this.socket = null;
			}
		}
	}

	public static String reverse(String text) {
		String text2 = null;
		char[] cText = new char[text.length()];

		cText = text.toCharArray();
		char z = ' ';

		for (int i = 0; i < text.length() / 2; i++) {
			System.out.println(cText[i]);
			z = cText[i];
			cText[i] = cText[text.length() - i - 1];
			cText[text.length() - i - 1] = z;
		}

		text2 = String.valueOf(cText);

		return text2;
	}
}