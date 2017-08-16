package pl.sda.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServerTCP {

	public static void main(String[] args) {

		final int LOCAL_PORT = 55555;
		int REMOTE_PORT;

		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(LOCAL_PORT);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Tworzymy lokalny socket i akceptujemy serverSocket

		Socket connectedSocket = null;
		for (int i = 0; i < 10; i++) {

			try {
				connectedSocket = serverSocket.accept();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		InputStream inputStream = null;
		try {
			inputStream = connectedSocket.getInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}

		OutputStream outputStream = null;
		try {
			outputStream = connectedSocket.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}

		byte[] buffer = new byte[1500];


		int counter = 0;

		try {
			counter = inputStream.read(buffer);
			if (counter > -1) {
				String resultMessage = new String(buffer, 0, counter);
				System.out.println(resultMessage);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String textMessage = "HTTP/1.1 200 OK\r\n\r\n<html>\r\n<head>\r\n</head>\r\n<body>\r\n<center>\r\nWitam Na Serwerze Macieja z pomoca Lukasza\r\n</center>\r\n<br><br>\r\n<center> <b> SIEMKA SIEMKA :-)</b>\r\n</body>\r\n</html>";

		byte[] byteMessage = textMessage.getBytes();

		try {
			outputStream.write(byteMessage);
		} catch (IOException e1) {
			e1.printStackTrace();
		}


		try {
			inputStream.close();
			outputStream.close();
			outputStream.flush();
			connectedSocket.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
